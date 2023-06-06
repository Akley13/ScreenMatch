// Classe Games, tudo que a classe tem, suas caracteristicas e o que ela faz.

// CLASSE
public class Games {

    // ATRIBUTOS - Valores que podem ser guardados dentro de cada objeto.
    String nome;
    String produtora;
    int anoDeLancamento;
    String historia;
    int duracaoEmHoras;
     private double somaAvaliacoes; // private - Modificar de acesso
    private int totalAvaliacoes; // private - Ou de visibilidade
    boolean assinatura;

    // MÉTODO
    void exibeFichaTecnica() {
        System.out.println("\nNome do jogo: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historia);
        System.out.println("Duração (Horas): " + duracaoEmHoras);
        System.out.printf("Média das avaliações: %.2f", fazMediaDasAvaliacoes());
        System.out.println("\nTotal de avaliações: " + getTotalAvaliacoes());
        System.out.println("Assinatura: " + assinatura);
    }

    void avaliacaoDasPessoas(double nota){
        somaAvaliacoes += nota; // somaAvaliacoes = avaliacao + nota
        totalAvaliacoes++;
    }

    double fazMediaDasAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    int getTotalAvaliacoes(){ // get - pegar valor
        return totalAvaliacoes;
    }

}