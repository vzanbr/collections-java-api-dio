package org.br.example.map.ordenacao.livrariaonline;

import org.br.example.map.pesquisa.Produto;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livroMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> removerLivro = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                removerLivro.add(entry.getKey());
            }
        }
        for (String chave : removerLivro){
            livroMap.remove(chave);
        }
    }

    public void exibirLivros(){
        System.out.println(livroMap);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosOrdemPreco = new ArrayList<>(livroMap.entrySet());

        Collections.sort(livrosOrdemPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosOrdemPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getAutor().equals(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livroMaisCaro = new ArrayList<>();
        double maiorValor = Double.MIN_VALUE;

        if (!livroMap.isEmpty()) {
            for (Livro l : livroMap.values()) {
                if (l.getPreco() > maiorValor) {
                    maiorValor = l.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() == maiorValor) {
                Livro livroComPrecoAlto = livroMap.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoAlto);
            }
        }
        return livroMaisCaro;
    }
    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livroMaisBarato = new ArrayList<>();
        double menorValor = Double.MAX_VALUE;

        if(!livroMap.isEmpty()) {
            for (Livro l : livroMap.values()) {
                if(l.getPreco() < menorValor) {
                    menorValor = l.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if(entry.getValue().getPreco() == menorValor) {
                Livro livroComPrecoMenor = livroMap.get(entry.getKey());
                livroMaisBarato.add(livroComPrecoMenor);
            }
        }
        return  livroMaisBarato;
    }
}
