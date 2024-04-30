package org.br.example.ordencao;

public class OrdenarNumeros {
    public static void main(String[] args) {

        OrdenaPessoa ordenaPessoa = new OrdenaPessoa();

        ordenaPessoa.addPessoa("Gabriel", 24, 1.77);
        ordenaPessoa.addPessoa("Beatriz", 21, 1.50);
        ordenaPessoa.addPessoa("Isabella", 16, 1.57);
        ordenaPessoa.addPessoa("Rodrigo", 42, 1.79);

        System.out.println(ordenaPessoa.ordenarPorIdade());
        System.out.println("===============");
        System.out.println(ordenaPessoa.ordenarPorAltura());

    }
}
