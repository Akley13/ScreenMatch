import br.com.screenmatch.modelos.Episodios;
import br.com.screenmatch.modelos.Filmes;
import br.com.screenmatch.modelos.Series;
import br.com.screenmatch.modelos.Titulos;
import br.com.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelos.calculos.FiltroDeRecomendacao;

import java.util.ArrayList;

public class Principal extends Titulos{
    public static void main(String[] args) {


        Filmes filmeEfeitoBorboleta = new Filmes();
        filmeEfeitoBorboleta.setNome("Efeito Borboleta");
        filmeEfeitoBorboleta.setSinopse("O estudante universitário Evan Treborn está aflito com dores de cabeça tão fortes que frequentemente desmaia. Enquanto está inconsciente, Evan pode viajar de volta no tempo para momentos de dificuldades na infância. Ele também pode alterar o passado para os amigos, como Kayleigh, que foi molestada pelo pai. Porém ao mudar o passado, ele pode alterar o presente, o que leva Evan a se encontrar em um pesadelo de realidades alternativas, incluindo uma onde ele está preso.");
        filmeEfeitoBorboleta.setAnoDeLancamento(2004);
        filmeEfeitoBorboleta.setDuracaoEmMinutos(120);
        filmeEfeitoBorboleta.setIncluidoNoPlano(true);

        filmeEfeitoBorboleta.exibeFichaTecnica();

        Filmes filmeDesejoSombrio = new Filmes();
        filmeDesejoSombrio.setNome("Desejo Sombrio");
        filmeDesejoSombrio.setAnoDeLancamento(2023);
        filmeDesejoSombrio.setDuracaoEmMinutos(120);

        filmeDesejoSombrio.exibeFichaTecnica();

        Filmes aProcuraDeUmMilagre = new Filmes();
        aProcuraDeUmMilagre.setNome("A procura de um milagre");
        aProcuraDeUmMilagre.setAnoDeLancamento(2004);
        aProcuraDeUmMilagre.setDuracaoEmMinutos(60);

        aProcuraDeUmMilagre.exibeFichaTecnica();

        Series breakingBad = new Series();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2017);
        breakingBad.setIncluidoNoPlano(true);
        breakingBad.setTemporadas(2);
        breakingBad.setEpisodiosPorTemporada(2);
        breakingBad.setMinutosPorEpisodio(2);

        breakingBad.exibeFichaTecnicaSeries();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionaTempo(filmeEfeitoBorboleta);
        calculadora.adicionaTempo(filmeDesejoSombrio);
        calculadora.adicionaTempo(aProcuraDeUmMilagre);
        calculadora.adicionaTempo(breakingBad);

        System.out.println("TEMPO TOTAL: " + calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(filmeEfeitoBorboleta);
        filtro.filtra(aProcuraDeUmMilagre);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(breakingBad);
        episodio.setTotalVizualizacoes(400);
        filtro.filtra(episodio);

        ArrayList<Filmes> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeEfeitoBorboleta);
        listaDeFilmes.add(filmeDesejoSombrio);
        listaDeFilmes.add(aProcuraDeUmMilagre);

        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme: " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme: " + listaDeFilmes.get(2).getNome());

        System.out.println(listaDeFilmes);

    }
}