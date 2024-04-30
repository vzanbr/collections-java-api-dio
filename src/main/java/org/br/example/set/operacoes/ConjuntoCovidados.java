package org.br.example.set.operacoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoCovidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoCovidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("NÃO TEM CONVIDADO COM ESSE NUMERO DE CONVITE");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
