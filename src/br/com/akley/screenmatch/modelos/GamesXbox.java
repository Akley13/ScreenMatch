package br.com.akley.screenmatch.modelos;

// CLASSE - tudo que a classe tem, suas caracteristicas e o que ela faz.
public class GamesXbox extends Consoles { // Extends - Palavra reservada do Java que aplica HERANÇA à uma classe. Aqui estou dizendo que GamesXbox tem tudo que Consoles têm, mais essas diferenças a baixo.
    private String xboxLiveGold;

    public String getXboxLiveGold() {
        return xboxLiveGold;
    }

    public void setXboxLiveGold(String xboxLiveGold) {
        this.xboxLiveGold = xboxLiveGold;
    }
}