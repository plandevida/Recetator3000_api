package com.recetatordeveloperteam.negocio.ingrediente;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Ingrediente {
	@Id
	private Key id;
	
	private String nombre;
	
	private String unidad;
}
