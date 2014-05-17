package com.recetatordeveloperteam.negocio.ingrediente.sa;

import com.google.appengine.api.datastore.Key;

public interface SAIngrediente 
{
	public Key addIngrediente(String nombre, String unidad, float calorias);
}
