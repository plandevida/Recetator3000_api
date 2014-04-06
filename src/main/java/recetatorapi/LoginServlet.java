package recetatorapi;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String loginName = (String) req.getAttribute("loginname");
		String pass = (String) req.getAttribute("passwd");
		
		resp.setContentType("text/plain");
		resp.getWriter().println("[ \"respuesta\": \"correctamente\" ]");
	}
}
