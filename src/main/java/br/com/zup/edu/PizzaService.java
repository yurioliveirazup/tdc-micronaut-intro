package br.com.zup.edu;

import jakarta.inject.Singleton;

import java.util.HashMap;

@Singleton
public class PizzaService {

    private final PizzaRepository repository;

    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public Pizza buscaPizzaPor(Long id) {


        return repository.findById(id)
                         .orElseThrow(() -> new IllegalStateException("Pizza nao encontrada"));
    }
}
