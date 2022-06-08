package com.example.chattest;

import java.util.ArrayList;
import java.util.List;

import com.example.chattest.dominio.Factura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @GetMapping("/facturas")
    public List<Factura> buscarTodas() {
        List<Factura> lista = new ArrayList<>();
        lista.add(new Factura(1, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
