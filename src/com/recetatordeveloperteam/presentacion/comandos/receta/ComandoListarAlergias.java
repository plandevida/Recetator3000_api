package com.recetatordeveloperteam.presentacion.comandos.receta;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoListarAlergias implements Comando {

	@Override
	public ComandoRespuesta execute(Object datos) {
		
		ComandoRespuesta cr = new ComandoRespuesta();
		/*
		 * public Key addReceta(String nombreReceta, List<String> ingredientes,
		 * String descripcion, Categorias categoria, Dificultades dificultad,
		 * Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia);
		 */

		cr.setDatos(FactorySA.getInstance().getSARecetas().getAlergias());
		cr.setEvento(IDEventos.EVENTO_LISTAR_ALERGIAS);

		return cr;
	}

}
