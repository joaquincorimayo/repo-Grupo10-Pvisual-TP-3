package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String ingreso = " ";
		String nombreFruta = " ";
		int indice;
		int contador = 0;
		ArrayList<String> frutas = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Ingrese nombre de fruta: ");
			nombreFruta = scanner.nextLine();
			frutas.add(nombreFruta);
			System.out.println("¿Desea ingresar más datos? (S/N)");
			System.out.print("Respuesta: ");
			ingreso = scanner.nextLine();
		} while (ingreso.equals("N") == false && ingreso.equals("n") == false);

		System.out.println("INDICE PAR");
		for (int i = 0; i < frutas.size() - 1; i++) {
			if (i % 2 == 0) {
				System.out.println(".- " + frutas.get(i));
			}
		}
		System.out.println("BORRAR FRUTA");
		System.out.print("Ingrese un número entero positivo: ");
		indice = scanner.nextInt();
		if (indice >= 1 && indice <= frutas.size()) {
			System.out.println("Borrado correcto, se borro el elemento: " + frutas.get(indice - 1));
			frutas.remove(indice - 1);
		} else {
			System.out.println("El numero ingresado esta fuera del rango del Arraylist.");
		}
		System.out.println("TOTAL DE FRUTAS CARGADAS");

		for (String string : frutas) {
			System.out.println(".- " + string);
			contador++;
		}
		System.out.println("Cantidad de frutas cargadas: " + contador);
		frutas.clear();
	}
}
