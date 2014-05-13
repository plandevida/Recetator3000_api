package com.recetatordeveloperteam.negocio.receta.entidad;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.alergia.AlergiaReceta;
import com.recetatordeveloperteam.negocio.categoria.CategoriaReceta;
import com.recetatordeveloperteam.negocio.ingrediente.IngredienteReceta;

@Entity
public class Receta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	private String nombre, descripcion;
	@Embedded
	private List<IngredienteReceta> ingredientes;
	@Embedded
	private List<CategoriaReceta> categorias;
	private Dificultades dificultad;
	private Float tiempo;
	@Embedded
	private List<AlergiaReceta> alergias;

	public Receta(String nombreReceta, List<IngredienteReceta> ingredientes,
			String descripcion, List<CategoriaReceta> categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, List<AlergiaReceta> alergia) {

		this.nombre = nombreReceta;
		this.descripcion = descripcion;
		this.ingredientes = ingredientes;
		this.categorias = categoria;
		this.dificultad = dificultad;
		this.tiempo = tiempoPreparacion;
		this.alergias = alergia;
	}

	public Receta(String nombreReceta) {
		this.nombre = nombreReceta;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
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

	public List<IngredienteReceta> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<IngredienteReceta> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<CategoriaReceta> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaReceta> categorias) {
		this.categorias = categorias;
	}

	public Dificultades getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultades dificultad) {
		this.dificultad = dificultad;
	}

	public Float getTiempo() {
		return tiempo;
	}

	public void setTiempo(Float tiempo) {
		this.tiempo = tiempo;
	}

	public List<AlergiaReceta> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<AlergiaReceta> alergias) {
		this.alergias = alergias;
	}
	public float calculaCalorias(){
		return 0;
		
	}
	
}
