package control.comportamiento;

import vista.cliente.BajaCliente;
import java.awt.event.ActionListener;
import java.io.File;

import control.adaptador.GestorUnificado;
import control.logica.Gestor;
import modelo.Cliente;
import modelo.DAO;
import utiles.Tipo;

import java.awt.event.ActionEvent;

public class ParaBajaCliente extends BajaCliente {
	// Debo rellenar el combo

	public ParaBajaCliente() {
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtengo el cliente a partir del combo, muestro su informacion
				// y le doy de baja

				// Dar de baja
				// Cliente clienteBaja = new Gestor().busca(obj, tipo);

				// new DAO().borrar(encontrado, "clientes.dat", true);
			}
		});
	}

	public boolean bajaCliente(String dni, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Cliente cliente = null;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			cliente = (Cliente) buscar.obtener();
	
			
			
		}
		return buscar.borra(cliente);

	}

}
