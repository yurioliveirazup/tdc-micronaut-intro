package br.com.zup.edu;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sabor;
    private double preco;

    public Pizza() { }

    public Pizza(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }
}
