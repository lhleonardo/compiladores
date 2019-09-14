package br.ufla.compiladores.scanner.table;

public class IdentifierType {

	private String name;

	public IdentifierType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
