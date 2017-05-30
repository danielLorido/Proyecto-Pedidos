package modelo;

import java.io.Serializable;

public class Articulo implements Serializable {

	private int numReferencia;
	private String nombre;
	private String descripcion;
	private float precio;

	public Articulo(int numReferencia, String nombre, String descripcion, float precio) {
		super();
		this.numReferencia = numReferencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(int numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
