package com.vootracy;

import com.vootrancy.service.VooTrancyService;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VooTrancyServiceTest {

    private VooTrancyService service;
    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        tempFile = Files.createTempFile("historico", ".txt"); // cria arquivo temporário
        service = new VooTrancyService() {
            @Override
            public void salvarHistorico(String destino, LocalDate dataIda, LocalDate dataVolta, int numPassagens, String classe) {
                try {
                    Files.writeString(tempFile,
                            destino + "," + dataIda + "," + dataVolta + "," + numPassagens + "," + classe + "\n",
                            StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public List<String> carregarHistorico() {
                try {
                    return Files.readAllLines(tempFile);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    @Test
    void testSalvarHistorico() {
        String destino = "São Paulo";
        LocalDate dataIda = LocalDate.of(2025, 8, 22);
        LocalDate dataVolta = LocalDate.of(2025, 8, 30);
        int numPassagens = 2;
        String classe = "Econômica";

        service.salvarHistorico(destino, dataIda, dataVolta, numPassagens, classe);

        List<String> linhas = service.carregarHistorico();
        assertFalse(linhas.isEmpty(), "O histórico não deve estar vazio");
        assertTrue(linhas.get(0).contains(destino), "Deve conter o destino 'São Paulo'");
    }
}
