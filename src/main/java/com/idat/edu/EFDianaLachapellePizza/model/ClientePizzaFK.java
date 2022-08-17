package com.idat.edu.EFDianaLachapellePizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePizzaFK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6616733843372939069L;

	@Column(name = "idcliente", nullable = false, unique = true)
	private Integer idcliente;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public Integer getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
