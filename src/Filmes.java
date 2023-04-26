public class Filmes { // Classe
    String nome; // Atributos - Características do objeto
    String sinopse;
    double duracaoEmMinutos;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    double totalDeAvaliacoes;
    boolean incluidoNoPlano;

    void exibeFichaTecnicaFilmes() { // Metódo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Duração (Minutos): " + duracaoEmMinutos);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Plano: " + incluidoNoPlano);
    }

    void exibeFichaTecnicaAnimes() {
        System.out.println("Nome do anime: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Duração (Minutos): " + duracaoEmMinutos);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Plano: " + incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
