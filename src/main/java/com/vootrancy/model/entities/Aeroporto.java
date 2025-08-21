package com.vootrancy.model.entities;

public class Aeroporto {
    private String nome;
    private String sigla;
    private String cidade;
    private double distancia;
    private double tempoVoo;
    
    public Aeroporto (String nome, String sigla, String cidade, double distancia, double tempo){
        this.nome = nome;
        this.sigla = sigla;
        this.cidade = cidade;
        this.distancia = distancia;
        this.tempoVoo = tempo;
    }

    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }
    public String getCidade(){
        return cidade;
    }
    public double getDistancia(){
        return distancia;
    }
    public double getTempoVoo(){
        return tempoVoo;
    }
}
