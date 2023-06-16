import br.com.akley.screenmatch.sections.Consoles;
import br.com.akley.screenmatch.sections.GamesPlaystation;
import br.com.akley.screenmatch.sections.GamesXbox;
import br.com.akley.screenmatch.sections.calculos.CalculoHorasDeJogo;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n############################## CONSOLES ##############################");

        // História dos Consoles
        Consoles playstation5 = new Consoles();
        playstation5.setNome("Playstation 5");
        playstation5.setAnoDeLancamento(2020);
        playstation5.setHistoria("O console foi lançado em 12 de novembro de 2020 na América do Norte, Austrália, Coreia do Sul, Japão, Nova Zelândia e Singapura. E em 11 de dezembro de 2020 foi lançado nas Filipinas. 19 de novembro para o resto do mundo.");
        playstation5.exibeFichaTecnicaConsoles();

        Consoles xboxSeriesX = new Consoles();
        xboxSeriesX.setNome("Xbox Series X");
        xboxSeriesX.setAnoDeLancamento(2020);
        xboxSeriesX.setHistoria("O Xbox Series X e Series S (coletivamente chamados de Xbox Series X/S) são consoles domésticos de jogos eletrônicos desenvolvidos pela Microsoft. É a quarta geração da família de consoles Xbox; foi anunciada pela primeira vez durante a E3 2019 como Project Scarlett. Ambos os consoles foram lançados em 10 de novembro de 2020.");
        xboxSeriesX.exibeFichaTecnicaConsoles();

        System.out.println("\n############################## GAMES | PLAYSTATION ##############################");

        // GamesPlaystation
        GamesPlaystation theLastOfUs = new GamesPlaystation();

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

        theLastOfUs.exibeFichaTecnicaJogos();
        theLastOfUs.exibeDadosPlaystation();

        GamesPlaystation godOfWar = new GamesPlaystation();
        godOfWar.setNome("God of war - Ragnarok");
        godOfWar.setProdutora("Santa Monica Studios");
        godOfWar.setAnoDeLancamento(2022);
        godOfWar.setHistoria("Se passa três anos após o evento do jogo de 2018, com Atreus um pouco mais velho enquanto tenta entender suas origens e a importância de seu nome de batismo — Loki. A busca por respostas vai desencadear no auge do Ragnarok, o fim dos tempos Nórdicos.");
        godOfWar.setDuracaoEmHoras(45);
        godOfWar.avaliacaoDasPessoas(10);
        godOfWar.avaliacaoDasPessoas(8.5);
        godOfWar.avaliacaoDasPessoas(9);
        godOfWar.setReproducaoFullHD("4K");
        godOfWar.setPlaystationPlus("Ativo");

        godOfWar.exibeFichaTecnicaJogos();
        godOfWar.exibeDadosPlaystation();

        // CALCULADORA
        CalculoHorasDeJogo calculoPlaystation = new CalculoHorasDeJogo();
        calculoPlaystation.inclui(theLastOfUs);
        calculoPlaystation.inclui(godOfWar);
        System.out.println("\nTOTAL DE HORAS JOGADAS: " + calculoPlaystation.getTempoTotal());

        System.out.println("\n############################## GAMES | XBOX ##############################");

        // GamesXbox
        GamesXbox gearsOfWar = new GamesXbox();

        gearsOfWar.setNome("Gears of war");
        gearsOfWar.setProdutora("Epic Games");
        gearsOfWar.setAnoDeLancamento(2006);
        gearsOfWar.setHistoria("O jogo centra no Esquadrão Delta, um grupo de soldados da COG (Coalition of Ordered Governments) que recebe a missão de salvar o planeta Sera do exército Locust. O jogador controla Marcus Fenix, um ex-prisioneiro, e um possível segundo jogador controla \"Dom\" Santiago.");
        gearsOfWar.setDuracaoEmHoras(13);
        gearsOfWar.avaliacaoDasPessoas(8);
        gearsOfWar.avaliacaoDasPessoas(10);
        gearsOfWar.avaliacaoDasPessoas(7);
        gearsOfWar.setReproducao4k("4K");
        gearsOfWar.setXboxLiveGold("Ativo");

        gearsOfWar.exibeFichaTecnicaJogos();
        gearsOfWar.exibeDadosXbox();

        GamesXbox halo5 = new GamesXbox();

        halo5.setNome("Halo 5");
        halo5.setProdutora("343 Industries");
        halo5.setAnoDeLancamento(2015);
        halo5.setHistoria("A história de “Halo 5: Guardians” é contada a partir dos pontos de vista dos esquadrões de Master Chief e de Spartan Locke. Depois dos eventos finais de “Halo 4“, Master Chief partiu numa missão pessoal que busca a fonte de uma mensagem misteriosa que aponta para o fim próximo da galáxia.");
        halo5.setDuracaoEmHoras(13);
        halo5.avaliacaoDasPessoas(5);
        halo5.avaliacaoDasPessoas(7);
        halo5.avaliacaoDasPessoas(8);
        halo5.setReproducao4k("4K");
        halo5.setXboxLiveGold("Ativo");

        halo5.exibeFichaTecnicaJogos();
        halo5.exibeDadosXbox();

        CalculoHorasDeJogo calculoXbox = new CalculoHorasDeJogo();
        calculoXbox.inclui(gearsOfWar);
        calculoXbox.inclui(halo5);
        System.out.println("\nTOTAL DE HORAS JOGADAS: " + calculoXbox.getTempoTotal());
    }
}
