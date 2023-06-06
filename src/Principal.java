import br.com.akley.screenmatch.modelos.GamesPlaystation;
import br.com.akley.screenmatch.modelos.GamesXbox;

public class Principal {
    public static void main(String[] args) {
        GamesPlaystation TheLastOfUs = new GamesPlaystation(); // linha 3: parte esquerda está guardando onde o objeto está e a parte da direita está criando o objeto.

        TheLastOfUs.setNome("The last of us");
        TheLastOfUs.setProdutora("Naughty Dog");
        TheLastOfUs.setAnoDeLancamento(2013);
        TheLastOfUs.setHistoria("The Last of Us é uma franquia de jogos eletrônicos de ação-aventura e survival horror exclusiva da PlayStation, criada por Neil Druckmann. A franquia é situada em um mundo pós-apocalíptico, com seres humanos hostis e criaturas canibais infectadas por uma mutação do fungo cordyceps.");
        TheLastOfUs.setDuracaoEmHoras(15);
        TheLastOfUs.avaliacaoDasPessoas(10);
        TheLastOfUs.avaliacaoDasPessoas(8.5);
        TheLastOfUs.avaliacaoDasPessoas(9);

        TheLastOfUs.setReproducaoFullHD("Full HD");

        TheLastOfUs.exibeFichaTecnica();
        TheLastOfUs.exibeDadosPlaystation();

    }
}
