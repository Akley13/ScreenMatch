package br.com.screenmatch.modelos;

import br.com.screenmatch.modelos.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Series serie;
    private int totalVizualizacoes;

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
