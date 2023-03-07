package br.com.fiap.dindin.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.dindin.models.Despesa;

@RestController
public class DespesaController {

    @GetMapping("/api/despesas")
    public Despesa show(){
        return new Despesa(new BigDecimal(100), LocalDate.now(), "cinema");
    }
    
}
