package com.recetatordeveloperteam.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Proyecto {

	@Id
	private long id;
	private String nombre;
	
	@ManyToMany(mappedBy="proyecto")
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
