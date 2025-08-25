package com.vootrancy.service;

import com.vootrancy.model.entities.Historico;
import com.vootrancy.model.entities.Passageiro;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VooTrancyService {
    
    private final Path historicoPath = Path.of("historico.txt");
    private final Path registroPath = Path.of("registro.txt");

    
    public void salvarHistorico (String destino , LocalDate dataIda , LocalDate dataVolta , int numPassagens , String classe ) {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para salvar as escolhas de pesquisa do usuario
        try (FileWriter historicoWriter = new FileWriter("historico.txt", true)) {
            historicoWriter.write(destino + "," + dataIda + "," + dataVolta + "," + numPassagens + "," + classe + "\n");
            // Files.writeString(historicoPath, historico + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
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
            throw new RuntimeException("Erro ao carregar histórico" + e.getMessage(), e);
        }
        return List.of();
    }
    // --------------------------------------
    public void salvarRegistro (String documentoID, String nome, LocalDate nascimento, int qtdeBagagens, String genero) {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para salvar as escolhas de pesquisa do usuario
        try (FileWriter registroWriter = new FileWriter("registro.txt", true)) {
            registroWriter.write(documentoID + "," + nome + "," + nascimento + "," + qtdeBagagens + "," + genero + "\n");
            // Files.writeString(historicoPath, historico + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar registro: " + e.getMessage(), e);
        }
    }

}