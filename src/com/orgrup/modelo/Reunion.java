package com.orgrup.modelo;

public class Reunion {

	private String fecha;
	private String nombre;
	private String descripcion;
	private String comentario;
	private Documento documento;
	
	public String getFecha(){
		return fecha;
	}

	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public void getNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getComentario(){
		return descripcion;
	}
	
	public void setComentario(String descripcion){
		this.descripcion = descripcion;
	}
	public void agregarDocumento(){
		
	}
	
	public void eliminarDocumento(){
		
	}
		
}
