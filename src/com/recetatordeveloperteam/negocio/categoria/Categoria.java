package com.recetatordeveloperteam.negocio.categoria;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Categoria {
	
	@Id
	private Key id;
	
	private String nombre;
}
