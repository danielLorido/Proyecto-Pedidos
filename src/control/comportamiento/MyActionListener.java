package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

	ParaPedidosUI paraUI;

	@Override
	public void actionPerformed(ActionEvent e) {
		paraUI.mostrarPrincipal();
	}
}