package control.comportamiento;

import vista.cliente.BajaCliente;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;


import control.adaptador.GestorUnificado;
import control.logica.Gestor;
import control.logica.GestorCliente;
import modelo.Cliente;
import modelo.DAO;
import utiles.Tipo;

import java.awt.event.ActionEvent;

public class ParaBajaCliente extends BajaCliente {
	// Debo rellenar el combo

	Cliente clienteBaja;
	int posicionCliente;

	public ParaBajaCliente() {
		rellenarCombo();
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtengo el cliente a partir del combo, muestro su informacion
				clienteBaja = (Cliente) comboBox.getSelectedItem();
				txtDni.setText(clienteBaja.getDni());
				txtNombre.setText(clienteBaja.getNombre());
				txtApellido.setText(clienteBaja.getApellido());
				txtDireccion.setText(clienteBaja.getDireccion());
			}
		});
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Dar de baja
				if (new GestorUnificado(Tipo.cliente).borra(clienteBaja)) {
					
					textField.setText("Cliente dado de baja correctamente");
				} else {
					textField.setText("Error al dar de baja al Cliente, verifique los datos.");
				}

			}
		});
	}

	private void rellenarCombo() {
		DefaultComboBoxModel<Cliente> modelo = new DefaultComboBoxModel<Cliente>();
		HashSet<Cliente> clientes = new GestorCliente().getListaCli();
		for (Cliente cliente : clientes) {
			modelo.addElement(cliente);
		}
		comboBox.setModel(modelo);
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
