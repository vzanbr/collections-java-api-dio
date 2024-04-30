package org.br.example.set.operacoes.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnica {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnica() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adcPalavra(String palavra){
        palavrasUnicasSet.add(new String(palavra));
    }

    public void removerPalavra(String palavra){
        palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirUnicaPalavra(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("NAO TEM ESSA PALAVRA");
        }
    }

    public void exibirTodasPalavras(){
        System.out.println(palavrasUnicasSet);
    }
}
