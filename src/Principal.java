public class Principal {
    public static void main(String[] args) {
        Filmes filmePreferido = new Filmes();
        filmePreferido.nome = "Efeito Borboleta";
        filmePreferido.anoDeLancamento = 2004;
        filmePreferido.sinopse = "O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.";
        filmePreferido.duracaoEmMinutos = 180;
        filmePreferido.somaDasAvaliacoes = 10;
        filmePreferido.totalDeAvaliacoes = 10.00;
        filmePreferido.incluidoNoPlano = true;

        filmePreferido.exibeFichaTecnica();
        filmePreferido.avalia(8);
        filmePreferido.avalia(5);
        filmePreferido.avalia(10);
        System.out.println(filmePreferido.somaDasAvaliacoes);
        System.out.println(filmePreferido.totalDeAvaliacoes);
    }
}
