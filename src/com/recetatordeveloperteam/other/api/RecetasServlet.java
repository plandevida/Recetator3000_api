package com.recetatordeveloperteam.other.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;
import com.recetatordeveloperteam.negocio.receta.sa.imp.SARecetaImp;
import com.recetatordeveloperteam.negocio.recetas.Alergias;
import com.recetatordeveloperteam.negocio.recetas.Categorias;
import com.recetatordeveloperteam.negocio.recetas.Dificultades;

public class RecetasServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {

		String nombre = req.getParameter("nombrereceta");

		if (nombre != null && !"".equals(nombre)) {
			List<String> ingredientes = new ArrayList<>();
			ingredientes.add(req.getParameter("ingrediente"));
			String desc = req.getParameter("descripcion");
			Categorias cat = Categorias.valueOf(req.getParameter("categorias")
					.toUpperCase());
			Dificultades dif = Dificultades.valueOf(req.getParameter(
					"dificultad").toUpperCase());
			Integer calorias = Integer.valueOf(req.getParameter("calorias"));
			Float tiempo = Float.valueOf(req.getParameter("tiempo"));
			Alergias ale = Alergias.valueOf(req.getParameter("alergias")
					.toUpperCase());

			SAReceta sa = new SARecetaImp();

			Key id = sa.addReceta(nombre, ingredientes, desc, cat, dif,
					calorias, tiempo, ale);

			try {
				res.setContentType("text/plain");
				res.getWriter().println("{ \"id\": \"" + id + "\" }");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			SAReceta sa = new SARecetaImp();

			List<Receta> lista = sa.getAllRecetas();

			for (Receta r : lista) {
				try {
					res.setContentType("text/plain");
					res.getWriter().println(
							"{ \"nombre\": \"" + r.getNombre() + "\" }");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		this.doPost(req, res);
	}
}
