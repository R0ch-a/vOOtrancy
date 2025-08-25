package com.vootrancy.service;

import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VooTrancyServiceTest {

    private VooTrancyService service;
    private Path historicoPath = Path.of("historico.txt");
    private Path registroPath = Path.of("registro.txt");

    @BeforeEach
    void setUp() throws IOException {
        service = new VooTrancyService();
        // Apaga os arquivos antes de cada teste, para começar limpo
        Files.deleteIfExists(historicoPath);
        Files.deleteIfExists(registroPath);
    }

    @Test
    void testSalvarECarregarHistorico() {
        service.salvarHistorico("Paris", LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 20), 2, "Econômica");

        List<String> historico = service.carregarHistorico();

        assertFalse(historico.isEmpty(), "O histórico não deve estar vazio");
        assertTrue(historico.get(0).contains("Paris"), "Deve conter o destino 'Paris'");
    }

    @Test
    void testSalvarECarregarRegistro() {
        service.salvarRegistro("123456789", "João Silva",
                LocalDate.of(1990, 5, 15), 2, "Masculino");

        List<String> registros = service.carregarRegistro();

        assertFalse(registros.isEmpty(), "O registro não deve estar vazio");
        assertTrue(registros.get(0).contains("João Silva"), "Deve conter o nome 'João Silva'");
    }

    @Test
    void testCarregarHistoricoVazio() {
        List<String> historico = service.carregarHistorico();
        assertTrue(historico.isEmpty(), "Se não existir arquivo, deve retornar lista vazia");
    }

    @Test
    void testCarregarRegistroVazio() {
        List<String> registros = service.carregarRegistro();
        assertTrue(registros.isEmpty(), "Se não existir arquivo, deve retornar lista vazia");
    }
}
