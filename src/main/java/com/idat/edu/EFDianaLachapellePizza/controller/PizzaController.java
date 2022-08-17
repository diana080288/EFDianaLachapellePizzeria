package com.idat.edu.EFDianaLachapellePizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.edu.EFDianaLachapellePizza.model.pizza;
import com.idat.edu.EFDianaLachapellePizza.service.pizzaservice;

@Controller
@RequestMapping(path = "api/pizza/v1")

public class PizzaController {
	
	@Autowired
	private pizzaservice service;

	@GetMapping("/listar")
	public @ResponseBody List<pizza> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody pizza obtener(@PathVariable Integer id){
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody pizza pizza){
		service.guardar(pizza);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody pizza pizza) {
		service.actualizar(pizza);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzaCliente() {
		service.asignarClientePizza();
	}


	
}
