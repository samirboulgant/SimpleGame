package com.nombre.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nombre.beans.donnés;
import com.nombre.metier.Metier;


 @WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE="/Vue.jsp"; 
    private Metier metier =new Metier();
    
  
    public Controle() {
        super();
        metier.generersecret();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(VUE).forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nbr = Integer.parseInt(request.getParameter("nbr"));
		HttpSession session=request.getSession();
		donnés don;
		if(session.getAttribute("don")==null) {
			don = new donnés();
			session.setAttribute("don", don);
		}
		else {
			don = (donnés) session.getAttribute("don");
		}
		String rep=metier.jouer(nbr);
		don.getRespanse().add(rep);
		request.getRequestDispatcher(VUE).forward(request, response);

		
	}

}
