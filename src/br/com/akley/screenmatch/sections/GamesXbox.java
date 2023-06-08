package br.com.akley.screenmatch.sections;


// CLASSE - tudo que a classe tem, suas caracteristicas e o que ela faz.
public class GamesXbox extends Consoles { // Extends - Palavra reservada do Java que aplica HERANÇA à uma classe. Aqui estou dizendo que GamesXbox tem tudo que Consoles têm, mais essas diferenças a baixo.
    private String xboxLiveGold;
    private String reproducao4k;

    public String getXboxLiveGold() {return xboxLiveGold;}

    public void setXboxLiveGold(String xboxLiveGold) {this.xboxLiveGold = xboxLiveGold;}

    public String getReproducao4k() {return reproducao4k;}

    public void setReproducao4k(String reproducao4k) {this.reproducao4k = reproducao4k;}

    public void exibeDadosXbox(){
        System.out.println("\n--------- DADOS ESPECÍFICOS | XBOX ---------");
        System.out.println("\nResolução: " + reproducao4k);
        System.out.println("Xbox Live Gold: " + xboxLiveGold);
        System.out.println("\n--------------------------------------------");
    }
}