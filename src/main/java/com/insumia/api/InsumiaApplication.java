package com.insumia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class InsumiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsumiaApplication.class, args);
    }

    @GetMapping("/")
    public Map<String, String> status() {
        return Map.of(
            "projeto", "Insumia - Gestão Inteligente de Insumos Hospitalares",
            "status", "ONLINE",
            "esg_impact", "Redução de 25.6 kg de resíduos hospitalares na semana"
        );
    }

    @GetMapping("/insumos")
    public List<Map<String, Object>> listarInsumos() {
        return List.of(
            Map.of("id", 1, "item", "Luvas cirúrgicas esterilizadas", "quantidade", 320, "alertaVencimento", "OK"),
            Map.of("id", 2, "item", "Seringa 10ml", "quantidade", 210, "alertaVencimento", "OK"),
            Map.of("id", 3, "item", "Gazes Pads 4x4", "quantidade", 145, "alertaVencimento", "EXPIRA_EM_7_DIAS")
        );
    }
}