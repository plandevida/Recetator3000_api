package com.recetatordeveloperteam.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.google.appengine.api.datastore.Key;

@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Key id;

	private String nombre;
	@ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY, optional = true)
	private Proyecto proyecto;
	
	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Employee() {
	
	}
	
	public String getNombre() {
		return nombre;
	}

	public Key getKey() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setKey(Key id) {
		this.id = id;
	}
	
	public void setNombre(String arg0){
		this.nombre=arg0;
	}
}
