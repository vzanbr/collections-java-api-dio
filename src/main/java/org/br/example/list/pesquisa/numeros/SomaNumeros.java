package org.br.example.list.pesquisa.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numeros> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public Integer adcNumero(Integer numero) {
        numerosList.add(new Numeros(numero));
        return numero;
    }

    public int calcNumeros() {
        int valor = 0;
        if(!numerosList.isEmpty()) {
            for (Numeros n : numerosList) {
                int valorNumero = n.getNumeros();
                valor += valorNumero;
            }
            return valor ;
        } else {
            throw new RuntimeException("A lista está sem numeros!");
        }
    }

    public int encontarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosList.isEmpty()){
            for (Numeros n : numerosList) {
                if (n.getNumeros() >= maiorNumero) {
                    maiorNumero = n.getNumeros();
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()) {
            for (Numeros n : numerosList) {
                if(n.getNumeros() <= menorNumero ) {
                    menorNumero = n.getNumeros();
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Numeros> exibirNumeros(){
    return numerosList;
    }
}
