
package com.mistico.api.controller;

import com.mistico.api.model.Criatura;
import com.mistico.api.service.CriaturaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criaturas")
@RequiredArgsConstructor
public class CriaturaController {

    private final CriaturaService service;

    @GetMapping
    public List<Criatura> listar() {
        return service.listar();
    }

    @PostMapping
    public Criatura adicionar(@RequestBody @Valid Criatura criatura) {
        return service.adicionar(criatura);
    }
}
