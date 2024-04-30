package org.br.example.set.pesquisa;

public class ExibirAgenda {
    public static void main(String[] args) {

        AgendaContato agendaContato = new AgendaContato();

        agendaContato.addContato("Gabriel", 1236);
        agendaContato.addContato("Gabriel 2", 1245);
        agendaContato.addContato("Fernando", 1285);
        agendaContato.addContato("Douglas", 1275);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Gabriel"));

//        agendaContato.atualizarNumeroContato("Fernando", 1220);
        System.out.println(agendaContato.atualizarNumeroContato("Fernando", 1220));

        agendaContato.exibirContato();
    }
}
