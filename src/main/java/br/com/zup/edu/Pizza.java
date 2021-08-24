package br.com.zup.edu;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Pizza {

    private String sabor;
    private double preco;

    public Pizza() { }

    public Pizza(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }
}
