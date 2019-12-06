package br.ufla.compiladores.models;

import java.util.ArrayList;

public class Classe extends Identificador {

	private String modificador;
	private String parent;
	private ArrayList<Metodo> metodos;
	private ArrayList<Atributo> atributos;

	public Classe(String name) {
		super(name);
		this.metodos = new ArrayList<Metodo>();
		this.atributos = new ArrayList<Atributo>();
	}

	public void addMethod(Metodo metodo) {
		metodo.setParent(getNome());
		this.metodos.add(metodo);
	}

	public void addAtributo(Atributo atributo) {
		atributo.setParent(getNome());
		this.atributos.add(atributo);
	}

	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	public String getModificador() {
		return modificador;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getParent() {
		return parent;
	}

	public ArrayList<Atributo> getAtributos() {
		return atributos;
	}

	public ArrayList<Metodo> getMetodos() {
		return metodos;
	}

	@Override
	public String toString() {
		StringBuilder atributos = new StringBuilder(), metodos = new StringBuilder();

		atributos.append("(");
		for (int i = 0; i < this.atributos.size(); i++) {
			atributos.append(this.atributos.get(i).getNome());
			atributos.append(":");
			atributos.append(this.atributos.get(i).getTipo());

			if (i != this.atributos.size() - 1) {
				atributos.append(", ");
			}
		}
		atributos.append(")");

		metodos.append("(");
		for (int i = 0; i < this.metodos.size(); i++) {
			metodos.append(this.metodos.get(i).getNome());
			metodos.append(":");
			String retorno = this.metodos.get(i).getRetorno();

			if (retorno == null) {
				metodos.append("()");
			} else {
				metodos.append(retorno);
			}
			if (i != this.metodos.size() - 1) {
				metodos.append(", ");
			}
		}
		metodos.append(")");

		if (getParent() == null || getParent().isEmpty()) {
			return String.format("CLA[%s, %s, extends Object, attr: %s, meth: %s]", getModificador(), getNome(),
					atributos, metodos);
		}
		return String.format("CLA[%s, %s, extends %s, attr: %s, meth: %s]", getModificador(), getNome(), getParent(),
				atributos, metodos);
	}
}
