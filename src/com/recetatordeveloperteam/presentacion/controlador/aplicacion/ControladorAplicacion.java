package com.recetatordeveloperteam.presentacion.controlador.aplicacion;

import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.controlador.aplicacion.imp.ControladorAplicacionImp;

public abstract class ControladorAplicacion {
	private static ControladorAplicacion controladorAplicacionInstance;
	
	public static ControladorAplicacion getInstance() {
		createApplicationController();
		return controladorAplicacionInstance;
	}

	private static void createApplicationController() {
		if (controladorAplicacionInstance == null)
			controladorAplicacionInstance = new ControladorAplicacionImp();
	}
	
	public abstract void handleRequest(IDEventos evento, Object datos);
}
