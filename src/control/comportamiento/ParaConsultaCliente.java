package control.comportamiento;

import vista.cliente.ConsultaCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaConsultaCliente extends ConsultaCliente {
	public ParaConsultaCliente() {
		// Tengo que rellenar el combo
		rellenarCombo();

		btnBuscaCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtiene el cliente que está en el comboBox selleccionado y
				// muestra la información en los txt
				
				String dniCli = "", nombreCli = "", apellidoCli = "", direccionCli = "";
				// Obtengo los valores para ese cliente
				
				// Los muestro en el formulario
				txtDni.setText(dniCli);
				txtNombre.setText(nombreCli);
				txtApellido.setText(apellidoCli);
				txtDireccion.setText(direccionCli);

			}
		});

	}

	/**
	 * Rellena el comboBox con los elementos de la lista que está en el fichero.
	 */
	private void rellenarCombo() {

	}

}