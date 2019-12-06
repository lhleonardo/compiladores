package br.ufla.compiladores.grammar.table;

public class Location {

	private int line;
	private int colunm;

	public int getLinha() {
		return line;
	}

	public int getColuna() {
		return colunm;
	}

	private Location(int line, int colunm) {
		this.line = line;
		this.colunm = colunm;
	}

	public static Location of(int line, int colunm) {
		return new Location(line, colunm);
	}

}
