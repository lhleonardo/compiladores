package br.ufla.compiladores.scanner.table;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import br.ufla.compiladores.scanner.Scanner;

public class SymbolTable {
	private Map<Address, Identifier> symbols;

	public SymbolTable() {
		this.symbols = new HashMap<Address, Identifier>();
	}

	public void add(Address adress, Identifier identifier) {
		this.symbols.put(adress, identifier);
	}

	// encontrar o identificador referenciado ao ENDERECO DE MEMÓRIA (olhar slides)
	// Ex: <Var, aluno> vira <Id, 11302>, sendo que 11302 está na tabela de simbolos
	// mapeado para aluno
	public Identifier getIdentifier(Address adress) {
		return this.symbols.get(adress);
	}

	// Encontrar o endereço de uma variável que está na tabela de simbolo. Util para
	// substituir ocorrências de uma variável já mapeada
	public Address getAdress(Identifier identifier) {
		for (Address adress : this.symbols.keySet()) {
			if (this.symbols.get(adress).equals(identifier)) {
				return adress;
			}
		}

		return null;
	}

	public boolean contains(Address adress) {
		return this.symbols.containsKey(adress);
	}

	public boolean contains(Identifier identifier) {
		return this.symbols.containsValue(identifier);
	}

	public void extractIdentifiers(List<? extends Token> tokens) {
		Token current = null;
		Iterator<? extends Token> iterator = tokens.iterator();

		while (iterator.hasNext()) {
			current = iterator.next();

			if (current.getType() == Scanner.IDENTIFIER || current.getType() == Scanner.INT
					|| current.getType() == Scanner.CHAR || current.getType() == Scanner.BOOLEAN) {
				Token type = current;

				current = iterator.next();

				boolean isArray = false;

				// Array
				if (current.getType() == Scanner.OPEN_BRACKETS) {
					// skip the next token because this will be a CLOSE_BRACKETS. Therefore this is
					// not important
					current = iterator.next();
					current = iterator.next();
					isArray = true;

				}
				// Single Object
				if (current.getType() == Scanner.IDENTIFIER) {
					Identifier identifier = new Identifier(current.getText(),
							new IdentifierType(type.getText() + (isArray ? "[]" : "")));
					identifier.setLocale(Location.of(current.getLine(), current.getCharPositionInLine()));

					this.add(new Address(), identifier);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(String.format("%10s|%10s|%10s|%10s|%s%n", "ID", "Line", "Row", "Type", "Name"));

		for (Address adress : symbols.keySet()) {
			Identifier identifier = symbols.get(adress);
			builder.append(String.format("%10d|%10d|%10d|%10s|%s%n", adress.getValor(),
					identifier.getLocalizacao().getLinha(), identifier.getLocalizacao().getColuna(),
					identifier.getTipo().toString(), identifier.getNome()));
		}

		return builder.toString();
	}

}
