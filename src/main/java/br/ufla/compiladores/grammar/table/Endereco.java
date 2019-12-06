package br.ufla.compiladores.grammar.table;

import java.util.Random;

public class Endereco {
	private int value;

	private static Random generator = new Random();

	public Endereco() {
		this.value = generator.nextInt(500) * generator.nextInt(500);
	}

	public int getValor() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (value != other.value)
			return false;
		return true;
	}
}
