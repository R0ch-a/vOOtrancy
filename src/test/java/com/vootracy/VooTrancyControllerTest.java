package com.vootrancy.controller;

import com.vootrancy.service.VooTrancyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(VooTrancyController.class)
class VooTrancyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Mocka o service para não acessar arquivos reais
    @MockBean
    private VooTrancyService service;

    @Test
    void testSalvarHistorico() throws Exception {
        mockMvc.perform(post("/salvarHistorico")
                .param("destino", "Paris")
                .param("dataIda", "2025-01-10")
                .param("dataVolta", "2025-01-20")
                .param("numPassagens", "2")
                .param("classe", "Econômica"))
                .andExpect(status().is3xxRedirection()) // espera um redirect
                .andExpect(redirectedUrl("/voos.html"));

        verify(service, times(1))
                .salvarHistorico("Paris", LocalDate.of(2025,1,10),
                        LocalDate.of(2025,1,20), 2, "Econômica");
    }

    @Test
    void testCarregarHistorico() throws Exception {
        when(service.carregarHistorico()).thenReturn(List.of("Paris,2025-01-10,2025-01-20,2,Econômica"));

        mockMvc.perform(get("/carregarHistorico"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("Paris,2025-01-10,2025-01-20,2,Econômica"));

        verify(service, times(1)).carregarHistorico();
    }

    @Test
    void testSalvarRegistro() throws Exception {
        mockMvc.perform(post("/salvarRegistro")
                .param("documentoID", "123456789")
                .param("nome", "João Silva")
                .param("nascimento", "1990-05-15")
                .param("qtdeBagagens", "2")
                .param("genero", "Masculino"))
                .andExpect(status().is3xxRedirection()) // espera redirect
                .andExpect(redirectedUrl("/confirm.html"));

        verify(service, times(1))
                .salvarRegistro("123456789", "João Silva",
                        LocalDate.of(1990,5,15), 2, "Masculino");
    }

    @Test
    void testCarregarRegistro() throws Exception {
        when(service.carregarRegistro()).thenReturn(List.of("123456789,João Silva,1990-05-15,2,Masculino"));

        mockMvc.perform(get("/carregarRegistro"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("123456789,João Silva,1990-05-15,2,Masculino"));

        verify(service, times(1)).carregarRegistro();
    }
}
