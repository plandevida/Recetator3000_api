package com.recetatordeveloperteam.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.google.appengine.api.datastore.Key;

@Entity
public class Proyecto {

	@Id
     private long id;

	private String nombre;
	
	@OneToMany(mappedBy ="proyecto", cascade=CascadeType.ALL)
	private Set<Employee> empleados;

	public Proyecto() {
		empleados = new HashSet<>();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Employee> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Employee> empleados) {
		this.empleados = empleados;
	}
	
	
}
