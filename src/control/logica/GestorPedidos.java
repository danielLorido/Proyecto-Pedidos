package control.logica;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

import control.adaptador.GestorUnificado;
import modelo.LineaPedido;
import modelo.Pedido;
import utiles.Tipo;

public class GestorPedidos {

	ArrayList<Pedido> listaPedido;

	File filete = new File("pedidos.dat");

	public GestorPedidos() {
		if (filete.exists()) {
			listaPedido = (ArrayList<Pedido>) new GestorUnificado(Tipo.pedido).obtener();
		} else {
			listaPedido = new ArrayList<>();
		}
	}

	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(ArrayList<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public boolean escribirObjeto(Pedido pedido) {

		return new GestorUnificado(Tipo.pedido).escribir(pedido);

	}

}
