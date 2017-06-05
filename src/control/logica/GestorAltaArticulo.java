package control.logica;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import control.adaptador.GestorUnificado;
import modelo.Articulo;
import utiles.Tipo;

public class GestorAltaArticulo {

	private HashSet<Articulo> listillo;

	public GestorAltaArticulo() {
		if (new File("articulos.dat").exists()) {
			listillo = (HashSet<Articulo>) new GestorUnificado(Tipo.articulo).obtener();

			try {
				new File("articulos.dat").createNewFile();
				listillo = new HashSet<Articulo>();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public HashSet<Articulo> getListaArticulos() {
		return listillo;
	}

	public HashSet<Articulo> getListillo() {
		return listillo;
	}

	public void setListillo(HashSet<Articulo> listillo) {
		this.listillo = listillo;
	}

	public boolean escribeObjeto(Articulo articulo) {
		listillo.add(articulo);
		return new GestorUnificado(Tipo.articulo).escribir(listillo);
	}

}
