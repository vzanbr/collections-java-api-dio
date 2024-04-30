package org.br.example.list.operacoesbasicas;

public class Biblioteca {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        System.out.println( "Numeo de tarefa é ° " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adcTarefa("TAREFA 1");
        listaDeTarefas.adcTarefa("TAREFA 2");
        listaDeTarefas.adcTarefa("TAREFA 3");
        listaDeTarefas.adcTarefa("TAREFA 3");
        System.out.println( "Numeo de tarefa é ° " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.removerTarefa("TAREFA 3");
        System.out.println( "Numeo de tarefa é ° " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoesTarefas();
    }
}
