package br.ufla.compiladores.scanner.table;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(String.format("%10s|%10s|%10s|%10s|%s%n", "ID", "Line", "Row", "Type", "Name"));

		for (Address adress : symbols.keySet()) {
			Identifier identifier = symbols.get(adress);
			builder.append(String.format("%10d|%10d|%10d|%s%n", adress.getValor(),
					identifier.getLocalizacao().getLinha(), identifier.getLocalizacao().getColuna(), identifier.getNome()));
		}

		return builder.toString();
	}

}
