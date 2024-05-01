package org.br.example.map.pesquisa;

public class ExibirEstoque {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();
        // Calcula e exibe o valor total do estoque
        System.out.println("EXIBIR VALOR TOTAL \n");
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        System.out.println("EXIBIR PRDOUTO MAIS CARO \n");
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        System.out.println("EXIBIR PRDOUTO MAIS BARATO \n");
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        System.out.println("EXIBIR PRDOUTO COM MAIOR QUANTIDADE EM VALOR NO ESTOQUE \n");
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}