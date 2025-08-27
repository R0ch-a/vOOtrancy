package com.vootrancy.model.entities;

import java.time.LocalDate;

public abstract class Pessoa {
    // Atributos
    protected String documentoID;
    protected String nome;
    private LocalDate nascimento;
    // ---

    // Construtor
    public Pessoa (String documentoID, String nome, LocalDate nascimento) {
        this.documentoID = documentoID;
        this.nome = nome;
        this.nascimento = nascimento;
    }
    // ---

    // metodos getters
    public String getDocumentoID(){
        return documentoID;
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDate getNascimento(){
        return this.nascimento;
    }
    // ---
    
    // metodos getters
    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }
    // ---
}
