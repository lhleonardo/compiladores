package br.ufla.compiladores.models;

public class Atributo extends Identificador {

	private String tipo;
	private String modificador;

	private String parent;

	public Atributo(String name, String tipo, String modificador) {
		super(name);
		this.tipo = tipo;
		this.modificador = modificador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModificador() {
		return modificador;
	}

	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return String.format("ATT[%s, %s, %s]", getModificador(), getNome(), getParent());
	}

}
