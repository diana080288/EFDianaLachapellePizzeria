package com.idat.edu.EFDianaLachapellePizza.service;

import java.util.List;

import com.idat.edu.EFDianaLachapellePizza.model.pizza;

public interface pizzaservice {
	
 	List<pizza> listar();
	pizza obtenerId(Integer id);
	void guardar(pizza pizza);
	void eliminar(Integer id);
	void actualizar(pizza pizza);
	void asignarClientePizza();

}
