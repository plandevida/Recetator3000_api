package com.recetatordeveloperteam.presentacion.controlador.aplicacion.imp;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recetatordeveloperteam.presentacion.controlador.aplicacion.ControladorAplicacion;

public class ControladorAplicacionImp extends ControladorAplicacion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5688085232129774014L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)

	{
		resp.setContentType("text/plain");
		try {
			resp.getWriter().println("guatdafaq");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

	}

	protected void doPut(HttpServletRequest req, HttpServletResponse resp) {

	}
}
