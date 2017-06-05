package control.comportamiento;

import vista.cliente.PanelCliente;

public class ParaPanelCliente extends PanelCliente {

	public ParaPanelCliente() {
		MyActionListener comportamiento = new MyActionListener();
		btnInicioCli.addActionListener(comportamiento);
	}

}
