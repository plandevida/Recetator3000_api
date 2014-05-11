package com.recetatordeveloperteam.presentacion.controlador.aplicacion.imp;

import java.io.IOException;

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

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		String ruta = req.getRequestURI();
		Comando comando = null;
		switch(ruta)
		{
		
		case "/addreceta" : comando = FactoriaComandos.getInstance().nuevoComando(IDEventos.EVENTO_ALTA_RECETA);
		resp.getWriter().println(req.getParameter("ingredientes"));
		
		break;
			
		default : resp.setContentType("text/plain");
			resp.getWriter().println("esta no es la pagina que buscas ;D");
		}
		
		
		
		//ComandoRespuesta rc = comando.execute(void);
			
			

	}
	
}
