package br.com.screenmatch.modelos;

public class Filmes {
     public String nome;
     public String sinopse;
     public int duracaoEmMinutos;
    public int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public boolean incluidoNoPlano;

    // ISSO É UM MÉTODO
    public void exibeFichaTecnica(){
        System.out.println("********************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração (minutos): " + duracaoEmMinutos);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total das avaliações: " + getTotalDeAvaliacoes());
        System.out.printf("Média das avaliações: %.2f", retornaMediaDasAvaliacoes());
        System.out.println("\nAssinatura: " + incluidoNoPlano);
        System.out.println("********************************************");
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double retornaMediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
