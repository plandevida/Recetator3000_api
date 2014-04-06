package recetatorapi;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetRecetas extends HttpServlet { 
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		String nombre = req.getParameter("nombre");
		resp.getWriter().println("nombre:" +nombre);
		
		
		
	}
}
