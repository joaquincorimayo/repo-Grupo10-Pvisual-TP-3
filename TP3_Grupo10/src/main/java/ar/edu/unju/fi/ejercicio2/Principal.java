package ar.edu.unju.fi.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean band = true;
		int ingreso;

		try {
			while (band) {
				System.out.println("Ingrese un numero entero entre [1,9] ");
				ingreso = scan.nextInt();
				for (int i : num) {
					int x = ingreso * i;
					System.out.println(ingreso + "x" + i + "=" + x);
				}
				System.out.println("Desea volver a intentar? ");
				System.out.println("S/N");
				String opc = scan.next();
				if (opc.equals("s") || opc.equals("S")) {
					band = true;
				} else {

					band = false;
					System.out.println("FIN DEL PROGRAMA");

				}
			}
		}

		catch (InputMismatchException e) {
			System.out.println("DEBE INGRESAR UN NUMERO ENTERO");
		}

	}

}
