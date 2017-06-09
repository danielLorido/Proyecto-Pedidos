package control.comportamiento;

import vista.pedido.ConsultaPedido;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

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

	Pedido pedidos;
	DefaultTableModel modeloTabla;
	// Object[] fila;

	public ParaConsultaPedido() {

		rellenarCombo();
		tabla();
		
//		Articulo art = (Articulo) comboArt.getSelectedItem();
//		txtPrecioArt.setText(String.valueOf(art.getPrecio()));
//		txtNombreArt.setText(art.getNombre());
//		txtNumRef.setText(String.valueOf(art.getNumReferencia()));
//		txtDescripcionArt.setText(art.getDescripcion());

		comboPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido ped = (Pedido) comboPedido.getSelectedItem();
				
				HashSet<LineaPedido> linea = ped.getListaArticulos();
				ArrayList<LineaPedido> loreal = new ArrayList<LineaPedido>(linea);
				
				textCliente.setText(String.valueOf(ped.getCliente()));
				textId.setText(String.valueOf(ped.getFechaPedido()));
				
//				Object[] fila = { dameLinea(), arti.getNombre(), 1, arti.getPrecio() };
				
				for (int i = 0; i < linea.size(); i++) {
					
					Object[] fila = {};
					modeloTabla.addRow(fila);
				}
				
				
				
			}
		});
		// TODO Auto-generated constructor stub
	}

	private void rellenarCombo() {

		// File file = new File("pedidos.dat");
		DefaultComboBoxModel<Pedido> modelo = new DefaultComboBoxModel<Pedido>();
		HashSet<Pedido> linea = new HashSet<>();
		// if (file.exists()) {
		// while (gestor.obtener() != null) {
		// for (int i = 0; i < 2; i++) {
		pedidos = (Pedido) new GestorUnificado(Tipo.pedido).obtener();
		linea.add(pedidos);
		// }

		// }
		for (Pedido pedido : linea) {
			modelo.addElement(pedidos);
		}
		comboPedido.setModel(modelo);
		// }
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
