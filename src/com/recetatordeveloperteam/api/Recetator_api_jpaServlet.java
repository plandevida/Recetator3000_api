package com.recetatordeveloperteam.api;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recetatordeveloperteam.EMF.EMF;
import com.recetatordeveloperteam.Entities.Employee;
import com.recetatordeveloperteam.Entities.Proyecto;

@SuppressWarnings("serial")
public class Recetator_api_jpaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
EntityManager em = EMF.get().createEntityManager();

	Employee e = new Employee();
	
	e.setNombre("DB");
	Proyecto p= new Proyecto();
	p.setId(1);
	p.setNombre("GPS");
	p.getEmpleados().add(e);

	em.getTransaction().begin();

	em.persist(p);
	em.getTransaction().commit();
	em.detach(p);

	Proyecto d= em.find(Proyecto.class,1);

	Employee z= d.getEmpleados().iterator().next();

	resp.setContentType("text/plain");
	resp.getWriter().println(d.getId()+" "+d.getNombre()+" "+z.getNombre()+" "+z.getKey());
	}
}
