package org.br.example.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valoTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valoTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valoTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorValor) {
                    produtoMaisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() < menorValor) {
                    produtoMaisBarato = p;
                    menorValor = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeEValor = null;
        double maiorValor = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProdutoEmEstoque > maiorValor) {
                    maiorValor = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeEValor = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeEValor;
    }
}
