package org.br.example.ordencao.numeros;

public class ExibirNumeros {
    public static void main(String[] args) {

        OrdenarNumeros2 ordenarNumeros2 = new OrdenarNumeros2();

        ordenarNumeros2.adcNumero(150);
        ordenarNumeros2.adcNumero(550);
        ordenarNumeros2.adcNumero(350);
        ordenarNumeros2.adcNumero(50);
        ordenarNumeros2.adcNumero(750);
        ordenarNumeros2.adcNumero(70);
        ordenarNumeros2.adcNumero(20);
        ordenarNumeros2.adcNumero(62);

        System.out.println(ordenarNumeros2.ordenarAscedente());
        System.out.println(ordenarNumeros2.ordenarDescendente());

    }
}
