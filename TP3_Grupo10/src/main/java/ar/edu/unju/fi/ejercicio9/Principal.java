package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Producto> productos;
		productos = new ArrayList<Producto>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1 – Nuevo producto");
			System.out.println("2 – Mostrar todos los productos");
			System.out.println("3 – Incrementar precio a todos los productos.");
			System.out.println("4 - Monto total de todos los productos");
			System.out.println("5 - Fin");
			System.out.print("Ingresar opcion: ");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				// permite crear un objeto de la clase Producto utilizando el constructor
				// parametrizado.
				System.out.println("NUEVO PRODUCTO");
				System.out.print("Ingresar codigo: ");
				int codigo = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Ingresar descripcion: ");
				String descripcion = scanner.nextLine();
				System.out.print("Ingresar precio: ");
				double precio = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Ingresar marca: ");
				String marca = scanner.nextLine();
				Producto prod = new Producto(codigo, descripcion, precio, marca);
				productos.add(prod);
				break;
			case 2:
				// muestra la lista de todos los productos.
				System.out.println("Lista de todos los productos");
				for (Producto pro : productos) {
					System.out.println(".- " + pro.toString());
				}
				break;
			case 3:
				// Incrementa el precio de todos los productos en 100,25$.
				for (Producto inc : productos) {
					inc.incrementarPrecio(100.25);
				}
				System.out.println("Se incremento el precio a todos los productos en 100,25$.");
				break;
			case 4:
				// suma todos los precios de los productos y muestra el resultado.
				double sumaPrecios = 0.0;
				for (Producto sumaProd : productos) {
					sumaPrecios += sumaProd.getPrecio();
				}
				System.out.println("La suma de todos los precios de los productos es: " + sumaPrecios + "$");
				break;
			case 5:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
		} while (opcion != 5);
		productos.clear();
	}
}
