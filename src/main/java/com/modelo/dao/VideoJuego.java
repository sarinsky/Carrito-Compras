package com.modelo.dao;

public class VideoJuego extends Articulo {
	private int cveVideo;
	private String nom_video;
	private String distribuidora;
	
	public int getCveVideo() {
		return cveVideo;
	}
	public void setCveVideo(int cveVideo) {
		this.cveVideo = cveVideo;
	}
	public String getNom_video() {
		return nom_video;
	}
	public void setNom_video(String nom_video) {
		this.nom_video = nom_video;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	@Override
	public String toString() {
		return cveVideo + ", " + nom_video + "," + distribuidora+ ","+precio+","+cantidad;
				
	}
	
	
	
}
