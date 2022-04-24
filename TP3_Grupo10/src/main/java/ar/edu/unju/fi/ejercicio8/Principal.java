package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Alumno> al_alumnos = new ArrayList<Alumno>();
		Scanner scanner = new Scanner(System.in);
		int lu;
		String nombre;
		String apellido;
		int opcion;
		int indice = -1;
		
		do {
			System.out.println("1 - Nuevo alumno");
			System.out.println("2 - Eliminar alumno");
			System.out.println("3 - Modificar notas alumno");
			System.out.println("4 - Mostrar todos los alumnos");
			System.out.println("5 - Mostrar los que superan el promedio 6");
			System.out.println("6 - Salir");
			System.out.print("Ingresar opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				// permite ingresar los datos de un nuevo alumno y guardarlo en el arrayList
				System.out.println("INGRESO DE DATOS DE ALUMNO");
				System.out.print("Ingresar nombre: ");
				nombre = scanner.nextLine();
				System.out.print("Ingresar apellido: ");
				apellido = scanner.nextLine();
				System.out.print("Ingresar libreta universitaria: ");
				lu = scanner.nextInt();
				scanner.nextLine();
				double[] arr_notas = new double[5];
				int not = 1;
				while (not <= 5) {
					System.out.print("Ingresar la " + not + " nota del alumno: ");
					double nota = scanner.nextDouble();
					scanner.nextLine();
					arr_notas[not - 1] = nota;
					not++;
				}
				Alumno obj_alumno = new Alumno(nombre, apellido, lu, arr_notas);
				al_alumnos.add(obj_alumno);
				System.out.println("Se agrego correctamente al alumno.");
				break;
			case 2:
				// permite eliminar un alumno ingresando su libreta universitaria.
				if (al_alumnos.size() == 0) {
					System.out.println("Lista de alumnos vacia.");
				} else {
					boolean encontrado = false;
					System.out.println("ELIMINAR ALUMNO");
					System.out.print("Ingresar Libreta Universitaria del alumno: ");
					lu = scanner.nextInt();
					scanner.nextLine();
					for (Alumno alumno : al_alumnos) {
						if (alumno.getLibretaUniversitaria() == lu) {
							indice = al_alumnos.indexOf(alumno);
							encontrado = true;
						}
					}
					if (encontrado) {
						al_alumnos.remove(indice);
						System.out.println("Se borro correctamente el alumno.");
					} else {
						System.out.println("La libreta ingresada no pertenece a ningun alumno.");
					}
				}
				break;
			case 3:
				// permite modificar las notas del alumno ingresando su libreta universitaria.
				if (al_alumnos.size() == 0) {
					System.out.println("Lista de alumnos vacia.");
				} else {
					System.out.println("MODIFICAR NOTAS DE UN ALUMNO");
					System.out.print("Ingresar Libreta Universitaria del alumno: ");
					lu = scanner.nextInt();
					scanner.nextLine();
					boolean encontrado = false;
					for (Alumno alumno : al_alumnos) {
						if (alumno.getLibretaUniversitaria() == lu) {
							encontrado = true;
							int nott = 1;
							System.out.println("Lista de notas del alumno");
							while (nott <= 5) {
								System.out.println(nott + ") NOTA: " + alumno.getNotas()[nott - 1]);
								nott++;
							}
							double[] nuevas_notas = new double[5];
							nott = 1;
							while (nott <= 5) {
								System.out.print("Ingresar " + nott + " nota nueva: ");
								double nuevaNota = scanner.nextDouble();
								scanner.nextLine();
								nuevas_notas[nott - 1] = nuevaNota;
								nott++;
							}
							alumno.setNotas(nuevas_notas);
						}
					}
					if (encontrado) {
						System.out.println("Se modificaron los datos del alumno.");
					} else {
						System.out.println("La libreta ingresada no pertenece a ningun alumno.");
					}
				}
				break;
			case 4:
				// visualiza toda la lista de alumnos.
				if (al_alumnos.size() == 0) {
					System.out.println("Lista de alumnos vacia.");
				} else {
					System.out.println("LISTA DE ALUMNOS COMPLETA");
					for (Alumno alumno : al_alumnos) {
						System.out.println(".-" + alumno);
					}
				}

				break;
			case 5:
				// muestra la lista de alumnos que superan el promedio de 6
				if (al_alumnos.size() == 0) {
					System.out.println("Lista de alumnos vacia.");
				} else {
					System.out.println("LISTA DE ALUMNOS CON PROMEDIO MAYOR A 6.");
					for (Alumno alm : al_alumnos) {
						if (alm.calcularPromedio() > 6.0) {
							System.out.println(alm);
						}
					}
				}
				break;
			case 6:
				System.out.println("Fin del programa.");
				al_alumnos.clear();
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
		} while (opcion != 6);
	}

}
