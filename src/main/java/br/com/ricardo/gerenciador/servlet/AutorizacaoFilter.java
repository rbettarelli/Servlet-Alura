package br.com.ricardo.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.ricardo.gerenciador.acao.Acao;


//@WebFilter("/AutorizacaoFilter")
public class AutorizacaoFilter implements Filter {

    
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("AutorizacaoFIlter");
		
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		
		String paramAcao = request.getParameter("acao"); 
		
		

	    
	    HttpSession sessao = request.getSession();
	    boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
	    boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));

	    if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
	        response.sendRedirect("entrada?acao=LoginForm");
	        return;
	    }
		

		
		chain.doFilter(request, response);
		
		
		 
		 
	}

	

}
