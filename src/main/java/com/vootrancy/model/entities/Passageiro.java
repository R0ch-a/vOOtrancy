package com.vootrancy.model.entities;
import java.util.Date;

public class Passageiro {
    private int documentoID;
    private String nome;
    private int qtdeBagagens;
    private Date nascimento;
    private String genero;

    public Passageiro (int id, String nome, int qtde, Date nascimento, String genero){
        this.documentoID = id;
        this.nome = nome;
        this.qtdeBagagens = qtde;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    public Passageiro() {}

    public int getDocumentoID(){
        return documentoID;
    }

    public String getNome(){
        return this.nome;
    }
    
    public int getQtdeBagagens(){
        return this.qtdeBagagens;
    }
  
    public Date getNascimento(){
        return nascimento;
      
    }
    public String getGenero(){
        return genero;
    }

    public void setDocumentoID(int id){
        this.documentoID = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNascimento(Date data){
        this.nascimento = data;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setQtdeBagagens(int qtde){
        qtdeBagagens = qtde;
    }

    // Metodo toString
    public String toString() {
        return nome + "," + nascimento + "," + documentoID + "," + qtdeBagagens;
    }
}
