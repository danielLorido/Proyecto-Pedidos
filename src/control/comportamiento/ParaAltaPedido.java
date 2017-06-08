package control.comportamiento;

import vista.pedido.AltaPedido;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import control.logica.GestorAltaArticulo;
import control.logica.GestorCliente;
import modelo.Articulo;
import modelo.Cliente;
import modelo.LineaPedido;

import java.awt.event.ActionEvent;

public class ParaAltaPedido extends AltaPedido {
	private Cliente cli;
	private Articulo arti;
	private int lineaPedidoActual = 0;

	public ParaAltaPedido() {
		rellenarClientes();
		rellenarArticulos();
		// Realizar Pedido
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				insertarIdPed(date);

			}
		});

		// Combo Articulos
		comboArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arti = (Articulo) comboArticulo.getSelectedItem();
			}
		});

		// Combo Clientes
		comboCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cli = (Cliente) comboCliente.getSelectedItem();
			}
		});

		// Boton anadir linea
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tengo la linea de pedido, y la tengo que llevarla a la tabla
				LineaPedido linea = new LineaPedido(dameLinea(), Integer.valueOf(txtCantidad.getText()), calcularPrecioLinea(), arti);
				
			}

			private float calcularPrecioLinea() {
				return arti.getPrecio() * Integer.valueOf(txtCantidad.getText());
			}


		});

		// Eliminar Linea
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtengo la ultima linea y la elimino
								
			}
		});

	}

	private int dameLinea() {
		lineaPedidoActual++;
		return lineaPedidoActual;
	}
	
	/**
	 * Inserta en el campo del id la fecha actual
	 * 
	 * @param date
	 *            La fecha al pulsar el boton de dar de alta
	 */
	private void insertarIdPed(Date date) {
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		textId.setText(hourdateFormat.format(date));
	}

	private void rellenarArticulos() {
		DefaultComboBoxModel<Articulo> modelo = new DefaultComboBoxModel<Articulo>();
		HashSet<Articulo> articulos = new GestorAltaArticulo().getListaArt();
		for (Articulo articulo : articulos) {
			modelo.addElement(articulo);
		}
		comboArticulo.setModel(modelo);
	}

	private void rellenarClientes() {
		DefaultComboBoxModel<Cliente> modelo = new DefaultComboBoxModel<Cliente>();
		HashSet<Cliente> clientes = new GestorCliente().getListaCli();
		for (Cliente cliente : clientes) {
			modelo.addElement(cliente);
		}
		comboCliente.setModel(modelo);
	}

}
