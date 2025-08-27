package com.vootrancy.model.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {

    @Test
    void testConstrutorEGetters() {
        LocalDate nascimento = LocalDate.of(1990, 5, 15);
        Passageiro passageiro = new Passageiro("123456789", "João Silva", nascimento, 2, "Masculino");

        // Verifica atributos herdados da classe Pessoa
        assertEquals("123456789", passageiro.getDocumentoID());
        assertEquals("João Silva", passageiro.getNome());
        assertEquals(nascimento, passageiro.getNascimento());

        // Verifica atributos da classe Passageiro
        assertEquals(2, passageiro.getQtdeBagagens());
        assertEquals("Masculino", passageiro.getGenero());
    }

    @Test
    void testSetters() {
        LocalDate nascimento = LocalDate.of(1990, 5, 15);
        Passageiro passageiro = new Passageiro("123456789", "João Silva", nascimento, 2, "Masculino");

        // Altera os valores usando setters
        passageiro.setQtdeBagagens(3);
        passageiro.setGenero("Feminino");

        assertEquals(3, passageiro.getQtdeBagagens());
        assertEquals("Feminino", passageiro.getGenero());
    }

    @Test
    void testToString() {
        LocalDate nascimento = LocalDate.of(1990, 5, 15);
        Passageiro passageiro = new Passageiro("123456789", "João Silva", nascimento, 2, "Masculino");

        String esperado = passageiro.getDocumentoID() + "," +
                          passageiro.getNome() +
                          passageiro.getNascimento() + ",2,Masculino";

        assertEquals(esperado, passageiro.toString());
    }
}
