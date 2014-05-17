package com.recetatordeveloperteam.presentacion.comandos.factoria.imp;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.comandos.errores.ComandoNoEncontrado;
import com.recetatordeveloperteam.presentacion.comandos.factoria.FactoriaComandos;
import com.recetatordeveloperteam.presentacion.comandos.ingrediente.ComandoAltaIngrediente;
import com.recetatordeveloperteam.presentacion.comandos.ingrediente.ComandoListarIngrediente;
import com.recetatordeveloperteam.presentacion.comandos.receta.ComandoAltaReceta;
import com.recetatordeveloperteam.presentacion.comandos.receta.ComandoListarAlergias;
import com.recetatordeveloperteam.presentacion.comandos.receta.ComandoListarRecetas;

public class FactoriaComandosImp extends FactoriaComandos {

	@Override
	public Comando nuevoComando(IDEventos id_comando) {

		Comando c = null;
		switch (id_comando) {

		case EVENTO_ALTA_RECETA:
			c = new ComandoAltaReceta();
			break;
		case EVENTO_LISTAR_RECETAS:
			c = new ComandoListarRecetas();
			break;
		case NOT_FOUND:
			c = new ComandoNoEncontrado();
			break;
		case EVENTO_LISTAR_ALERGIAS:
			c = new ComandoListarAlergias();
			break;
			
		case EVENTO_ALTA_INGREDIENTE:
			c = new ComandoAltaIngrediente();
			break;
			
		case EVENTO_LISTAR_INGREDIENTES:
			c = new ComandoListarIngrediente();
			break;
			
		default:
			c = new ComandoNoEncontrado();
			break;

		}

		return c;

	}

}
