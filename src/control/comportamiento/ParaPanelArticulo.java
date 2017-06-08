package control.comportamiento;

import vista.articulo.PanelArticulo;

public class ParaPanelArticulo extends PanelArticulo {

	public ParaPanelArticulo() {
		MyActionListener comportamiento = new MyActionListener();
		btnInicioArt.addActionListener(comportamiento);
	}
	
}
