package com.recetatordeveloperteam.presentacion.comandos.receta;

import java.util.Map;
import java.util.Map.Entry;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoAltaReceta implements Comando {

	@Override
	public ComandoRespuesta execute(Object datos) {

		@SuppressWarnings("unchecked")
		Map<String, String[]> map1 = (Map<String, String[]>) datos;
		@SuppressWarnings("unused")
		String salida = "";

		for (Entry<String, String[]> entry : map1.entrySet()) {
			salida += entry.getKey() + "-" + entry.getValue()[0];
		}

		ComandoRespuesta cr = new ComandoRespuesta();
		/*
		 * public Key addReceta(String nombreReceta, List<String> ingredientes,
		 * String descripcion, Categorias categoria, Dificultades dificultad,
		 * Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia);
		 */

		cr.setDatos(FactorySA.getInstance().getSARecetas().addReceta("asd"));
		cr.setEvento(IDEventos.EVENTO_ALTA_RECETA);

		return cr;

	}

}
