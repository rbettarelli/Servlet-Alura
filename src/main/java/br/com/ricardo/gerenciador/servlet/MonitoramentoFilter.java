package br.com.ricardo.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


 //@WebFilter("/MonitoramentoFilter")
public class MonitoramentoFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("MonitormanetoFilter");
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de Execução da acao" + acao + (depois-antes));
	}
	
	
	
	


}
