package modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;

	public Cliente(String dni, String nombre, String apellido, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "[" + dni + "] " + nombre;
	}

	@Override
	public boolean equals(Object obj) {
		return this.dni.equals(((Cliente)obj).dni) && this.nombre.equals(((Cliente)obj).nombre) && this.apellido.equals(((Cliente)obj).apellido) &&
				this.direccion.equals(((Cliente)obj).direccion);
	}

}
