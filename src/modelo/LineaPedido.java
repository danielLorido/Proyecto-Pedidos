package modelo;

public class LineaPedido {

	private int numLinea;
	private int cantidad;
	private float precioLinea;
	private Articulo articulo;

	public LineaPedido(int numLinea, int cantidad, float precioLinea, Articulo articulo) {
		super();
		this.numLinea = numLinea;
		this.cantidad = cantidad;
		this.precioLinea = precioLinea;
		this.articulo = articulo;
	}

	public int getNumLinea() {
		return numLinea;
	}

	public void setNumLinea(int numLinea) {
		this.numLinea = numLinea;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioLinea() {
		return precioLinea;
	}

	public void setPrecioLinea(float precioLinea) {
		this.precioLinea = precioLinea;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public float precioLinea() {
		return articulo.getPrecio() * cantidad;
	}

}
