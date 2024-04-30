package org.br.example.set.operacoes.palavras;

public class ExibirPalavras {
    public static void main(String[] args) {

        ConjuntoPalavrasUnica palavrasUnica = new ConjuntoPalavrasUnica();

        palavrasUnica.adcPalavra("TESTE");
        palavrasUnica.adcPalavra("TESTE2");
        palavrasUnica.adcPalavra("TESTE3");
        palavrasUnica.adcPalavra("TESTE4");

        palavrasUnica.removerPalavra("TESTE3");

        palavrasUnica.exibirTodasPalavras();

        System.out.println(
                "SIM ESSA PALAVRA EXISTE NESSE SET [" + palavrasUnica.verificarPalavra("TESTE") + "]");

    }
}
