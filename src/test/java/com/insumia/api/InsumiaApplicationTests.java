package com.insumia.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class InsumiaApplicationTests {

    @Autowired
    private InsumiaApplication controller;

    @Test
    void deveRetornarStatusOnline() {
        var resposta = controller.status();
        assertNotNull(resposta);
        assertEquals("ONLINE", resposta.get("status"));
    }

    @Test
    void deveListarTresInsumosNoEstoque() {
        var insumos = controller.listarInsumos();
        assertEquals(3, insumos.size());
    }
}