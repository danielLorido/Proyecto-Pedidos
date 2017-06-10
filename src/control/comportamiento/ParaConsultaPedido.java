package control.comportamiento;

import vista.pedido.ConsultaPedido;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import control.adaptador.GestorUnificado;
import control.logica.GestorAltaArticulo;
import modelo.Articulo;
import modelo.LineaPedido;
import modelo.Pedido;
import utiles.Tipo;

import java.awt.event.ActionEvent;

public class ParaConsultaPedido extends ConsultaPedido {

	DefaultTableModel modeloTabla;
	// Object[] fila;

	public ParaConsultaPedido() {

		rellenarCombo();
		tabla();

		comboPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modeloTabla.setRowCount(0);
				Pedido ped = (Pedido) comboPedido.getSelectedItem();

				HashSet<LineaPedido> linea = ped.getListaArticulos();
				ArrayList<LineaPedido> loreal = new ArrayList<LineaPedido>(linea);

				
				textCliente.setText(String.valueOf(ped.getCliente()));
				textId.setText(String.valueOf(ped.getFechaPedido()));

				
				//TODO no muestra correctamente los datos de los articulos

				for (int i = 0; i < loreal.size(); i++) {
					LineaPedido lin = loreal.get(i);
					Object[] fila = {lin.getArticulo().getDescripcion(), lin.getArticulo().getNombre(), lin.getCantidad(),lin.getPrecioLinea()};
					modeloTabla.addRow(fila);
				}
			}
		});
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	private void rellenarCombo() {

		DefaultComboBoxModel<Pedido> modelo = new DefaultComboBoxModel<Pedido>();
		HashSet<Pedido> linea = new HashSet<>();

		linea = (HashSet<Pedido>) new GestorUnificado(Tipo.pedido).obtener();

		for (Pedido pedido : linea) {
			modelo.addElement(pedido);
		}
		comboPedido.setModel(modelo);
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
