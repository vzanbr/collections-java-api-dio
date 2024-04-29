package org.br.example.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaDeTarefas () {
        this.tarefaList = new ArrayList<>();
    }

    public void adcTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> removerTarefa = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                removerTarefa.add(t);
            }
        }
        tarefaList.removeAll(removerTarefa);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

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