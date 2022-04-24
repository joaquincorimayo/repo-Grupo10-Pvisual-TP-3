package ar.edu.unju.fi.ejercicio3;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String apellido;
	private int libretaUniversitaria;
	private double[] notas;

	// CONSTRUCTORES
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, int libretaUniversitaria, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.notas = notas;
	}

	// GET Y SET DE LOS ATRIBUTOS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	

	@Override
	public String toString() {
		return "Nombre del Alumno=" + nombre + ", Apellido del Alumno=" + apellido + ", Libreta Universitaria del Alumno=" + libretaUniversitaria
				+ ", Notas del Alumno=" + Arrays.toString(notas);
	}

	public double calcularPromedio() {
		double suma = 0.0;
		double promedio = 0.0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		promedio = suma / notas.length;
		return promedio;
	}

	public double obtenerNotaMaxima() {
		double max = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > max) {
				max = notas[i];
			}
		}
		return max;
	}

}

