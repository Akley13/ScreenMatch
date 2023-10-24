package br.com.screenmatch.modelos;

public class Series extends Titulos { // essa classe tem tudo o que a de Titulos tem, porém com suas próprias particularidades

    private boolean serieAtiva;

    public boolean isSerieAtiva() {
        return serieAtiva;
    }

    public void setSerieAtiva(boolean serieAtiva) {
        this.serieAtiva = serieAtiva;
    }
}
