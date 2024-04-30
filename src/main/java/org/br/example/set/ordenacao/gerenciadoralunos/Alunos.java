package org.br.example.set.ordenacao.gerenciadoralunos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    private long matricula;
    private String nome;
    private double media;

    public Alunos(long matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString() {
        return "\nAlunos{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }
}

    class CompratorPorNotas implements Comparator<Alunos> {

        @Override
        public int compare(Alunos a1, Alunos a2) {
            return Double.compare(a2.getMedia(), a1.getMedia());
        }
    }