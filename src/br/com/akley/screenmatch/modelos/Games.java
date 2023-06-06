package br.com.akley.screenmatch.modelos;

// CLASSE - tudo que a classe tem, suas caracteristicas e o que ela faz.
public class Games {

    // ATRIBUTOS - Valores que podem ser guardados dentro de cada objeto.
    private String nome;
    private String produtora;
    private int anoDeLancamento;
    private String historia;
    private int duracaoEmHoras;
     private double somaAvaliacoes; // private - Modificar de acesso
    private int totalAvaliacoes; // private - Ou de visibilidade
    private boolean assinatura;

    // MÉTODO
    private void exibeFichaTecnica() {
        System.out.println("\nNome do jogo: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historia);
        System.out.println("Duração (Horas): " + duracaoEmHoras);
        System.out.printf("Média das avaliações: %.2f", fazMediaDasAvaliacoes());
        System.out.println("\nTotal de avaliações: " + getTotalAvaliacoes());
        System.out.println("Assinatura: " + assinatura);
    }

    private void avaliacaoDasPessoas(double nota){
        somaAvaliacoes += nota; // somaAvaliacoes = avaliacao + nota
        totalAvaliacoes++;
    }

    private double fazMediaDasAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    private int getTotalAvaliacoes(){ // get - pegar valor
        return totalAvaliacoes;
    }

}