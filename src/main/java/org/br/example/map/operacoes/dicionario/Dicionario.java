package org.br.example.map.operacoes.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adcPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra)  {
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println("\n" + dicionarioMap);
    }

    public String exibirPorPalavra(String palavra){
        String palavraPorPalavra = null;
        if(!dicionarioMap.isEmpty()) {
            palavraPorPalavra = dicionarioMap.get(palavra);
        }
        return palavraPorPalavra;
    }
}
