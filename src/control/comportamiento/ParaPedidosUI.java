package control.comportamiento;

import vista.PanelArticulo2;
import vista.PanelCliente2;
import vista.PanelPedidos2;
import vista.PedidosUI;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
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

}
