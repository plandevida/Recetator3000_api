package com.recetatordeveloperteam.api;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@SequenceGenerator(name="SEQ1", sequenceName="MY_SEQ", initialValue=1, allocationSize=10)
	private long id;
	private String nombre;
	
	@ManyToMany
	private Set<Proyecto> proyecto;
	
	public Employee() {
		proyecto = new HashSet<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public long getKey() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setKey(long id) {
		this.id = id;
	}
	
	public void setNombre(String arg0){
		this.nombre=arg0;
	}
}
