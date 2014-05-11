package com.recetatordeveloperteam.presentacion.comandos.receta;

import java.util.Map;
import java.util.Map.Entry;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoAltaReceta implements Comando {

	@Override
	public ComandoRespuesta execute(Object datos) {
		
		Map<String,String[]> map1 = (Map<String, String[]>) datos;
		String salida = "";
		
		for (Entry<String, String[]> entry : map1.entrySet())
		{
		   salida += entry.getKey() + "-" + entry.getValue()[0];
		}
		
		ComandoRespuesta cr = new ComandoRespuesta();
		cr.setDatos(salida);
		cr.setEvento(IDEventos.EVENTO_ALTA_RECETA);
		
		return cr;
		
	}

}
