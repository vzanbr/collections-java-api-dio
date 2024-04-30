package org.br.example.set.pesquisa.lista;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa>  tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adcTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto esta vazio!");
        }
        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas(){
        System.out.println("TAREFAS " + tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Quantidade de Tarefa [" + tarefaSet.size() + "]");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> tarefasConcluida = new HashSet<>();
    for (Tarefa t : tarefaSet) {
        if(t.isConcluido()) {
            tarefasConcluida.add(t);
        }
    }
    return tarefasConcluida;
}
    public Set<Tarefa> obterTarefasPendente(){
        Set<Tarefa> tarefasNaoConcluida = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if(!t.isConcluido()) {
                tarefasNaoConcluida.add(t);
            }
        }
        return tarefasNaoConcluida;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente= t;
                break;
            }
        }
        if(tarefaParaMarcarComoPendente != null){
            if(tarefaParaMarcarComoPendente.isConcluido()) {
                tarefaParaMarcarComoPendente.setConcluido(false);
            }
        } else {
            System.out.println("Tarefa não encontrada ");
        }
    }

    public void limparTodasTarefas(){
        System.out.println("\n");
        tarefaSet.removeAll(tarefaSet);
        System.out.println("TAREFAS LIMPADAS");
    }
}
