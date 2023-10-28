package br.com.screenmatch.modelos.calculos;

import br.com.screenmatch.modelos.Titulos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Pode esperar um pouco mais");
        }
    }
}
