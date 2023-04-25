public class Filmes { // Classe
    String nome;
    String sinopse;
    double duracaoEmMinutos;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    double totalDeAvaliacoes;
    boolean incluidoNoPlano;

    void exibeFichaTecnica() { // Metódo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Duração (Minutos): " + duracaoEmMinutos);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Plano: " + incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}
