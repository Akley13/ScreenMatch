package br.com.screenmatch.modelos;

import br.com.screenmatch.modelos.calculos.Classificavel;

public class Filmes extends Titulos implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (retornaMediaDasAvaliacoes() / 2);
    }
}
