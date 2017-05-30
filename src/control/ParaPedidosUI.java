package control;

import vista.PanelArticulo;
import vista.PanelCliente;
import vista.PanelPedidos;
import vista.PedidosUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaPedidosUI extends PedidosUI {
	
	public ParaPedidosUI() {
		// Probando como cambiar de panel
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlPrincipal.show(false);
				pnlClientes.show();
			}
		});
		btnArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlPrincipal.show(false);
				pnlArticulos.show();
			}
		});
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlPrincipal.show(false);
				pnlPedidos.show();
			}
		});
	}

}
