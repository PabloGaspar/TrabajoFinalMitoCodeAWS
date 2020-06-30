package com.cursomito.lenguajepreferencia.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity 
@Table(name = "lenguaje_preferencias")
public class Preferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombres", nullable = false, length = 60)
	private String nombres;
	
	@Column(name = "apellidos", nullable = false, length = 60)
	private String apellidos;
	
	@Column(name = "eleccion", nullable = false, length = 40)
	private String eleccion;
	
	public Preferencia() {
		
	}
	
	public Preferencia(int id, String nombres, String apellidos, String eleccion) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.eleccion = eleccion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEleccion() {
		return eleccion;
	}
	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}

	
	
}
