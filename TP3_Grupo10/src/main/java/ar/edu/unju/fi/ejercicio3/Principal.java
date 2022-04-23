package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Alumno alu = new Alumno();
		double[] notas = new double[5];

		System.out.println("INGRESE DATOS DEL ALUMNO");
		System.out.print("Ingrese nombre del alumno: ");
		String nom = scan.nextLine();
		alu.setNombre(nom);
		System.out.print("Ingrese apellido del alumno: ");
		String ap = scan.nextLine();
		alu.setApellido(ap);
		System.out.print("Ingrese L.U. del Alumno: ");
		int lu = scan.nextInt();
		alu.setLibretaUniversitaria(lu);
		System.out.println("Ingrese las 5 notas");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ")");
			notas[i] = scan.nextDouble();

		}
		alu.setNotas(notas);
		System.out.println("DATOS DEL ALUMNO");
		System.out.println(alu.toString());
		System.out.println("Promedio: " + alu.calcularPromedio());
		System.out.println("Nota maxima: " + alu.obtenerNotaMaxima());

	}

}
