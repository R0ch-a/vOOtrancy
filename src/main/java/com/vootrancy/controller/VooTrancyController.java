package com.vootrancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.vootrancy.model.entities.Historico;
import com.vootrancy.service.VooTrancyService;

@Controller
public class VooTrancyController {

    private final VooTrancyService service;

    public VooTrancyController(VooTrancyService service) {
        this.service = service;
    }
    
    @PostMapping("/salvarHistorico")
    public String salvarHistorico(
            @RequestParam String destino,
            @RequestParam String dataIda,
            @RequestParam String dataVolta,
            @RequestParam int numPassagens,
            @RequestParam String classe
    ) {
        // Historico historico = new Historico(destino, LocalDate.parse(dataIda), LocalDate.parse(dataVolta), numPassagens, classe);
        // service.salvarHistorico(historico);
        service.salvarHistorico(destino, LocalDate.parse(dataIda), LocalDate.parse(dataVolta), numPassagens, classe);
        // Redireciona o usuario para a pagina de opcoes de voo
        return "redirect:/voos.html";
    }

    @GetMapping("/carregarHistorico")
    public List<String> carregarHistorico() {
        return service.carregarHistorico();
    }
    
    
    @PostMapping("/salvarRegistro")
    public String salvarRegistro(
            @RequestParam String documentoID,
            @RequestParam String nome,
            @RequestParam String nascimento,
            @RequestParam int qtdeBagagens,
            @RequestParam String genero
    ) {
        
        service.salvarRegistro(documentoID, nome, LocalDate.parse(nascimento), qtdeBagagens, genero);
        // Redireciona o usuario para a pagina de opcoes de voo
        return "redirect:/confirm.html";
    }

    @GetMapping("/carregarRegistro")
    public List<String> carregarRegistro() {
        return service.carregarRegistro();
    }
}


