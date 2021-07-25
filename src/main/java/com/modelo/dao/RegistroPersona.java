package com.modelo.dao;

public class RegistroPersona {
	private int clave;
	private String nombre;
	private String correo;
	private String pass;
	
	public RegistroPersona(int clave, String nombre, String correo, String pass) {
		this.clave = clave;
		this.nombre = nombre;
		this.correo = correo;
		this.pass = pass;
		
	}
	public RegistroPersona() {
		
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	

}
