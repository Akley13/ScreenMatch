package br.com.akley.screenmatch.modelos;

public class GamesPlaystation extends Consoles{
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
        System.out.println("\n------- DADOS ESPECÍFICOS | PLAYSTATION -------");
        System.out.println("\nResolução: " + reproducaoFullHD);
        System.out.println("Playstation Plus: " + playstationPlus);
        System.out.println("\n-----------------------------------------------");

    }

}
