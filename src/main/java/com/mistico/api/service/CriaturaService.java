
package com.mistico.api.service;

import com.mistico.api.model.Criatura;
import com.mistico.api.repository.CriaturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CriaturaService {

    private final CriaturaRepository repository;

    public List<Criatura> listar() {
        return repository.findAll();
    }

    public Criatura adicionar(Criatura criatura) {
        return repository.save(criatura);
    }
}
