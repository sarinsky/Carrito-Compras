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

import com.domain.Controller.ControladorUsuario;
import com.domain.Controller.ControllerStoreProcedure;

/**
 * Servlet implementation class ServletLoginValidacion
 */
@WebServlet("/ServletLoginValidacion")
public class ServletLoginValidacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLoginValidacion() {
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
		doGet(request, response);
		String correo1 = request.getParameter("correo");
		String pwd = request.getParameter("pass");
		/*String action= request.getParameter("action");
		if (action != null && action.equals("invalidate")) {
			
		}
		
		*			
			/*HttpSession session1 = request.getSession();	
				int itemcount = 0; 
				ArrayList cart = (ArrayList) session.getAttribute ("cart"); 
				if (cart != null) { 
				itemcount = cart. size ( ) ; 
				}*/
	
		
		
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		ControllerStoreProcedure csp = new ControllerStoreProcedure();
		String res= csp.existeUsuario(correo1, pwd);
		if (res!=null ) {
			session.setAttribute("correo", res);
			response.sendRedirect(request.getContextPath() + "/vistaJSP/Bienvenido.jsp");
			System.out.println(request.getContextPath());
			//response.sendRedirect("/vistaJSP/Bienvenido.jsp");

			
		}else {
			System.out.println("USUARIO O CONTRASEÑA INCORRECTOS ");
			out.println("<script type=\"text/javascript\">");
		       out.println("alert('User or password incorrect');");
		       out.println("</script>");
			response.sendRedirect("Index.jsp");
		}
		/*ControladorUsuario conUsu = new ControladorUsuario();
		String res = conUsu.existeUsuario(correo1, pwd);
		HttpSession session = request.getSession();
		System.out.println("Imprimo Nom EN SERVLET LOGIN: "+res);*/
		
		/*
		if (res!=null) {
			
			
			session.setAttribute("correo", res);
			
			
			//response.sendRedirect("vistaJSP/Bienvenido.jsp");
			response.sendRedirect("vistaJSP/Bienvenido.jsp");
		}else {
			System.out.println("USUARIO O CONTRASEÑA INCORRECTOS ");
			//response.getWriter().append("USUARIO CONTRASEÑA INCORRECTS");
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Usuario o contraseña incorrectos');");
			//pw.println("window.history.back();");
			pw.println("</script>");
			response.sendRedirect("Index.jsp");
		}*/
	}

}
