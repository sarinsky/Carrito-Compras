package com.domain.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.Controller.ControladorUsuario;
import com.domain.Controller.ControllerStoreProcedure;
import com.modelo.dao.Conexion;
import com.modelo.dao.RegistroPersona;

/**
 * Servlet implementation class ServletRegistroUsuario
 */
@WebServlet("/ServletRegistroUsuario")
public class ServletRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistroUsuario() {
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

		ControllerStoreProcedure csp = new ControllerStoreProcedure();
		RegistroPersona per = new RegistroPersona();
		per.setNombre(request.getParameter("nomUsu"));
		per.setCorreo(request.getParameter("correo"));
		per.setPass(request.getParameter("pass"));
		csp.addUsuario(per);
		
		response.sendRedirect("vistaJSP/Bienvenido.jsp");
		/*
		Conexion conexion = new Conexion();
		Connection con = conexion.conectar();
		ControladorUsuario controladorUsuario = new ControladorUsuario();
		//
		RegistroPersona reP= new RegistroPersona();
		reP.setNombre(request.getParameter("nomUsu"));
		reP.setCorreo(request.getParameter("correo"));
		reP.setPass(request.getParameter("pass"));
		 controladorUsuario.insertUsuario(reP);
		 
		//controladorUsuario.insertUsuario(reP);
		 response.sendRedirect("vistaJSP/Bienvenido.jsp");
		 //RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login");
			//requestDispatcher.forward(req, resp);
		 */
	}

}
