package com.apiceno.Residuos.entity;

public class Residuo {
	private String nombre;
	private String quimico;
	private Integer degradacionAnyo;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getQuimico() {
		return quimico;
	}
	
	public void setQuimico(String quimico) {
		this.quimico = quimico;
	}
	
	public Integer getDegradacionAnyo() {
		return degradacionAnyo;
	}
	
	public void setDegradacionAnyo(Integer degradacionAnyo) {
		this.degradacionAnyo = degradacionAnyo;
	}
	
	@Override
	public String toString() {
		return "Residuo [nombre=" + nombre + ", quimico=" + quimico + ", degradacionAnyo=" + degradacionAnyo + "]";
	}
	
	
}
