package com.idat.edu.EFDianaLachapellePizza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.EFDianaLachapellePizza.model.pizza;

@Repository
public interface PizzaRepository extends JpaRepository<pizza, Integer> {

}
