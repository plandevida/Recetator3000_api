package com.recetatordeveloperteam.presentacion.controlador.aplicacion;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.controlador.aplicacion.imp.ControladorAplicacionImp;

public abstract class ControladorAplicacion extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9048064705085705849L;
	private static ControladorAplicacion controladorAplicacionInstance;

	public static ControladorAplicacion getInstance() {
		createApplicationController();
		return controladorAplicacionInstance;
	}

	private static void createApplicationController() {
		if (controladorAplicacionInstance == null)
			controladorAplicacionInstance = new ControladorAplicacionImp();
	}

}
