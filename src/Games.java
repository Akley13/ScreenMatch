// Classe Games, tudo que a classe tem, suas caracteristicas e o que ela faz.

// CLASSE
public class Games {

    // ATRIBUTOS
    String nome;
    String produtora;
    int anoDeLancamento;
    String historia;
    int duracaoEmHoras;
    double somaAvaliacoes;
    double totalAvaliacoes;
    boolean assinatura;

    // MÉTODO
    void exibeFichaTecnica() {
        System.out.println("\nNome do jogo: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historia);
        System.out.println("Duração (Horas): " + duracaoEmHoras);
        System.out.println("Avaliação: " + somaAvaliacoes);
        System.out.printf("Média das avaliações: %.2f", fazMediaDasAvaliacoes());
        System.out.println("\nTotal de avaliações: " + totalAvaliacoes);
        System.out.println("Assinatura: " + assinatura);
    }

    void avaliacaoDasPessoas(double nota){
        somaAvaliacoes += nota; // somaAvaliacoes = avaliacao + nota
        totalAvaliacoes++;
    }

    double fazMediaDasAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }

}