package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class Pedido implements Serializable {
	private Date fechaPedido;
	private Cliente cliente;
	private HashSet<LineaPedido> listaArticulos;
	private float precioTotal = 0;

	public Pedido(Date fechaPedido, Cliente cliente, HashSet<LineaPedido> listaArticulos, float precioTotal) {
		super();
		// TODO: establecer una fecha al pedido
		this.fechaPedido = fechaPedido;
		this.cliente = cliente;
		this.listaArticulos = listaArticulos;
		this.precioTotal = precioTotal;
	}

	/**
	 * Calcula el total de todas las l�neas de pedido con sus cantidades
	 * 
	 * @return precioTotal de la compra
	 */
	public float calcularTotal() {

		return 0;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public HashSet<LineaPedido> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(HashSet<LineaPedido> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Pedido [fechaPedido=" + fechaPedido + "]";
	}
	
	
	
}
