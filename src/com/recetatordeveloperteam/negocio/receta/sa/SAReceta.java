package com.recetatordeveloperteam.negocio.receta.sa;

import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.recetatordeveloperteam.negocio.alergia.AlergiaReceta;
import com.recetatordeveloperteam.negocio.categoria.CategoriaReceta;
import com.recetatordeveloperteam.negocio.ingrediente.IngredienteReceta;
import com.recetatordeveloperteam.negocio.receta.entidad.Dificultades;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.receta.entidad.TipoCocina;

public interface SAReceta {

	// TODO cuando se cambie la BBDD sefuramente los ingredientes sean una lista
	// del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<IngredienteReceta> ingredientes,
			String descripcion, List<CategoriaReceta> categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, List<AlergiaReceta> alergia, TipoCocina tipoCocina);

	public List<Receta> getAllRecetas();

	public Key addReceta(String string);

	public JSONObject getAlergias();
}
