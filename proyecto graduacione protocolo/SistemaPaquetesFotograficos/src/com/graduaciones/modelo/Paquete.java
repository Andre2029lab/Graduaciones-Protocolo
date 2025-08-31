package com.graduaciones.modelo;

public class Paquete {
	private int id;
    private String nombre;
    private double precio;
    private int cantidadFotos;
    private String extras;
	public Paquete(int id, String nombre, double precio, int cantidadFotos, String extras) {
		
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadFotos = cantidadFotos;
		this.extras = extras;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadFotos() {
		return cantidadFotos;
	}
	public void setCantidadFotos(int cantidadFotos) {
		this.cantidadFotos = cantidadFotos;
	}
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	
    
    
}
