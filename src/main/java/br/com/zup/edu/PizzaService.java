package br.com.zup.edu;

import jakarta.inject.Singleton;

import java.util.HashMap;

@Singleton
public class PizzaService {

    public Pizza buscaPizzaPor(String sabor) {
        HashMap<String, Pizza> pizzas = new HashMap<>();

        pizzas.put("mucarela", new Pizza("Muçarela", 20.0));
        pizzas.put("calabresa", new Pizza("Calabresa", 20.0));
        pizzas.put("portuguesa", new Pizza("Calabresa", 25.0));


        return pizzas.get(sabor);
    }
}
