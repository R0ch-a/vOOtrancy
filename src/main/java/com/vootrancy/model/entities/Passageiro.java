package com.vootrancy.model.entities;

import java.time.LocalDate;

import com.vootrancy.model.entities.Pessoa;

public class Passageiro  extends Pessoa {
    // Os atributos documentoID e nome herdam da classe Pessoa
    // Atributos exclusivos da classe Passageiro
    private int qtdeBagagens;
    private String genero;
    // ---
    
    // Construtor
    public Passageiro (String documentoID, String nome, LocalDate nascimento, int qtdeBagagens, String genero){
        super(documentoID, nome, nascimento)
        this.qtdeBagagens = qtdeBagagens;
        this.genero = genero;
    }
    // ---
    
    // Metodos getters de todos os atributos exclusivos, nao sobrescrito os herdados da classe pessoa
    public int getQtdeBagagens(){
        return this.qtdeBagagens;
    }
    
    public String getGenero(){
        return this.genero;
    }
    // ---
    
    // Metodos setters dos atributos permitidos
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setQtdeBagagens(int qtdeBagagens){
        this.qtdeBagagens = qtdeBagagens;
    }
    // ---
    
    // Metodo toString
    public String toString() {
        return super.toString() + nascimento + "," + qtdeBagagens + "," + genero;
    }
    // ---
}
