import br.com.screenmatch.modelos.Filmes;
import br.com.screenmatch.modelos.Series;
import br.com.screenmatch.modelos.Titulos;

public class Principal extends Titulos{
    public static void main(String[] args) {

        Filmes filmeEfeitoBorboleta = new Filmes();
        filmeEfeitoBorboleta.setNome("Efeito Borboleta");
        filmeEfeitoBorboleta.setSinopse("O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.");
        filmeEfeitoBorboleta.setAnoDeLancamento(2004);
        filmeEfeitoBorboleta.setIncluidoNoPlano(true);

        filmeEfeitoBorboleta.avaliacao(10);
        filmeEfeitoBorboleta.avaliacao(8.5);
        filmeEfeitoBorboleta.avaliacao(9.8);

        filmeEfeitoBorboleta.exibeFichaTecnica();

        Series breakingBad = new Series();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setSinopse("O professor de química Walter White não acredita que sua vida possa piorar ainda mais. Quando descobre que tem câncer terminal, Walter decide arriscar tudo para ganhar dinheiro enquanto pode, transformando sua van em um laboratório de metanfetamina.");
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setTemporadas(5);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(41);
        breakingBad.setAtiva("Ativada");

        breakingBad.avaliacao(8);
        breakingBad.avaliacao(9);
        breakingBad.avaliacao(10);

        breakingBad.exibeFichaTecnica();
        breakingBad.exibeFichaTecnicaSeries();
    }
}