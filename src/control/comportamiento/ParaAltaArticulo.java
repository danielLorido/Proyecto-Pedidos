package control.comportamiento;

import vista.articulo.AltaArticulo;
import vista.articulo.PanelArticulo;
import java.awt.event.ActionListener;
import java.util.HashSet;

import control.logica.Gestor;
import modelo.Articulo;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class ParaAltaArticulo extends AltaArticulo {

	boolean ok = false;

	public ParaAltaArticulo() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String numRef = txtNumRef.getText();
				String nombre = txtNombre.getText();
				String precio = txtPrecio.getText();
				String descripcion = textDescripcion.getText();
				textAnomalia.setForeground(Color.red);

				if (comprobarNumerico(numRef) && numRef.length() >= 4) {

					if (comprobarAlfabetico(nombre) && nombre.length() > 2) {

						if (comprobarNumerico(precio)) {

							if (comprobarAlfabetico(descripcion) && descripcion.length() > 5) {

								Articulo miArticulo = new Articulo(Integer.valueOf(numRef), nombre, descripcion,
										Float.valueOf(precio));
								// artList.add(miArticulo);
								new Gestor().insertar(miArticulo);
								textAnomalia.setForeground(Color.green);
								textAnomalia.setText("Articulo creado correctamente");
							} else {
								textAnomalia.setText("error: descripcion");
							}
						} else {
							textAnomalia.setText("error: precio");
						}
					} else {
						textAnomalia.setText("error: nombre");
					}
				} else {
					textAnomalia.setText("error: numref");
				}

			}
		});

	}

	/**
	 * Comprueba si el dato introducido es num�rico
	 * 
	 * @return true si es todo n�meros, false si hay una letra
	 */
	private boolean comprobarNumerico(String texto) {
		for (int j = 0; j < texto.length(); j++) {
			if (!Character.isAlphabetic(texto.charAt(j))) {
				ok = true;
			} else {
				return false;
			}
		}
		return ok;
	}

	/**
	 * Comprueba si el dato introducido es alfab�tico
	 * 
	 * @return false si aparece un n�mero, true si es todo letras
	 */
	private boolean comprobarAlfabetico(String texto) {
		for (int j = 0; j < texto.length(); j++) {
			if (Character.isAlphabetic(texto.charAt(j))) {
				ok = true;
			} else {
				return false;
			}
		}
		return ok;
	}

}
