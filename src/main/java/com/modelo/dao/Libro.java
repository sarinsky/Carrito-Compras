package com.modelo.dao;

public class Libro  extends Articulo{
	
	private int isbn;
	private String nomLibro;
	private String autorLibro;
	private String editorial;
	//ISBN_LIBRO","NOM_LIBRO","AUTOR_LIBRO", "EDITORIAL", "PRECIO", "CANTIDAD_LIBRO"
	//Articulo articulo = new Articulo();
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getNomLibro() {
		return nomLibro;
	}
	public void setNomLibro(String nomLibro) {
		this.nomLibro = nomLibro;
	}
	public String getAutorLibro() {
		return autorLibro;
	}
	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public String toString() {
		return isbn + "," + nomLibro + "," + autorLibro + ","+ editorial+ ", "+ precio +","+cantidad;
		
	}
	
	
}