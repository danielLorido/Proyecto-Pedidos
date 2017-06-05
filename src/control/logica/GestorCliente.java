package control.logica;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import control.adaptador.GestorUnificado;
import modelo.Cliente;
import modelo.DAO;
import utiles.Constantes;
import utiles.Tipo;

public class GestorCliente {
	private HashSet<Cliente> listaCli;

	@SuppressWarnings("unchecked")
	public GestorCliente() {
		if (new File("clientes.dat").exists()) {
			listaCli = (HashSet<Cliente>) new GestorUnificado(Tipo.cliente).obtener();
		} else {
			try {
				new File("clientes.dat").createNewFile();
				listaCli = new HashSet<Cliente>();
			} catch (IOException e) {
				if (Constantes.errores) {
					System.out.println("No se ha podido crear el archivo");
				}
			}
		}
	}

	public HashSet<Cliente> getListaCli() {
		return listaCli;
	}

	public void setListaCli(HashSet<Cliente> listaCli) {
		this.listaCli = listaCli;
	}

	public boolean escribeObjeto(Cliente cliente) {
		listaCli.add(cliente);
		return new GestorUnificado(Tipo.cliente).escribir(listaCli);
	}

}
