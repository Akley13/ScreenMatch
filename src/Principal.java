public class Principal {
    public static void main(String[] args) {
        Games jogoPreferido = new Games(); // linha 3: parte esquerda está guardando onde o objeto está e a parte da direita está criando o objeto.

        jogoPreferido.nome = "The last of us";
        jogoPreferido.produtora = "Naughty Dog";
        jogoPreferido.anoDeLancamento = 2013;
        jogoPreferido.historia = "The Last of Us é uma franquia de jogos eletrônicos de ação-aventura e survival horror exclusiva da PlayStation, criada por Neil Druckmann. A franquia é situada em um mundo pós-apocalíptico, com seres humanos hostis e criaturas canibais infectadas por uma mutação do fungo cordyceps.";
        jogoPreferido.duracaoEmHoras = 15;
        jogoPreferido.avaliacao = 10;
        jogoPreferido.totalAvaliacoes = 10;
        jogoPreferido.assinatura = true;
    }
}
