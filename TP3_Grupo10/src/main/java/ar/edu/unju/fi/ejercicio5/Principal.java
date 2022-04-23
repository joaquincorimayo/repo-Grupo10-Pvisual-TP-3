package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		int k=0;
		
		System.out.println("Ingrese una cadena de texto");
		texto = entrada.nextLine();
		char[] caracter = new char[texto.length()];
		
		for(int i=texto.length()-1; i>=0; i--) {
			caracter[k] = texto.charAt(i);
			k++;
		}
		for (int i=0; i<caracter.length; i++) {
			System.out.print(caracter[i]);
		}
	}

}
