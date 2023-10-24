package br.com.screenmatch.modelos;

public class Series extends Titulos { // essa classe tem tudo o que a de Titulos tem, porém com suas próprias particularidades
// extends - aplica herança à uma classe

    private int temporadas;
    private int episodiosPorTemporada;

    private int minutosPorEpisodio;

    private String ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public String getAtiva() {
        return ativa;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    public void exibeFichaTecnicaSeries(){
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Minutos por episódio: " + getMinutosPorEpisodio());
        System.out.println("Série Ativa/Encerrada: " + getAtiva());
    }
}
