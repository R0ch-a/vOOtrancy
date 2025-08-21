package com.vootrancy.service;

import com.vootrancy.model.Reserva;
import com.vootrancy.model.entities.Passagem;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VooTrancyService {
    
    private final Path historicoPath = Path.of("historico.txt");


    public void salvarHistorico (Reserva Reserva) {
        
    }
    public void carregarHistorico (Reserva Reserva) {
        
    }
    public void salvarRegistro (Reserva Reserva) {

    }
    public void carregarRegistro (Reserva Reserva) {

    }
}
