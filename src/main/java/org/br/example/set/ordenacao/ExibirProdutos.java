package org.br.example.set.ordenacao;

public class ExibirProdutos {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Smartphone", 1000, 10);
        cadastroProdutos.adicionarProduto(2, "Notebook", 1500, 5);
        cadastroProdutos.adicionarProduto(1, "Mouse", 30, 20);
        cadastroProdutos.adicionarProduto(4, "Teclado", 50, 15);


        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("PRECO");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
//        System.out.println("21");
//        System.out.println(cadastroProdutos.exibirProdutosPorPreco2());
    }
}