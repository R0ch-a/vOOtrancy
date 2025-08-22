package com.vootrancy.model.entities;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa (String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}
