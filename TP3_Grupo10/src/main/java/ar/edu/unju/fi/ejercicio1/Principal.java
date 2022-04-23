package ar.edu.unju.fi.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Principal mostrar = new Principal();

		int ar1[] = new int[5];
		int ar2[] = new int[5];
		boolean band = true;
		while (band == true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Ingrese 5 numeros para guardar en el primer arreglo ");
				for (int i = 0; i < ar1.length; i++) {
					System.out.print((i + 1) + ")");
					ar1[i] = scan.nextInt();
				}
				System.out.println("Ingrese 5 numeros para guardar en el segundo arreglo ");
				for (int j = 0; j < ar2.length; j++) {
					System.out.print((j + 1) + ")");
					ar2[j] = scan.nextInt();
					if (ar2[j] == 0) {
						System.out.println("debe ingresar un numero diferente de 0");
						j--;

					}

				}
				band = false;
			} catch (InputMismatchException e) {
				System.out.println("Debe Ingresar solo numeros enteros");
			}
		}

		mostrar.mostrarDiv(ar1, ar2);
	}

	public void mostrarDiv(int ar1[], int ar2[]) {
		int res[] = new int[5];
		for (int i = 0; i < res.length; i++) {
			res[i] = ar1[i] / ar2[i];
			System.out.println("resultado de " + ar1[i] + "/" + ar2[i] + "=" + res[i]);
		}

	}

}
