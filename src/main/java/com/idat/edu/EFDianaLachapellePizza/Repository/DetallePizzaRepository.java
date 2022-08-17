package com.idat.edu.EFDianaLachapellePizza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.EFDianaLachapellePizza.model.PizzaDetalle;

@Repository
public interface DetallePizzaRepository extends JpaRepository<PizzaDetalle, Integer>{
	
	

}
