package com.recetatordeveloperteam.negocio.ingrediente;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;


@Embeddable
public class IngredienteReceta {

	@OneToOne
	private Receta receta;
	
	private float cantidad;
}
