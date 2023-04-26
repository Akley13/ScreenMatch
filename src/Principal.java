public class Principal {
    public static void main(String[] args) {
        Filmes filmePreferido = new Filmes();
        filmePreferido.nome = "Efeito Borboleta";
        filmePreferido.anoDeLancamento = 2004;
        filmePreferido.sinopse = "O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.";
        filmePreferido.duracaoEmMinutos = 180;
        filmePreferido.incluidoNoPlano = true;

        filmePreferido.exibeFichaTecnica();
        filmePreferido.avalia(8);
        filmePreferido.avalia(5);
        filmePreferido.avalia(10);
        System.out.println(filmePreferido.somaDasAvaliacoes);
        System.out.println(filmePreferido.totalDeAvaliacoes);
        System.out.println(filmePreferido.pegaMedia());

        Filmes animes = new Filmes();
        animes.nome = "Naruto Shippuden é a segunda parte do anime Naruto, que adapta a continuação do mangá original escrito por Masashi Kishimoto e consiste em 500 episódios ao todo. Ambientada dois anos após os eventos da série original, Shippuden acompanha o ninja adolescente Naruto e seus aliados.";
        animes.anoDeLancamento = 2007;
        animes.sinopse = "";
        animes.duracaoEmMinutos = ;
        animes.incluidoNoPlano = true;

    }
}
