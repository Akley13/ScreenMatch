package br.com.akley.screenmatch.sections.calculos;

import br.com.akley.screenmatch.sections.GamesPlaystation;

public class HorasJogadas {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(GamesPlaystation duracaoDoJogo) {
        tempoTotal += duracaoDoJogo.getDuracaoEmHoras();
    }
}
