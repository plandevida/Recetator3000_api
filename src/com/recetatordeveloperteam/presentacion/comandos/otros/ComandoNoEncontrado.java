package com.recetatordeveloperteam.presentacion.comandos.otros;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoNoEncontrado implements Comando {

	@Override
	public ComandoRespuesta execute(Object datos) {

		ComandoRespuesta cr = new ComandoRespuesta();
		cr.setDatos("<b>Esta no es la pagina que buscas xD</b>");
		cr.setEvento(IDEventos.NOT_FOUND);

		return cr;

	}

}
