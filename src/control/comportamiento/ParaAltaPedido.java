package control.comportamiento;

import vista.pedido.AltaPedido;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class ParaAltaPedido extends AltaPedido {
	public ParaAltaPedido() {
		// Lo primero asignar un ID al pedido
		insertarIdPed();

		// Realizar Pedido
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// Combo Articulos
		comboArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarArticulos();
			}

		});

		// Combo Clientes
		comboCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarClientes();

			}
		});

		// Boton anadir linea
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Anadir una linea de pedido a la tabla

			}
		});

		// Eliminar Linea
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Poner todos los campos vacios y mostrar un mensaje
			}
		});

	}

	private void insertarIdPed() {
		// TODO Auto-generated method stub
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		textId.setText(hourdateFormat.toString());
//		System.out.println("Hora y fecha: "+hourdateFormat.format(date));
		

	}

	private void rellenarArticulos() {
		// TODO Auto-generated method stub

	}

	private void rellenarClientes() {
		// TODO Auto-generated method stub

	}

}
