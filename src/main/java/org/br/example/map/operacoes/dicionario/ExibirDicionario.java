package org.br.example.map.operacoes.dicionario;

public class ExibirDicionario {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adcPalavra("LETRA A", " ALFABETO [a]");
        dicionario.adcPalavra("LETRA B", " ALFABETO [b]");
        dicionario.adcPalavra("LETRA C", " ALFABETO [c]");
        dicionario.adcPalavra("LETRA D", " ALFABETO [d]");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("LETRA B");
        System.out.println("//////");
        dicionario.exibirPalavras();

        dicionario.exibirPorPalavra("LETRA C");

        String palavra = "LETRA C";
        String palavraPesquisa = dicionario.exibirPorPalavra("LETRA C");
        System.out.println("palavra é " + palavra + ": " + palavraPesquisa);
    }
}
