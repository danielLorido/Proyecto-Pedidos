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

import java.awt.event.ActionEvent;

public class ParaAltaPedido extends AltaPedido {
	public ParaAltaPedido() {
		// Lo primero asignar un ID al pedido
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
				Articulo arti = (Articulo) comboArticulo.getSelectedItem();

			}

		});

		// Combo Clientes
		comboCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cli = (Cliente) comboCliente.getSelectedItem();
			}
		});

		// Boton anadir linea
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// Eliminar Linea
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Poner todos los campos vacios y mostrar un mensaje
			}
		});

	}

	private void insertarIdPed(Date date) {
		// TODO: La fecha se pone al iniciar el programa y no al abrir un nuevo
		// alta

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
