package com.vootrancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileWriter;
import java.io.IOException;

@Controller
public class RegistroController {

    @PostMapping("/salvarRegistro")
    public String salvarRegistro(
            @RequestParam String nome,
            @RequestParam int idade,
            @RequestParam String cpf,
            @RequestParam int bagagens
    ) {
        try (FileWriter writer = new FileWriter("registro.txt", true)) {
            // Salva uma linha por registro: separado por vírgula
            writer.write(nome + "," + idade + "," + cpf + "," + bagagens + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Redireciona para a página 4 (histórico)
        return "redirect:/pagina4";
    }
}
