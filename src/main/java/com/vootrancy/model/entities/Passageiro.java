package com.vootrancy.model.entities;

import com.vootrancy.model.entities.Pessoa;

public class Passageiro extends Pessoa {
    // Atributos
    private int quantBagagens;
    // ---
    
    // Construtor
    public Passageiro (String nome, int idade, String cpf, int quantBagagens) {
        super(nome, idade, cpf);
        this.quantBagagens = quantBagagens;
    }
    // ---
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getQuantBagagens(){
        return this.quantBagagens;
    }

    public void setQtdeBagagens(int quantBagagens){
        this.quantBagagens = quantBagagens;
    }
    // ---

    // Metodo toString
    public String toString() {
        return nome + "," + idade + "," + cpf + "," + quantBagagens;
    }
    // ---
}
