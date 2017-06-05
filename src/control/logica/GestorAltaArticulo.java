package control.logica;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import modelo.DAO;
import utiles.Constantes;
import utiles.Tipo;

public class GestorAltaArticulo {
	private HashSet<Articulo> listaArt;

	@SuppressWarnings("unchecked")
	public GestorAltaArticulo() {
		if (new File("articulos.dat").exists()) {
			listaArt = (HashSet<Articulo>) new GestorUnificado(Tipo.articulo).obtener();
		} else {
			listaArt = new HashSet<Articulo>();
		}
	}

	public HashSet<Articulo> getListaArt() {
		return listaArt;
	}

	public void setListaArt(HashSet<Articulo> listaArt) {
		this.listaArt = listaArt;
	}

	public boolean escribeObjeto(Articulo articulo) {
		listaArt.add(articulo);
		return new GestorUnificado(Tipo.articulo).escribir(listaArt);
	}

}
