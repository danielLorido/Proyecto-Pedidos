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

		rellenarCombo();

		comboArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Articulo art = (Articulo) comboArt.getSelectedItem();
				txtPrecioArt.setText(String.valueOf(art.getPrecio()));
				txtNombreArt.setText(art.getNombre());
				txtNumRef.setText(String.valueOf(art.getNumReferencia()));
				txtDescripcionArt.setText(art.getDescripcion());
				
				
			}
		});
	}

	private void rellenarCombo() {

		DefaultComboBoxModel<Articulo> modelo = new DefaultComboBoxModel<Articulo>();
		HashSet<Articulo> articulos = new GestorAltaArticulo().getListaArt();

		for (Articulo articulo : articulos) {
			modelo.addElement(articulo);
		}
		comboArt.setModel(modelo);
	}

}
