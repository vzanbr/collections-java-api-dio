package org.br.example.set.pesquisa.lista;

public class ExibirTarefas {
    public static void main(String[] args){
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adcTarefa("LIMPAR QUARTO");
        listaTarefas.adcTarefa("LIMPAR BANHEIRO");
        listaTarefas.adcTarefa("LIMPAR SALA");
        listaTarefas.adcTarefa("LIMPAR CASA");

        listaTarefas.removerTarefa("LIMPAR CASA");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();
        System.out.println("================");
        listaTarefas.marcarTarefaConcluida("LIMPAR QUARTO");
        listaTarefas.marcarTarefaConcluida("LIMPAR BANHEIRO");

        System.out.println("TAREFAS OK " + listaTarefas.obterTarefasConcluidas());
        System.out.println("TAREFAS PENDENTE " + listaTarefas.obterTarefasPendente());

        System.out.println("================");
        listaTarefas.limparTodasTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();
    }
}
