package com.vootrancy.model.entities;

public class Passageiro {
    private int documentoID;
    private String nome;
    private int qtdeBagagens;
    private Voo voo;

    public Passageiro (int id, String nome, int qtde, Voo voo){
        this.documentoID = id;
        this.nome = nome;
        this.qtdeBagagens = qtde;
        this.voo = voo;
    }

    public int getDocumentoID(){
        return documentoID;
    }
    public String getNome(){
        return nome;
    }
    public int getQtdeBagagens(){
        return qtdeBagagens;
    }
    public Voo getVoo(){
        return voo;
    }

    public void setQtdeBagagens(int qtde){
        qtdeBagagens = qtde;
    }
    public void setVoo(Voo voo){
        this.voo = voo;
    }
}
