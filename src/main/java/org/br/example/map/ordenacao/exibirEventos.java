package org.br.example.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class exibirEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Beatriz", "Holly");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 20), "Gabriel", "Holly");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 15), "Fernando", "Holly");

        agendaEventos.exibirAgenda();

        System.out.println("=========");
        agendaEventos.obterProximoEvento();
    }
}
