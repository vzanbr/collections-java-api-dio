package org.br.example.operacoesbasicas.compras;

public class Loja {

    public static void main(String[] args) {
        CarrinhoDeCompra compra = new CarrinhoDeCompra();

        compra.adcItem("Carro", 500.5, 5);
        compra.adcItem("Moto", 50.5, 5);
        compra.adcItem("MotoS2", 50.5, 51);
        compra.removerItem("MotoS2");
        compra.exibirItens();

        System.out.println("O valor total é " + compra.calcularValorTotal());
    }
}
