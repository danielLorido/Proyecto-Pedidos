package control.comportamiento;

import vista.PedidosUI;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class ParaPedidosUI extends PedidosUI {

	public ParaPedidosUI() {
		// Probando como cambiar de panel
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "clientes");
			}
		});
		btnArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "articulos");
			}
		});
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "pedidos");
			}
		});
	}
	public void mostrarPrincipal() {
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(pnlPrincipal, "name_100969206552066");
	}
}
