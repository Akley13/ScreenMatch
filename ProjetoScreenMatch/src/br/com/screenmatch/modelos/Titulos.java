package br.com.screenmatch.modelos; //PACOTE

public class Titulos { // CLASSE

    /* ATRIBUTOS | MODIFICADORES DE ACESSO
    Public - pode ser acessado por qualquer classe em qualquer pacote.
    Default - não especifica nenhum modificador de acesso, sendo assim a classe, atributo ou método pode ser acessado apenas pelas classes que estão no mesmo pacote.
    Private - Uma classe, atributo ou método declarado como private só pode ser acessado dentro da própria classe. */
    private String nome;
    private String sinopse;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;


    // MÉTODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // MÉTODOS
    public void exibeFichaTecnica(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Sinopse: " + getSinopse());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração (Minutos): " + getDuracaoEmMinutos());
        System.out.println("Total das avaliações: " + getTotalDeAvaliacoes());
        System.out.printf("Média das avaliações: %.2f", retornaMediaDasAvaliacoes());
        System.out.println("\nAssinatura: " + getIncluidoNoPlano());
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
