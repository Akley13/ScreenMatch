public class Filmes {
    String nome;
    String sinopse;
    int duracaoEmMinutos;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    boolean incluidoNoPlano;

    // ISSO É UM MÉTODO
    void exibeFichaTecnica(){
        System.out.println("********************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração (minutos): " + duracaoEmMinutos);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total das avaliações: " + totalDeAvaliacoes);
        System.out.printf("Média das avaliações: %.2f", retornaMediaDasAvaliacoes());
        System.out.println("\nAssinatura: " + incluidoNoPlano);
        System.out.println("********************************************");
    }

    void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornaMediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
