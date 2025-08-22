package com.vootrancy.model.entities;
import java.util.Date;

public class Passageiro {
    private int documentoID;
    private String nome;
    private int qtdeBagagens;
    private Voo voo;
    private Date nascimento;
    private String genero;

    public Passageiro (int id, String nome, int qtde, Voo voo, Date nascimento, String genero){
        this.documentoID = id;
        this.nome = nome;
        this.qtdeBagagens = qtde;
        this.voo = voo;
        this.nascimento = nascimento;
        this.genero = genero;
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
    public Date getNascimento(){
        return nascimento;
    }
    public String getGenero(){
        return genero;
    }

    // Melhor criar um set para todos os atributos que serao escolhidos por botao.
    // Ou seja, fazer uma sobrecarga de construtor para receber menos parametros e criar o objeto mesmo assim.
    // Tudo que precisar adicionar ao clicar botoes chamara metodos.
    public void setQtdeBagagens(int qtde){
        qtdeBagagens = qtde;
    }
    public void setVoo(Voo voo){
        this.voo = voo;
    }
}
