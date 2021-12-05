package br.com.ricardo.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns = "/oi")
public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, voce escreveu seu primeiro servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet Oi mundoservelt foi chamado");
		
	
	}

}
