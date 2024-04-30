package org.br.example.set.pesquisa.lista;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido(){
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluido(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "\nTarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
