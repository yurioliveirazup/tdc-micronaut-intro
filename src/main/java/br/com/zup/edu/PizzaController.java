package br.com.zup.edu;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/pizzas")
public class PizzaController {

    private final PizzaService service;

    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @Get("/{id}")
    public Pizza pegaPizzaPor(Long id) {

        return service.buscaPizzaPor(id);
    }
}
