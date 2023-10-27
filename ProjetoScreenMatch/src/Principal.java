import br.com.screenmatch.modelos.Filmes;
import br.com.screenmatch.modelos.Series;
import br.com.screenmatch.modelos.Titulos;
import br.com.screenmatch.modelos.calculos.CalculadoraDeTempo;

public class Principal extends Titulos{
    public static void main(String[] args) {

        Filmes filmeEfeitoBorboleta = new Filmes();
        filmeEfeitoBorboleta.setNome("Efeito Borboleta");
        filmeEfeitoBorboleta.setSinopse("O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.");
        filmeEfeitoBorboleta.setAnoDeLancamento(2004);
        filmeEfeitoBorboleta.setDuracaoEmMinutos(120);
        filmeEfeitoBorboleta.setIncluidoNoPlano(true);

        filmeEfeitoBorboleta.avaliacao(10);
        filmeEfeitoBorboleta.avaliacao(8.5);
        filmeEfeitoBorboleta.avaliacao(9.8);

        filmeEfeitoBorboleta.exibeFichaTecnica();

        Filmes filmeDesejoSombrio = new Filmes();
        filmeEfeitoBorboleta.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionaTempo(filmeEfeitoBorboleta);
        calculadora.adicionaTempo(filmeDesejoSombrio);

    }
}