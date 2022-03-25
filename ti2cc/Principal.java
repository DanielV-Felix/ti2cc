package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Produto produto = new Produto(0356, "leite itambe", 5.90, 3000);
		if(dao.inserirProduto(produto) == true) {
			System.out.println("Inserção com sucesso -> " + produto.toString());
		}
		

		//Atualizar usuário
		produto.setEstoque(2997);
		dao.atualizarProduto(produto);

		//Mostrar produto do sexo masculino
		System.out.println("==== Mostrar produtos === ");
		Produto[] produtos = dao.getProdutos();
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
		//Excluir produto
		dao.excluirProduto(produto.getCodigo());
		
		//Mostrar produto
		produtos = dao.getProdutos();
		System.out.println("==== Mostrar produtos === ");		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
		dao.close();
	}
}
