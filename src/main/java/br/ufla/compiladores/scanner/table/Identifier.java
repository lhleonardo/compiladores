package br.ufla.compiladores.scanner.table;

public class Identifier {

	private String name;
	private IdentifierType type;

	private Location location;

	public Identifier(String name, IdentifierType type) {
		this.name = name;
		this.type = type;
	}

	public void setLocale(Location location) {
		this.location = location;
	}

	public String getNome() {
		return name;
	}

	public IdentifierType getTipo() {
		return type;
	}

	public Location getLocalizacao() {
		return location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Identifier other = (Identifier) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
