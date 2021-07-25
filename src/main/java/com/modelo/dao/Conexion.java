package com.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	Connection conn=null;
	public Connection conectar() {
		try {
			System.out.println("entre al try de Conexion");
			Class.forName("oracle.jdbc.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "TRNETWORK_SARA",
					"uno");
			if (conn != null) {
                System.out.println("Connected with connection #Con");
			}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conn;
		
	}
	/*public static void main(String[] args) {
		Conexion cn= new Conexion();
		System.out.println("Conecto " +cn);
	}*/




	
	/*public static Connection enviarConexion() {
		return conn;
		
	}*/
	
	
	


}
