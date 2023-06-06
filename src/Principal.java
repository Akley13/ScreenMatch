import br.com.akley.screenmatch.modelos.GamesPlaystation;
import br.com.akley.screenmatch.modelos.GamesXbox;

public class Principal {
    public static void main(String[] args) {

        // GamesPlaystation
        GamesPlaystation theLastOfUs = new GamesPlaystation(); // nesta linha parte esquerda do código está guardando onde o objeto está e a parte da direita está criando o objeto.

        theLastOfUs.setNome("The last of us");
        theLastOfUs.setProdutora("Naughty Dog");
        theLastOfUs.setAnoDeLancamento(2013);
        theLastOfUs.setHistoria("The Last of Us é uma franquia de jogos eletrônicos de ação-aventura e survival horror exclusiva da PlayStation, criada por Neil Druckmann. A franquia é situada em um mundo pós-apocalíptico, com seres humanos hostis e criaturas canibais infectadas por uma mutação do fungo cordyceps.");
        theLastOfUs.setDuracaoEmHoras(15);
        theLastOfUs.avaliacaoDasPessoas(10);
        theLastOfUs.avaliacaoDasPessoas(8.5);
        theLastOfUs.avaliacaoDasPessoas(9);
        theLastOfUs.setReproducaoFullHD("Full HD");
        theLastOfUs.setPlaystationPlus("Ativo");

        theLastOfUs.exibeFichaTecnica();
        theLastOfUs.exibeDadosPlaystation();

        //GamesXbox
        GamesXbox gearsOfWar = new GamesXbox();

        gearsOfWar.setNome("Gears of war");
        gearsOfWar.setProdutora("Epic Games");
        gearsOfWar.setAnoDeLancamento(2006);
        gearsOfWar.setHistoria("O jogo centra no Esquadrão Delta, um grupo de soldados da COG (Coalition of Ordered Governments) que recebe a missão de salvar o planeta Sera do exército Locust. O jogador controla Marcus Fenix, um ex-prisioneiro, e um possível segundo jogador controla \"Dom\" Santiago.");
        gearsOfWar.setDuracaoEmHoras(20);
        gearsOfWar.avaliacaoDasPessoas(8);
        gearsOfWar.avaliacaoDasPessoas(10);
        gearsOfWar.avaliacaoDasPessoas(7);
        gearsOfWar.setReproducao4k("4K");
        gearsOfWar.setXboxLiveGold("Ativo");

        gearsOfWar.exibeFichaTecnica();
        gearsOfWar.exibeDadosXbox();

    }
}
