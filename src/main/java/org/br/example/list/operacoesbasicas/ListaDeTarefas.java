package org.br.example.list.operacoesbasicas;

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
}