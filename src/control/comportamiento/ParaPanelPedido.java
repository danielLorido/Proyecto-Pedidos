package control.comportamiento;

import vista.pedido.PanelPedidos;

public class ParaPanelPedido extends PanelPedidos {

	public ParaPanelPedido() {
		MyActionListener comportamiento = new MyActionListener();
		btnInicioPed.addActionListener(comportamiento);
	}
	
}
