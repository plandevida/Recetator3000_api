package com.recetatordeveloperteam.negocio.alergia;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Alergia {
	
	@Id
	private Key id;
	
	private String nombre;

}
