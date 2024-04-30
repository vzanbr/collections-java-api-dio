package org.br.example.ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoa {
    private List<Pessoa> pessoaList;

    public OrdenaPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompratorPorAltura());
        return pessoasPorAltura;
    }
}
