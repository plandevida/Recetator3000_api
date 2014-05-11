package com.recetatordeveloperteam.presentacion.comandos.factoria.imp;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.comandos.factoria.FactoriaComandos;
import com.recetatordeveloperteam.presentacion.comandos.receta.ComandoAltaReceta;

public class FactoriaComandosImp extends FactoriaComandos {

	@Override
	public Comando nuevoComando(IDEventos id_comando) {

		
		Comando c = null;
		switch(id_comando)
		{
		
		case EVENTO_ALTA_RECETA: c = new ComandoAltaReceta();
		default:
			break;
		
		}
		
		return c;
		
	}

}
