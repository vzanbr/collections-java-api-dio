package org.br.example.pesquisa.numeros;

public class MostrarNumeros {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        System.out.println(somaNumeros.adcNumero(50));
        System.out.println(somaNumeros.adcNumero(100));
        System.out.println(somaNumeros.adcNumero(150));

        System.out.println("O menor numero é " + somaNumeros.encontarMenorNumero());
        System.out.println("O maior numero é " + somaNumeros.encontarMaiorNumero());

        System.out.println("\n" + somaNumeros.exibirNumeros());

        System.out.println("o valor total é " + somaNumeros.calcNumeros());
    }
}
