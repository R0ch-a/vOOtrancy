package com.vootrancy.service;

import com.vootrancy.model.entities.Historico;
import com.vootrancy.model.entities.Passageiro;

// import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
// import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VooTrancyService {
    
    private final Path historicoPath = Path.of("historico.txt");
    private final Path registroPath = Path.of("registro.txt");


    public void salvarHistorico (Historico historico) {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para salvar as escolhas de pesquisa do usuario
        try {
            Files.writeString(historicoPath, historico + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar histórico: " + e.getMessage(), e);
        }
    }
    public List<String> carregarHistorico () {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para ler as escolhas de pesquisa do usuario
        try {
            if (Files.exists(historicoPath)) {
                return Files.readAllLines(historicoPath);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar histórico", e);
        }
        return List.of();
    }
    // --------------------------------------
    public void salvarRegistro (Passageiro passageiro) {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para salvar os dados de registro do usuario
        try {
            Files.writeString(registroPath, passageiro + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar registro: " + e.getMessage(), e);
        }
    }
    public List<String> carregarRegistro () {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para ler os dados de registro do usuario
        try {
            if (Files.exists(registroPath)) {
                return Files.readAllLines(registroPath);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar registros", e);
        }
        return List.of();
    }
}
