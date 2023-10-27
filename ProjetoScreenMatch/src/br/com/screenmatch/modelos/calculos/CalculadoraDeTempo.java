package br.com.screenmatch.modelos.calculos;

import br.com.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void adicionaTempo(Titulos titulos){
        this.tempoTotal += titulos.getDuracaoEmMinutos();
    }
//    public void adicionaTempo(Filmes f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
}
