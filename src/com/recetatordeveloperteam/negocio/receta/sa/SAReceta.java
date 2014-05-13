package com.recetatordeveloperteam.negocio.receta.sa;

import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.recetatordeveloperteam.negocio.receta.entidad.Alergias;
import com.recetatordeveloperteam.negocio.receta.entidad.Categorias;
import com.recetatordeveloperteam.negocio.receta.entidad.Dificultades;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;

public interface SAReceta {

	// TODO cuando se cambie la BBDD sefuramente los ingredientes sean una lista
	// del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<String> ingredientes,
			String descripcion, Categorias categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia);

	public List<Receta> getAllRecetas();

	public Key addReceta(String string);

	public JSONObject getAlergias();
}
