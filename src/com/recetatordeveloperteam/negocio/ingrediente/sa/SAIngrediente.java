package com.recetatordeveloperteam.negocio.ingrediente.sa;

import java.util.List;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;

public interface SAIngrediente 
{
	public Key addIngrediente(String nombre, String unidad, float calorias);
	public List<Ingrediente> getAllIngredientes();
}
