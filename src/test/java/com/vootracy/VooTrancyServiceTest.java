package com.vootracy;

import com.vootrancy.service.VooTrancyService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.*;

class VooTrancyServiceTest {

    private final VooTrancyService service = new VooTrancyService();

    @Test
    void testSalvarHistorico() throws Exception {
        String destino = "São Paulo";
        String dataIda = "2025-08-22";
        String dataVolta = "2025-08-30";
        int numPassagens = 2;
        String classe = "Econômica";

        service.salvarHistorico(destino, dataIda, dataVolta, numPassagens, classe);

        String conteudo = Files.readString(Path.of("historico.txt"));
        assertTrue(conteudo.contains(destino));
    }
}
