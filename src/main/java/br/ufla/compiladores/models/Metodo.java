package br.ufla.compiladores.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Metodo extends Identificador {

	private String modificador;
	private Map<Integer, Parametro> parametros;
	private String retorno;

	private boolean constructor;

	private String parent;

	public Metodo(String name, String modificador, String retorno) {
		super(name);
		this.modificador = modificador;
		this.parametros = new HashMap<>();
		this.retorno = retorno;
		this.constructor = false;
	}

	public Metodo(String name, String modificador) {
		super(name);
		this.modificador = modificador;
		this.parametros = new HashMap<>();
		this.constructor = true;
	}

	public String getModificador() {
		return modificador;
	}

	public void constructor(boolean flag) {
		this.constructor = flag;
	}

	public boolean isConstructor() {
		return constructor;
	}

	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	public String getRetorno() {
		return retorno;
	}

	public void addParametro(Parametro parametro) {
		this.parametros.put(this.parametros.size() + 1, parametro);
	}

	public List<Parametro> getParametros() {
		List<Parametro> parametros = new ArrayList<>();

		Set<Integer> chaves = this.parametros.keySet();

		for (Integer chave : chaves) {
			parametros.add(this.parametros.get(chave));
		}

		return parametros;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getParent() {
		return parent;
	}

	@Override
	public String toString() {
		String parametros = getParametros().toString().replace("[", "(").replace("]", ")");
		return String.format("MET[%s, %s, %s, %s]", getModificador(), getNome(),
				constructor ? "constructor" : getRetorno(), parametros);
	}

}
