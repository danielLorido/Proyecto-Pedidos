package control.comportamiento;

import vista.pedido.AltaPedido;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.adaptador.GestorUnificado;
import control.logica.GestorAltaArticulo;
import control.logica.GestorCliente;
import modelo.Articulo;
 import modelo.Cliente;
import modelo.LineaPedido;
import modelo.Pedido;
import utiles.Tipo;

import java.awt.event.ActionEvent;

public class ParaAltaPedido extends AltaPedido {
	private Cliente cli;
	private Articulo arti;
	private int lineaPedidoActual = 0;
	DefaultTableModel modeloTabla;
//	Object[] fila;

	public ParaAltaPedido() {
		rellenarClientes();
		rellenarArticulos();
		tabla();
		// Realizar Pedido

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				insertarIdPed(date);

				arti = (Articulo) comboArticulo.getSelectedItem();
				cli = (Cliente) comboCliente.getSelectedItem();

				HashSet<LineaPedido> lineas = new HashSet<>();

				for (int i = 0; i < modeloTabla.getRowCount(); i++) {
					int num = (int) modeloTabla.getValueAt(i, 0);
					int cantidad = (int) modeloTabla.getValueAt(i, 2);
					float precio = (float) modeloTabla.getValueAt(i, 3);

					LineaPedido lin = new LineaPedido(num, cantidad, precio, arti);
					lineas.add(lin);
				}
				//TODO calcular el total(articulo * cantidad)
				Pedido ped = new Pedido(date, cli, lineas, 42);
				new GestorUnificado(Tipo.pedido).escribir(ped);

			}
		});

		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tengo la linea de pedido, y la tengo que llevarla a la tabla

				arti = (Articulo) comboArticulo.getSelectedItem();

				boolean encontrado = false;

				for (int i = 0; i < modeloTabla.getRowCount(); i++) {
					String nom = String.valueOf(modeloTabla.getValueAt(i, 1));
					if (arti.getNombre().equals(nom)) {
						int cantidad = (int) modeloTabla.getValueAt(i, 2);
						modeloTabla.setValueAt(cantidad + 1, i, 2);
						encontrado = true;
						break;
					}
				}

				if (!encontrado) {
					Object[] fila = { dameLinea(), arti.getNombre(), 1, arti.getPrecio() };
					modeloTabla.addRow(fila);
				}
			}

			private float calcularPrecioLinea() {
				return arti.getPrecio() * Integer.valueOf(txtCantidad.getText());
			}

		});

		// Eliminar Linea
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarLinea(table);
			}
		});

	}

	// TODO hacer algo con esto para que vaya bien
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

	public void eliminarLinea(JTable table) {
		DefaultTableModel model = (DefaultTableModel) this.table.getModel();
		int[] rows = table.getSelectedRows();
		for (int i = 0; i < rows.length; i++) {
			model.removeRow(rows[i] - i);
		}
	}

	public void tabla() {
		String[] columnas = { "NumLinea", "Articulo", "Cantidad", "Precio" };
		modeloTabla = new DefaultTableModel(columnas, 0) {
			/**
			 * 
			 */
			protected static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(modeloTabla);
	}

}
