package br.com.akley.screenmatch.sections.calculos;

import br.com.akley.screenmatch.sections.GamesPlaystation;
import br.com.akley.screenmatch.sections.GamesXbox;

public class CalculoHorasDeJogo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(GamesPlaystation duracaoDoJogo) {
        tempoTotal += duracaoDoJogo.getDuracaoEmHoras();
    }

    public void inclui(GamesXbox duracaoDoJogo) {
        tempoTotal += duracaoDoJogo.getDuracaoEmHoras();
    }
}
