package control.comportamiento;

import vista.PanelArticulo;
import vista.PanelCliente;
import vista.PanelPedidos;
import vista.PedidosUI;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ParaPedidosUI extends PedidosUI {
	
	public ParaPedidosUI() {
		// Probando como cambiar de panel
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				((CardLayout)(contentPane.getLayout())).show(pnlClientes, "");
				pnlClientes.show();
				// Debería ser algo así
				// contentPane.getLayout().show();
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
