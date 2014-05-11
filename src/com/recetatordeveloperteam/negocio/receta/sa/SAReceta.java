package com.recetatordeveloperteam.negocio.receta.sa;

import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.recetas.Alergias;
import com.recetatordeveloperteam.negocio.recetas.Categorias;
import com.recetatordeveloperteam.negocio.recetas.Dificultades;

public interface SAReceta {

	// TODO cuando se cambie la BBDD sefuramente los ingredientes sean una lista
	// del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<String> ingredientes,
			String descripcion, Categorias categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia);

	public List<Receta> getAllRecetas();
}
