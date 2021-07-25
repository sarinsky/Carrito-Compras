package com.domain.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.Controller.ControladorListar;
import com.modelo.dao.Libro;
import com.modelo.dao.VideoJuego;

/**
 * Servlet implementation class ServletListar
 */
@WebServlet("/ServletListar")
public class ServletListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession sesionListar = request.getSession(); 
		String opcion = request.getParameter("tipo");
		String nombre;
		ControladorListar conLib = new ControladorListar();
		ControladorListar conVid = new ControladorListar();
		
		ArrayList<Libro> li= conLib.getListLibros();
		ArrayList<VideoJuego> vid = conVid.getListVideoJuegos();
		
		
		if (opcion.equals("1")) {
		for (Libro libro : li) {
			PrintWriter out=response.getWriter();
			
			out.println(libro.getNomLibro());
		    out.println(libro.getAutorLibro());
		   
		}
			/*response.getWriter().append("<p>Libros</p>");*/
			
			//response.sendRedirect("/vistasJSP/header.jsp");
		}else {
			//PrintWriter pw = 
			response.getWriter().append("<p>Videojuegos</p>");
			for (VideoJuego videoJuego : vid) {
				response.getWriter().append(videoJuego.getNom_video());
			
				 //response.getWriter().append(videoJuego.getNom_video());
				 //response.getWriter().append(videoJuego.getDistribuidora());
				 //out.println(videoJuego.getNom_video());
				//out.println(videoJuego.getDistribuidora());
			}
			
		}
	}

}
