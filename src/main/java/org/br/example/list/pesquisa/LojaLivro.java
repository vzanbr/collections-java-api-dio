package org.br.example.list.pesquisa;

public class LojaLivro {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adclivro("Livro 1", "Gabriel", 2024);
        catalogoLivros.adclivro("Livro 2", "Gabriel", 2022);
        catalogoLivros.adclivro("Livro 3", "Gabriel", 2021);
        catalogoLivros.adclivro("Livro 4", "Fernando", 2004);
        catalogoLivros.adclivro("Livro 5", "Gabriel", 2014);
        catalogoLivros.adclivro("Livro 6", "Gabriel", 2028);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 5"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Gabriel"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2024));
    }
}
