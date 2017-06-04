package control.comportamiento;

import vista.articulo.AltaArticulo;
import vista.articulo.PanelArticulo;
import java.awt.event.ActionListener;
import java.util.HashSet;

import control.logica.Gestor;
import modelo.Articulo;

import java.awt.event.ActionEvent;

public class ParaAltaArticulo extends AltaArticulo {

	PanelArticulo art = new PanelArticulo();
	Gestor gestor = new Gestor();
	boolean ok = false;
	// HashSet<Articulo> artList = new HashSet<>();

	public ParaAltaArticulo() {
		btnDarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String numRef = txtNumRef.getText();
				String nombre = txtNombre.getText();
				String precio = txtPrecio.getText();
				String descripcion = textDescripcion.getText();

				if (comprobarNumerico(numRef) && numRef.length() >= 4) {

					if (comprobarAlfabetico(nombre) && nombre.length() > 2) {

						if (comprobarNumerico(precio)) {

							if (comprobarAlfabetico(descripcion) && descripcion.length() > 5) {

								Articulo miArticulo = new Articulo(Integer.valueOf(numRef), nombre, descripcion,
										Float.valueOf(precio));
								// artList.add(miArticulo);
								gestor.insertar(miArticulo);
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
	 * Comprueba si el dato introducido es numérico
	 * 
	 * @return true si es todo números, false si hay una letra
	 */
	public boolean comprobarNumerico(String texto) {
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
	 * Comprueba si el dato introducido es alfabético
	 * 
	 * @return false si aparece un número, true si es todo letras
	 */
	public boolean comprobarAlfabetico(String texto) {
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
