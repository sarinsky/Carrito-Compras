package com.domain.Controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.modelo.dao.Conexion;
import com.modelo.dao.RegistroPersona;

public class ControllerStoreProcedure {
	;

	public static String existeUsuario(String correo, String password) {
		//Connection conn=null;
			Conexion conexio= new Conexion();
			Connection con = conexio.conectar();
			String salida=null;
			try {
			 CallableStatement cst=con.prepareCall("{?=call LOGIN(?,?)}");
			    
			    cst.registerOutParameter(1, Types.VARCHAR);
			    cst.setString(2,correo);
			    cst.setString(3,password);
			    cst.execute();
			    salida= cst.getString(1);
			    System.out.println(salida);
			    
			    if (salida!= null ) {
					
				}
			   con.close();
			    //System.out.println(cst.getInt(1));
			    System.out.println("Fin del SP");
			    
			    return salida;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	}
			return salida;
	
	}
	public void addUsuario(RegistroPersona persona) {
		Conexion conexio= new Conexion();
		Connection con = conexio.conectar();
		String mensaje ="";
		try {
	
				 CallableStatement cst=con.prepareCall("{call CREAR_USR(?,?, ?)}");
				    cst.setString(1, persona.getNombre());
				    cst.setString(2, persona.getCorreo());
				    cst.setString(3, persona.getPass());
				    
				    cst.execute();
				   
				    System.out.println("Fin del SP");
				    cst.close();
				   
				} catch (Exception e) {
					// TODO Auto-generated catch block
					mensaje = "No se pudo guardar correctamente \n"+ e.getMessage();
			
		}
			
		
	}
	
}
