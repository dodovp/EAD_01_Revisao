package br.com.fiap.beans;

import br.com.fiap.anotacoes.Coluna;

public class Animal {

	@Coluna(nome = "cd_animal", nullable = false)
	private int codigo;

	@Coluna(nome = "qtd_patas", nullable = true)
	private int quantidadePatas;

	@Coluna(nome = "ds_especie", nullable = true)
	private String especie;

	@Coluna(nome = "ds_voador", nullable = true)
	private boolean voador;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isVoador() {
		return voador;
	}

	public void setVoador(boolean voador) {
		this.voador = voador;
	}

}
