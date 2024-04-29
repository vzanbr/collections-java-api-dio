package org.br.example.operacoesbasicas.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> carrinho;

    public CarrinhoDeCompra() {
        this.carrinho = new ArrayList<>();
    }

    public void adcItem(String nome, Double preco, Integer quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();
        for (Item item : carrinho) {
            if(item.getNome().equalsIgnoreCase(nome)){
                removerItem.add(item);
            }
        }
        carrinho.removeAll(removerItem);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


    public void exibirItens(){
        System.out.println(carrinho);
    }
}