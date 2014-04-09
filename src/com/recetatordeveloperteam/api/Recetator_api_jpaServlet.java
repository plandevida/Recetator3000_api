package com.recetatordeveloperteam.api;
import java.io.IOException;
import java.util.Set;

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
		e.setKey(1);
		e.setNombre("DB");
		Proyecto p= new Proyecto();
		p.setId(1);
		p.setNombre("GPS");
		Set<Employee> empleados=p.getEmpleados();
		empleados.add(e);
		p.setEmpleados(empleados);
		em.getTransaction().begin();
		
		em.persist(p);
		em.getTransaction().commit();
		em.detach(p);
		
		Proyecto d= em.find(Proyecto.class,1);
		
		Employee z= d.getEmpleados().iterator().next();
		
		resp.setContentType("text/plain");
		resp.getWriter().println(z.getKey()+" "+z.getNombre());
	}
}
