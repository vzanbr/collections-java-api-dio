package org.br.example.list.ordencao.numeros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarNumeros2 {
    private List<Integer> numeroList;

    public OrdenarNumeros2() {
        this.numeroList = new ArrayList<>();
    }

    public void adcNumero(int numero) {
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscedente(){
        numeroList.sort(Comparator.naturalOrder());

        return numeroList;
    }
    public List<Integer> ordenarDescendente(){
        numeroList.sort(Comparator.reverseOrder());
        return numeroList;
    }

}
