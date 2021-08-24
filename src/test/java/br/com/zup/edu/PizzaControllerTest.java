package br.com.zup.edu;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class PizzaControllerTest {

    @Inject
    PizzaClient client;


    @Test
    void testPizza() {

        Pizza pizza = client.pegaPizzaPor("calabresa");

        assertEquals("Calabresa", pizza.getSabor());
        assertEquals(20.0, pizza.getPreco());
    }
}