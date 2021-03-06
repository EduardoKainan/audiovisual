package br.com.audiovisual.model;

public class Equipamento {

	private String nome;
	private int codigo;
	private String tipo;
	private Marca marca;
	private String descricao;

	public Equipamento(String nome, int codigo, String tipo, Marca marca, String descricao) {
		this.nome = nome;
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.descricao = descricao;
	}

	public Equipamento() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
