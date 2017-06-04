package Tests;

import control.comportamiento.ParaAltaArticulo;

public class Prueba {

	public static void main(String[] args) {
		ParaAltaArticulo alt = new ParaAltaArticulo();

		System.out.println(alt.comprobarNumerico("23h4234"));
		System.out.println(alt.comprobarNumerico("234.234"));
		System.out.println(alt.comprobarNumerico("fdsfsdf"));
		
		System.out.println(alt.comprobarAlfabetico("23h4234"));
		System.out.println(alt.comprobarAlfabetico("fdsfgsdgsd"));

	}

}
