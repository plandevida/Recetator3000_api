package com.recetatordeveloperteam.presentacion.controlador.aplicacion.imp;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.comandos.factoria.FactoriaComandos;
import com.recetatordeveloperteam.presentacion.comandos.factoria.imp.FactoriaComandosImp;
import com.recetatordeveloperteam.presentacion.controlador.aplicacion.ControladorAplicacion;

public class ControladorAplicacionImp extends ControladorAplicacion {

	private static final long serialVersionUID = 5688085232129774014L;

	@SuppressWarnings("unchecked")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String ruta = req.getRequestURI();
		Comando comando = null;
		Map<String, String[]> m = null;
		switch (ruta) {

		case "/addreceta":
			comando = FactoriaComandos.getInstance().nuevoComando(
					IDEventos.EVENTO_ALTA_RECETA);
			m = req.getParameterMap();

			break;
		case "/getrecetas":	
			comando = FactoriaComandos.getInstance().nuevoComando(
					IDEventos.EVENTO_LISTAR_RECETAS);
			break;
		case "/getingredientes": 
			comando = FactoriaComandos.getInstance().nuevoComando(
					IDEventos.EVENTO_LISTAR_INGREDIENTES);
			break;
		case "/getalergias": 
			comando = FactoriaComandos.getInstance().nuevoComando(
					IDEventos.EVENTO_LISTAR_ALERGIAS);
			break;
					default:
			comando = FactoriaComandos.getInstance().nuevoComando(
					IDEventos.NOT_FOUND);
			break;
		}

		ComandoRespuesta rc = comando.execute((Object) m);
		resp.getWriter().println(rc.getDatos());

	}

}
