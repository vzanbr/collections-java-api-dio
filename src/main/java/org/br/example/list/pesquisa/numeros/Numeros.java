package org.br.example.list.pesquisa.numeros;

public class Numeros {
    private Integer numeros;

    public Numeros(Integer numeros) {
        this.numeros = numeros;
    }

    public Integer getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numeros=" + numeros +
                '}';
    }
}
