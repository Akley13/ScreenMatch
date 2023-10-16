public class Principal {
    public static void main(String[] args) {

        Filmes meufilmePreferido = new Filmes();
        meufilmePreferido.nome = "Efeito Borboleta";
        meufilmePreferido.sinopse = "O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.";
        meufilmePreferido.anoDeLancamento = 2004;
        meufilmePreferido.duracaoEmMinutos = 120;
        meufilmePreferido.incluidoNoPlano = true;

        meufilmePreferido.avaliacao(10);
        meufilmePreferido.avaliacao(8.5);
        meufilmePreferido.avaliacao(9.8);

        meufilmePreferido.exibeFichaTecnica();
    }
}