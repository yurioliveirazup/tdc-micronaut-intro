package br.com.zup.edu;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/pizzas")
public interface PizzaClient {

    @Get("/{id}")
    Pizza pegaPizzaPor(Long id);
}
