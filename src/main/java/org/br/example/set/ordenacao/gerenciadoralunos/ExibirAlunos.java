package org.br.example.set.ordenacao.gerenciadoralunos;

public class ExibirAlunos {
    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.addAluno("João", 123456L, 7.5);
        gerenciadorAlunos.addAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.addAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.addAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirTodosALunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerALuno(123458L);
        System.out.println("LISTA APÓS REMOCAO");
        gerenciadorAlunos.exibirTodosALunos();

        // Exibindo alunos ordenados por nota
        System.out.println("LISTA POR NOTA");
        gerenciadorAlunos.exibirAlunosPorNota();

        // Exibindo alunos ordenados por nome
        System.out.println("LISTA POR NOME");
        gerenciadorAlunos.exibirAlunosPorNome();
    }
}