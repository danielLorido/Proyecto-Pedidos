package control.comportamiento;

import vista.articulo.ConsultaArticulo;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import control.logica.Gestor;
import control.logica.GestorAltaArticulo;
import modelo.Articulo;

import java.awt.event.ActionEvent;

public class ParaConsultaArticulo extends ConsultaArticulo {

	// TODO: bocata de choped

	public ParaConsultaArticulo() {

		// DefaultComboBoxModel<Articulo> modelo = new
		// DefaultComboBoxModel<Articulo>();
		rellenarCombo();

		// comboArt.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		// Articulo art = (Articulo) comboArt.getSelectedItem();
		// txtPrecioArt.setText(String.valueOf(art.getPrecio()));
		//
		// }
		// });

	}

	private void rellenarCombo() {
		HashSet<Articulo> articulos = new GestorAltaArticulo().getListaArticulos();

		for (Articulo articulo : articulos) {
			comboArt.insertItemAt(articulo, 0);
		}
	}

}
