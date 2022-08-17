package com.idat.edu.EFDianaLachapellePizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.EFDianaLachapellePizza.Repository.DetallePizzaRepository;
import com.idat.edu.EFDianaLachapellePizza.Repository.PizzaRepository;
import com.idat.edu.EFDianaLachapellePizza.model.ClientePizzaFK;
import com.idat.edu.EFDianaLachapellePizza.model.PizzaDetalle;
import com.idat.edu.EFDianaLachapellePizza.model.pizza;

@Service
public class pizzaserviceImpl implements pizzaservice {
	
	@Autowired
	private PizzaRepository repository;
	

	@Autowired
	private DetallePizzaRepository repositoryPizza;

	@Override
	public List<pizza> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public pizza obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(pizza pizza) {
		// TODO Auto-generated method stub
		repository.save(pizza);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(pizza pizza) {
	
		// TODO Auto-generated method stub
		repository.saveAndFlush(pizza);

	}

	@Override
	public void asignarClientePizza() {
		// TODO Auto-generated method stub
		
		ClientePizzaFK fk = null;
		PizzaDetalle detalle = null;
		
		fk = new ClientePizzaFK();
		fk.setIdcliente(4);
		fk.setIdPizza(4);
		detalle = new PizzaDetalle();
		detalle.setFk(fk);
		repositoryPizza.save(detalle);
		
	}

}
