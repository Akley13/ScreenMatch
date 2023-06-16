package br.com.akley.screenmatch.sections;

public class GamesPlaystation extends Consoles{ // Extends - Tem e faz tudo que Consoles(super tipo) tem, e mais estas diferenças a baixo.
    private String playstationPlus;
    private String reproducaoFullHD;

    public String getPlaystationPlus() {
        return playstationPlus;
    }

    public void setPlaystationPlus(String playstationPlus) {
        this.playstationPlus = playstationPlus;
    }

    public String getReproducaoFullHD() {
        return reproducaoFullHD;
    }

    public void setReproducaoFullHD(String reproducaoFullHD) {
        this.reproducaoFullHD = reproducaoFullHD;
    }

    public void exibeDadosPlaystation(){
        System.out.println("\n---------- DADOS ESPECÍFICOS DO JOGO ----------");
        System.out.println("\nResolução: " + getReproducaoFullHD());
        System.out.println("Playstation Plus: " + getPlaystationPlus());
        System.out.println("-----------------------------------------------");

    }

}
