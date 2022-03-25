package com.ti2cc;

public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private int estoque;
	
	public Produto() {
		private int codigo = 0;
		private String nome = "";
		private double preco = 0.0;
		private int estoque = 0;
	}
	
	public Produto(int codigo, String nome, double preco, int estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String preco) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", estoque=" + estoque + "]";
	}	
}
