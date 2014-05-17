package com.recetatordeveloperteam.presentacion.comandos.ingrediente;

import java.util.Map;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoAltaIngrediente implements Comando
{

	@Override
	public ComandoRespuesta execute(Object datos) 
	{
		@SuppressWarnings("unchecked")
		Map<String, String[]> map1 = (Map<String, String[]>) datos;
		
		String nombre;
		String unidad;
		float calorias = 0;
		
		nombre = map1.get("NOMBRE")[0];
		unidad = map1.get("UNIDAD")[0];
		try
		{
			calorias = Float.parseFloat(map1.get("CALORIAS")[0]);
		}
		catch (Exception e)
		{
			// Error en el parseo, no metieron un numero.
		}
		
		ComandoRespuesta cr = new ComandoRespuesta();
		
		if (nombre != null &&  unidad != null &&  calorias > 0)
		{
			cr.setDatos(FactorySA.getInstance().getSAIngrediente().addIngrediente(nombre,unidad,calorias));
			cr.setEvento(IDEventos.EVENTO_ALTA_RECETA);
		}
		else
		{
			cr.setDatos(null);
			cr.setEvento(IDEventos.ERROR_ALTA_INGREDIENTE);
		}
		return cr;
	}

}
