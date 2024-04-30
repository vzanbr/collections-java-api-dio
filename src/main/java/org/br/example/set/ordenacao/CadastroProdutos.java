package org.br.example.set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos (){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produtos(nome, cod, preco, quantidade));
    }

        public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtoPorNome = new TreeSet<>(produtosSet);
        return  produtoPorNome;
    }
    public Set<Produtos> exibirProdutosPorPreco() {
        Set<Produtos> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtosSet.isEmpty()) {
            produtoPorPreco.addAll(produtosSet);
            return produtoPorPreco;
        } else {
            throw  new RuntimeException("O conjunto esta vazio");
        }
    }
    public Set<Produtos> exibirProdutosPorPreco2() {
        Set<Produtos> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtoPorPreco.addAll(produtosSet);
            return produtoPorPreco;
    }
}