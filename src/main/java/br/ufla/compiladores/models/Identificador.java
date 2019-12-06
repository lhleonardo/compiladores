package br.ufla.compiladores.models;

import br.ufla.compiladores.grammar.table.Location;

public class Identificador {

	private String name;
	private Location location;

	public Identificador(String name) {
		this.name = name;
	}

	public void setLocale(Location location) {
		this.location = location;
	}

	public String getNome() {
		return name;
	}

	public Location getLocalizacao() {
		return location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Identificador other = (Identificador) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
