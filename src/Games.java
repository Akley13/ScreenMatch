// Classe Games, tudo que a classe tem, suas caracteristicas e o que ela faz.

// CLASSE
public class Games {

    // ATRIBUTOS
    String nome;
    String produtora;
    int anoDeLancamento;
    String historia;
    int duracaoEmHoras;
    double avaliacao;
    double totalAvaliacoes;
    boolean assinatura;

    // MÉTODO
    void exibeFichaTecnica(){
        System.out.println("\nNome do jogo: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historia);
        System.out.println("Duração (Horas): " + duracaoEmHoras);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Total de avaliações: " + totalAvaliacoes);
        System.out.println("Assinatura: " + assinatura);
    }
}