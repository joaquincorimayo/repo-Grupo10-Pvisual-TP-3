package ar.edu.unju.fi.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int [10];
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese 10 números enteros");	
		for (int i = 0; i<numeros.length;i++) {
				numeros[i] = entrada.nextInt();
		}
	
		for (int i = numeros.length-1; i>=0;i--) {
			System.out.println(numeros[i]);
		}
		for (int i = 0; i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}

}
