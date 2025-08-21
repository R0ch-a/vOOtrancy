package com.vootrancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

@Controller
public class HistoricoController {

    @PostMapping("/salvarHistorico")
    public String salvarHistorico(
            @RequestParam String destino,
            @RequestParam String dataIda,
            @RequestParam String dataVolta,
            @RequestParam int numPassagens,
            @RequestParam String classe
    ) {
        // try-catch - tratamento de excecao caso nao consiga acessar o arquivo para salvar as escolhas de pesquisa do usuario
        try (FileWriter writer = new FileWriter("historico.txt", true)) {
            LocalDate ida = LocalDate.parse(dataIda);
            LocalDate volta = LocalDate.parse(dataVolta);

            // Salva uma linha por registro: separado por vírgula para facilitar na leitura
            writer.write(destino + "," + ida + "," + volta + "," + numPassagens + "," + classe + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Redireciona o usuario para a pagina de opcoes de voo
        return "redirect:/src/main/resources/templates/voos.html";
    }
}

