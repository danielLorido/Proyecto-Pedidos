package control;

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
				// Debería ser algo así
				// contentPane.getLayout().show();
			}
		});
	}

}
