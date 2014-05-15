package com.recetatordeveloperteam.presentacion.comandos.receta;

import java.util.List;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoListarRecetas implements Comando {

	@Override
	public ComandoRespuesta execute(Object datos) {
		ComandoRespuesta cr = new ComandoRespuesta();
		/*
		 * public Key addReceta(String nombreReceta, List<String> ingredientes,
		 * String descripcion, Categorias categoria, Dificultades dificultad,
		 * Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia);
		 */
		List<Receta> m = FactorySA.getInstance().getSARecetas().getAllRecetas();
		String salida = "";
		for( Receta r : m )
		{
			salida += r.getId() + r.getNombre() + '\n';
		}
	
		cr.setDatos(salida);
		cr.setEvento(IDEventos.EVENTO_ALTA_RECETA);

		return cr;
		
	}

}
