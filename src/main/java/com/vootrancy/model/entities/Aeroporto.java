package com.vootrancy.model.entities;

import com.vootrancy.model.*;

public class Aeroporto {
    // Atributos
    private String cidade;
    private String sigla;
    private Aviao aviao;
    private int tempoVooMinutos;
    // ---

    // Contrutor
    public Aeroporto (String cidade, String sigla, Aviao aviao, int tempoVooMinutos) {
        this.cidade = cidade;
        this.sigla = sigla;
        this.aviao = aviao;
        this.tempoVooMinutos = tempoVooMinutos;
    }
    // ---
    
    // metodo toString
    public String toString () {
        return cidade + "-" + sigla;
    }
}
