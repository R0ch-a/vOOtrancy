package com.vootrancy.model.entities;

import java.time.LocalDate;

public class Historico {
    // Atributos
    private String destino;
    private LocalDate dataDeIda;
    private LocalDate dataDeVolta;
    private int numeroPassagens;
    private String classe;
    // ---

    // Construtor
    public Historico (String destino, LocalDate dataDeIda, LocalDate dataDeVolta, int numeroPassagens, String classe) {
        this.destino = destino;
        this.dataDeIda = dataDeIda;
        this.dataDeVolta = dataDeVolta;
        this.numeroPassagens = numeroPassagens;
        this.classe = classe;
    }
    // ---
}
