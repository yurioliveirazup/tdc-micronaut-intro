package br.com.zup.edu;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
