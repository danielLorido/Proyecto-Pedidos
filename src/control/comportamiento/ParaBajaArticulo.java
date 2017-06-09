package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import control.adaptador.GestorUnificado;
import control.logica.GestorAltaArticulo;
import modelo.Articulo;
import utiles.Tipo;
import vista.articulo.BajaArticulo;

public class ParaBajaArticulo extends BajaArticulo {
	
	Articulo articuloBaja;
	int posicionArticulo;

	public ParaBajaArticulo() {
		
		rellenarCombo();
		
		comboBoxArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				articuloBaja = (Articulo) comboBoxArt.getSelectedItem();
				textField.setText(Integer.toString(articuloBaja.getNumReferencia()));
				txtNombreArt.setText(articuloBaja.getNombre());
				txtPrecioArt.setText(Integer.toString((int) articuloBaja.getPrecio()));
				txtDescripcionArt.setText(articuloBaja.getDescripcion());
			}
		});
	
	
		
		
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Dar de baja
				articuloBaja = (Articulo) comboBoxArt.getSelectedItem();
				new GestorUnificado(Tipo.articulo).borra(articuloBaja);
//				if (new GestorUnificado(Tipo.cliente).borra(articuloBaja)) {
//					textField.setText("Articulo dado de baja correctamente");
//				} else {
//					textField.setText("Error al dar de baja al Articulo, verifique los datos.");
//				}
			}
		});
	}


	private void rellenarCombo() {
		DefaultComboBoxModel<Articulo> modelo = new DefaultComboBoxModel<Articulo>();

		HashSet<Articulo> articulos = new GestorAltaArticulo().getListaArt();

		for (Articulo articulo : articulos) {
			modelo.addElement(articulo);
		}
		comboBoxArt.setModel(modelo);
	}

}
