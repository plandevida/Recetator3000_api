package com.recetatordeveloperteam.negocio.ingrediente;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;


@Embeddable
public class IngredienteReceta {

	@OneToOne
	private Ingrediente ingrediente;
	
	public Ingrediente getReceta() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente receta) {
		this.ingrediente = receta;
	}

	private float cantidad;

	public float getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(float cantidad) 
	{
		this.cantidad = cantidad;
	}
}
