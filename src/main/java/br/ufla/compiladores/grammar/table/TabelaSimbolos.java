package br.ufla.compiladores.grammar.table;

import java.util.HashMap;
import java.util.Map;

import br.ufla.compiladores.models.Identificador;

public class TabelaSimbolos {
	private Map<Endereco, Identificador> simbolos;

	public TabelaSimbolos() {
		this.simbolos = new HashMap<Endereco, Identificador>();
	}

	public void add(Endereco address, Identificador identifier) {
		this.simbolos.put(address, identifier);
	}

	// encontrar o identificador referenciado ao ENDERECO DE MEMÓRIA (olhar slides)
	// Ex: <Var, aluno> vira <Id, 11302>, sendo que 11302 está na tabela de simbolos
	// mapeado para aluno
	public Identificador getIdentificador(Endereco adress) {
		return this.simbolos.get(adress);
	}

	// Encontrar o endereço de uma variável que está na tabela de simbolo. Util para
	// substituir ocorrências de uma variável já mapeada
	public Endereco getEndereco(Identificador identifier) {
		for (Endereco adress : this.simbolos.keySet()) {
			if (this.simbolos.get(adress).equals(identifier)) {
				return adress;
			}
		}

		return null;
	}

	public boolean contains(Endereco adress) {
		return this.simbolos.containsKey(adress);
	}

	public boolean contains(Identificador identifier) {
		return this.simbolos.containsValue(identifier);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(String.format("%10s | %s%n", "ID", "Simbolo"));

		for (Endereco adress : simbolos.keySet()) {
			builder.append(String.format("%10d | %s%n", adress.getValor(), simbolos.get(adress)));
		}

		return builder.toString();
	}

}
