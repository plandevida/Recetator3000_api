package com.recetatordeveloperteam.negocio.receta.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Receta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;

	private String nombre, descripcion;
	private List<String> ingredientes;
	private Categorias categoria;
	private Dificultades dificultad;
	private Integer calorias;
	private Float tiempo;
	private Alergias alergias;

	public Receta(String nombreReceta, List<String> ingredientes,
			String descripcion, Categorias categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia) {

		this.nombre = nombreReceta;
		this.descripcion = descripcion;
		this.ingredientes = ingredientes;
		this.categoria = categoria;
		this.dificultad = dificultad;
		this.calorias = numeroCalorias;
		this.tiempo = tiempoPreparacion;
		this.alergias = alergia;
	}

	public Receta(String nombreReceta) {
		this.nombre = nombreReceta;
	}

	public Key getKey() {
		return this.id;
	}

	public void setKey(Key id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public Dificultades getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultades dificultad) {
		this.dificultad = dificultad;
	}

	public Integer getCalorias() {
		return calorias;
	}

	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}

	public Float getTiempo() {
		return tiempo;
	}

	public void setTiempo(Float tiempo) {
		this.tiempo = tiempo;
	}

	public Alergias getAlergias() {
		return alergias;
	}

	public void setAlergias(Alergias alergias) {
		this.alergias = alergias;
	}

}
