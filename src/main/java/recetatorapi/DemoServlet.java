package recetatorapi;

import java.io.IOException;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("[{ \"name\": \"Worl\" }," + 
	"{ \"name2\": \"Emilibot\" }]");
	}
	
}
