package control.comportamiento;

import vista.articulo.ConsultaArticulo;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

import control.logica.Gestor;
import modelo.Articulo;

import java.awt.event.ActionEvent;

public class ParaConsultaArticulo extends ConsultaArticulo {

	Gestor gestor = new Gestor();
	DefaultComboBoxModel<Articulo> modelo = new DefaultComboBoxModel<Articulo>();

	//TODO: bocata de choped
	
	public ParaConsultaArticulo() {
		comboArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
	}

}
