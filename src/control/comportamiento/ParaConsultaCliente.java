package control.comportamiento;

import vista.cliente.ConsultaCliente;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import control.logica.GestorAltaArticulo;
import control.logica.GestorCliente;
import modelo.Articulo;
import modelo.Cliente;

import java.awt.event.ActionEvent;

public class ParaConsultaCliente extends ConsultaCliente {
	public ParaConsultaCliente() {
		// Tengo que rellenar el combo
		rellenarCombo();

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cli = (Cliente) comboBox.getSelectedItem();
				txtDni.setText(cli.getDni());
				txtNombre.setText(cli.getNombre());
				txtApellido.setText(cli.getApellido());
				txtDireccion.setText(cli.getDireccion());
			}
		});
	}

	/**
	 * Rellena el comboBox con los elementos de la lista que está en el
	 * fichero.
	 */
	private void rellenarCombo() {
		DefaultComboBoxModel<Cliente> modelo = new DefaultComboBoxModel<Cliente>();

		HashSet<Cliente> clientes = new GestorCliente().getListaCli();

		for (Cliente cliente: clientes) {
			modelo.addElement(cliente);
		}
		comboBox.setModel(modelo);
	}

}
