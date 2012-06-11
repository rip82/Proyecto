package com.orgrup.modelo;


public class Tarea {

	private String fecha;
	private String nombre;
	private String descripcion;
	private Integer prioridad;
	
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
	
	public Integer getPrioridad(){
		return prioridad;
	}
	
	public void setPrioridad(Integer prioridad){
		this.prioridad = prioridad;
	}
	
}

