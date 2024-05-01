package org.br.example.map.pesquisa.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavra() {
        this.palavrasMap = new HashMap<>();
    }

    public void adcPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirTodasPalavras(){
        System.out.println(palavrasMap);
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontraPalavrasMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }
}
