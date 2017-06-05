package control.comportamiento;

import vista.cliente.AltaCliente;
import vista.cliente.PanelCliente;

import java.awt.event.ActionListener;

import control.logica.Gestor;
import control.logica.GestorCliente;
import modelo.Cliente;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class ParaAltaCliente extends AltaCliente {
	public ParaAltaCliente() {

		btnDarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniCli = txtDni.getText().trim();
				String nombreCli = txtNombre.getText().trim();
				String apellidoCli = txtApellido.getText().trim();
				String direccionCli = txtDireccion.getText().trim();
				txtOpcionalesCli.setForeground(Color.RED);
				if (dniCli.length() > 8 && dniCli.length() <= 10) {
					if (nombreCli.length() >= 2) {
						if (apellidoCli.length() >= 2) {
							if (direccionCli.length() >= 3) {
								Cliente cliente = new Cliente(dniCli, nombreCli, apellidoCli, direccionCli);
								new GestorCliente().escribeObjeto(cliente);
//								new Gestor().insertar(cliente);
								
								txtOpcionalesCli.setForeground(Color.GREEN);
								txtOpcionalesCli.setText("Cliente Insertado correctamente");
							} else {
								txtOpcionalesCli.setText("Inserte una direccion valida");
							}
						} else {
							txtOpcionalesCli.setText("Inserte un apellido valido");
						}
					} else {
						txtOpcionalesCli.setText("Inserte un nombre valido");
					}
				} else {
					txtOpcionalesCli.setText("Inserte un dni Valido");
				}
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelCliente seccion = new PanelCliente();
				txtDni.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtDireccion.setText("");
				txtOpcionalesCli.setForeground(Color.RED);
				txtOpcionalesCli.setText("Alta Cancelada");
			}
		});
	}

}
