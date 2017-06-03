package control.comportamiento;

import vista.cliente.BajaCliente;
import java.awt.event.ActionListener;

import control.logica.Gestor;
import modelo.Cliente;
import modelo.DAO;

import java.awt.event.ActionEvent;

public class ParaBajaCliente extends BajaCliente {
	// Debo rellenar el combo

	public ParaBajaCliente() {
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtengo el cliente a partir del combo, muestro su informacion
				// y le doy de baja
				
				//Dar de baja
//				Cliente clienteBaja = new Gestor().busca(obj, tipo); 
				
//				new DAO().borrar(encontrado, "clientes.dat", true);
			}
		});
	}

}
