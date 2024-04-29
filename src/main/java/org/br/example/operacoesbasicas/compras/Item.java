package org.br.example.operacoesbasicas.compras;

public class Item {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Item() {
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }
    public Integer getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}