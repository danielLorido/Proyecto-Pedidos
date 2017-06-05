package control.comportamiento;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyActionListener implements ActionListener {

	ParaPedidosUI paraUI;

	@Override
	public void actionPerformed(ActionEvent e) {
		mostrarPrincipal(paraUI.contentPane);
	}

	private void mostrarPrincipal(JPanel contentPane) {
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "name_100969206552066");
	}
}
