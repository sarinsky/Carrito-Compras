package com.domain.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.modelo.dao.Conexion;
import com.modelo.dao.Libro;
import com.modelo.dao.VideoJuego;

public class ControladorListar {
	
	public ArrayList<Libro> getListLibros(){
		System.out.println("hola xD ");
		ArrayList<Libro> listaLibros= new ArrayList<Libro>();
		//String query2 = "select * from TRNETWORK_SARA.USUARIO";
		
		Conexion conexion = new Conexion();
		Connection con = conexion.conectar();
		String query = "select * from TRNETWORK_SARA.LIBROS";
		
		
		try {
			Statement stmt = con.createStatement(); 
			ResultSet rset = stmt.executeQuery(query); 
			System.out.println(rset);
			
				//ResultSet rst = pst.executeQuery();*/
				while (rset.next()) {
					Libro libro = new Libro();
					libro.setIsbn(rset.getInt("ISBN_LIBRO"));
					libro.setAutorLibro(rset.getString("AUTOR_LIBRO"));
					libro.setNomLibro(rset.getString("NOM_LIBRO"));
					libro.setEditorial(rset.getString("EDITORIAL"));
					libro.setPrecio(rset.getDouble("PRECIO"));
					libro.setCantidad(rset.getInt("CANTIDAD_LIBRO"));
					libro.setImagen(rset.getString("IMAGEN"));
					//salida = rset.getString("NOM_USU");
					listaLibros.add(libro);
			System.out.println(libro.getNomLibro());
			//los demas van atrasados 
			//Porque no han hecho esto que esroy haciendo 
			//lo muestran como en una tabla pero np traen la info de la bdd
				}
				rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return listaLibros;		
	}
	
	public ArrayList<VideoJuego> getListVideoJuegos(){
		System.out.println("hola VideoJuegos xD ");
		ArrayList<VideoJuego> listaVideo= new ArrayList<VideoJuego>();
		//String query2 = "select * from TRNETWORK_SARA.VIDEOJUEGOS";		
		Conexion conexion = new Conexion();
		Connection con = conexion.conectar();
		String query = "SELECT * FROM  TRNETWORK_SARA.VIDEOJUEGOS ";	
		System.out.println("aqui me detuve"+query);
		try {
			Statement stmt = con.createStatement(); 
			System.out.println("antes de tronar"+stmt);
			ResultSet rset = stmt.executeQuery(query); 
			
			
			
				//ResultSet rst = pst.executeQuery();*/
				while (rset.next()) {
					VideoJuego video = new VideoJuego();
					video.setCveVideo(rset.getInt("CVE_VIDEO"));
					video.setNom_video(rset.getString("NOM_VIDEO"));
					video.setDistribuidora(rset.getString("DISTRIBUIDORA_VIDEO"));
					video.setPrecio(rset.getDouble("PRECIO_VIDEO"));
					video.setCantidad(rset.getInt("CANTIDAD_VIDEO"));
					
					video.setImagen(rset.getString("IMAGENVIDEO"));
					listaVideo.add(video);
					
			System.out.println(video.getNom_video());
			//los demas van atrasados 
			//Porque no han hecho esto que esroy haciendo 
			//lo muestran como en una tabla pero np traen la info de la bdd
				}
				rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listaVideo;	
		
	}

	
}
