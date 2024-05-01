package org.br.example.map.pesquisa.contagem;

public class ExibirContagem {
    public static void main(String[] args) {
        ContagemPalavra contagemLinguagens = new ContagemPalavra();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adcPalavra("Java", 2);
        contagemLinguagens.adcPalavra("Python", 8);
        contagemLinguagens.adcPalavra("JavaScript", 1);
        contagemLinguagens.adcPalavra("C#", 6);

        contagemLinguagens.exibirTodasPalavras();
        contagemLinguagens.removerPalavra("C#");
        contagemLinguagens.exibirTodasPalavras();

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontraPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}