package ar.edu.unju.fi.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int [8];
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese 8 números enteros");
		for (int i = 0; i<numeros.length;i++) {
				numeros[i] = entrada.nextInt();
		}
		for (int i = 0; i<numeros.length;i++) {
			if ((numeros[i]%2) == 0) {
				System.out.println("El nro: "+numeros[i]+" es PAR");
			}
			else {
				System.out.println("El nro: "+numeros[i]+" es IMPAR");
			}
		}	
	}
}
