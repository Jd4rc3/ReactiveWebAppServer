package com.example.chattest;

import java.time.Duration;

import com.example.chattest.dominio.Factura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {
    @GetMapping("/facturas")
    public Flux<Factura> buscarTodas() {
        return Flux.just(new Factura(1, "ordenador", 200), new Factura(2, "tablet", 300)).delaySequence(
                Duration.ofSeconds(3));
    }
}
