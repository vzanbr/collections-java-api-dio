package org.br.example.set.ordenacao.gerenciadoralunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos (){
        this.alunosSet = new HashSet<>();
    }

    public void addAluno (String nome, long matricula, double media){
        alunosSet.add(new Alunos(matricula, nome, media));
    }

    public void removerALuno (long matricula){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for (Alunos a : alunosSet) {
                if(a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw  new RuntimeException("SEM MATRICULA REGISTRADA");
        }
        if( alunoParaRemover == null){
            System.out.println("MATRICULA NAO ENCONTRADA");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        }else {
            System.out.println("Vazio");
        }
    }

     public void exibirAlunosPorNota() {
         Set<Alunos> alunosPorNota = new TreeSet<>(new CompratorPorNotas());
         if (!alunosSet.isEmpty()) {
             alunosPorNota.addAll(alunosSet);
             System.out.println(alunosPorNota);
         } else {
             System.out.println("VAZIO");
         }
     }

    public Set<Alunos> exibirTodosALunos(){
        System.out.println(alunosSet);
        return alunosSet;
    }

}
