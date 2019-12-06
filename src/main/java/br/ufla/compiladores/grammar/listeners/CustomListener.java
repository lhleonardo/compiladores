package br.ufla.compiladores.grammar.listeners;

import java.util.List;

import br.ufla.compiladores.grammar.ScannerBaseListener;
import br.ufla.compiladores.grammar.ScannerParser.ClassDeclarationContext;
import br.ufla.compiladores.grammar.ScannerParser.ClassMemberContext;
import br.ufla.compiladores.grammar.ScannerParser.ClassOptionsContext;
import br.ufla.compiladores.grammar.ScannerParser.ConstructorDeclarationContext;
import br.ufla.compiladores.grammar.ScannerParser.FieldDeclarationContext;
import br.ufla.compiladores.grammar.ScannerParser.FormalParameterContext;
import br.ufla.compiladores.grammar.ScannerParser.MethodDeclarationContext;
import br.ufla.compiladores.grammar.ScannerParser.TypeDeclarationContext;
import br.ufla.compiladores.grammar.table.Endereco;
import br.ufla.compiladores.grammar.table.TabelaSimbolos;
import br.ufla.compiladores.models.Atributo;
import br.ufla.compiladores.models.Classe;
import br.ufla.compiladores.models.Metodo;
import br.ufla.compiladores.models.Parametro;

public class CustomListener extends ScannerBaseListener {

	private TabelaSimbolos table;

	private Classe classe;

	private String modificadorTemporario;

	public CustomListener(TabelaSimbolos table) {
		this.table = table;
	}

	@Override
	public void enterTypeDeclaration(TypeDeclarationContext ctx) {
		modificadorTemporario = ctx.modifiers().getText();
		super.enterTypeDeclaration(ctx);
	}

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		String nome = ctx.IDENTIFIER().getText();
		classe = new Classe(nome);
		classe.setModificador(modificadorTemporario);

		table.add(new Endereco(), classe);
		super.enterClassDeclaration(ctx);
	}

	@Override
	public void enterClassOptions(ClassOptionsContext ctx) {
		if (!ctx.isEmpty()) {
			classe.setParent(ctx.qualifiedIdentifier().getText());
		}
		super.enterClassOptions(ctx);
	}

	@Override
	public void enterClassMember(ClassMemberContext ctx) {
		modificadorTemporario = ctx.modifiers().getText();
		super.enterClassMember(ctx);
	}

	@Override
	public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
		// construtor de classe
		String constructorName = ctx.IDENTIFIER().getText();
		Metodo construtor = new Metodo(constructorName, modificadorTemporario);

		List<FormalParameterContext> parameters = ctx.formalParameters().formalParameter();

		for (FormalParameterContext parameter : parameters) {
			if (!parameter.isEmpty()) {
				String tipo = parameter.type().getText();
				String nome = parameter.IDENTIFIER().getText();

				construtor.addParametro(new Parametro(tipo, nome));
			}
		}

		classe.addMethod(construtor);
		table.add(new Endereco(), construtor);
		super.enterConstructorDeclaration(ctx);
	}

	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		// método de classe

		String methodName = ctx.IDENTIFIER().getText();
		Metodo metodo = new Metodo(methodName, modificadorTemporario, ctx.returnMethod().getText());

		List<FormalParameterContext> parameters = ctx.formalParameters().formalParameter();

		for (FormalParameterContext parameter : parameters) {
			if (!parameter.isEmpty()) {
				String tipo = parameter.type().getText();
				String nome = parameter.IDENTIFIER().getText();

				metodo.addParametro(new Parametro(tipo, nome));
			}
		}
		classe.addMethod(metodo);
		table.add(new Endereco(), metodo);
		super.enterMethodDeclaration(ctx);
	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		// field de classe
		String tipo = ctx.type().getText();

		String variaveis = ctx.variableDeclarators().getText();

		String[] nomes = variaveis.split(",");
		for (String nome : nomes) {
			Atributo atributo = new Atributo(nome, tipo, modificadorTemporario);
			classe.addAtributo(atributo);
			table.add(new Endereco(), atributo);
		}
		super.enterFieldDeclaration(ctx);
	}
}
