package com.domain.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.modelo.dao.Conexion;
import com.modelo.dao.RegistroPersona;



public class ControladorUsuario {
	
	
	public static String existeUsuario(String correo, String password) {
		Conexion conexion = new Conexion();
		String query = "select * from TRNETWORK_SARA.USUARIO where CORREO_USU='"+ correo+"' AND PWD_USU='"+password+"'";
		System.out.println("imprimo query del existeUsuario"+query);
		//String sql ="Insert into usuario (ID_USER.nextval'"+usuario+"',"+"'"+ email+"',"+password+"'"+")";
		String salida=null;
		Connection con = conexion.conectar();
		//existeUsuario existe;
		try {
			
			Statement stmt = con.createStatement();
		    ResultSet rset = stmt.executeQuery(query);

		    
		    //System.out.println("Resulset" + rset);
			/*PreparedStatement pst =con.prepareStatement(query);
			pst.setString(1, correo);
			pst.setString(2, password);
			ResultSet rst = pst.executeQuery();*/
			if (rset.next()) {
				
				salida = rset.getString("NOM_USU");
				return salida;
			}
			rset.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return salida;
		
	}
	 public void insertUsuario(RegistroPersona persona) {
		 String mensaje=null;
		 Conexion conexion = new Conexion();
		 // "INSERT INTO TRNETWORK_SARA.USUARIO (CVE_USU, NOM_USU CORREO_USU, PWD_USU)"+" VALUES (TRNETWORK_SARA.USUARIO_SEQ.NEXTVAL, ?, ?, ?)";
		 String sql ="INSERT INTO TRNETWORK_SARA.USUARIO (CVE_USU, NOM_USU, CORREO_USU, PWD_USU) VALUES (sec_user.NEXTVAL, ?, ?, ?)";
		 Connection con = conexion.conectar();
		 System.out.println("controlador usuario"+ sql);
		 try {
			con = conexion.conectar();
			System.out.println("Conexion obtenida");
			PreparedStatement pst = con.prepareStatement(sql);
			//pst.setInt(1, persona.getClave());
			pst.setString(1, persona.getNombre());
			pst.setString(2, persona.getCorreo());
			pst.setString(3, persona.getPass());
			System.out.println("Guardaddo correctamente"); 
			pst.executeUpdate(); 
			System.out.println(pst);
			
			pst.close();
		} catch (SQLException e) {
			mensaje = "NO SE PUDO GUARDAR  CORRECTAMENTE \n"+ e.getMessage();
			//e.printStackTrace();
		}finally {
			if (con!=null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					
				}
			}
		}
	 }
	//insert into TRNETWORK_SARA.USUARIO (CVE_USU, NOM_USU,	 CORREO_USU,PWD_USU) VALUES (1, 'SARA', 'sara@gmail.com', '1234');
	/*	public static String existeUsuario(String correo, String password) {
        String query = "select *  from empleado where CORREO_USU=? and PWD_USU=?";
        String salida = "";
        Connection conexion = Conexion.enviarConexion();
        try {
        	PreparedStatement pst;
            pst = conexion.prepareStatement(query);
            pst.setString(1, correo);
            pst.setString(6, password);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                salida = resultSet.getString("NOM_USU"); 
                return salida;
            }
        } catch (SQLException ex) {
           
        }
        return salida;
    }*/

}
