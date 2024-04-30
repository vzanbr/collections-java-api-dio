package org.br.example.set.operacoes;

public class ExibindoConvidados {
    public static void main(String[] args) {

        ConjuntoCovidados covidados = new ConjuntoCovidados();

        covidados.adicionarConvidado("Gabriel", 150);
        covidados.adicionarConvidado("Fernando", 250);
        covidados.adicionarConvidado("Fernando Alves", 240);
        covidados.adicionarConvidado("Rodrigo", 350);
        covidados.adicionarConvidado("Carlos", 120);

        covidados.removerConvidadoPorConvite(120);

        covidados.exibirConvidados();

        System.out.println( "Existem " + covidados.contarConvidados() + " Covidados");
    }
}
