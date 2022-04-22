package ar.edu.unju.fi.ejercicio9;

public class Producto {
	// ATRIBUTOs
	int codigo;
	double precio;
	String descripcion;
	String marca;

	// CONSTRUCTOR PARAMETRIZADO
	public Producto(int codigo, String descripcion, double precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public void incrementarPrecio(double nuevoPrecio) {
		this.precio += nuevoPrecio;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Codigo= " + codigo + ", precio= " + precio + ", descripcion= " + descripcion + ", marca= " + marca;
	}
}
