package creacionAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlumno {

	public static void main(String[] args) {
		// Aqu� va el men� con un switch --> Ari

	}
	
	//Aqu� van los m�todos
	public static void addAlumno(ArrayList<Alumnos> lista) {
		Scanner ent = new Scanner(System.in);
		
		String nombre = " ";
		int edad = 0;
		String dni = " ";
		char cont = ' ';
		
		
		do {
			
			System.out.println("Inserte los datos del alumno: ");
			System.out.println("Nombre: ");
			nombre = ent.nextLine();
			System.out.println("Edad: ");
			edad = ent.nextInt();
			System.out.println("DNI: ");
			dni = ent.nextLine();
			
			
			System.out.println("�Desea a�adir otro alumno? (S/N)");
			cont = ent.nextLine().toUpperCase().charAt(0);
			
		} while (cont == 'S');
		
	}
	
	public static void deleteAlumno() {
		//Paola
	
	}
	
	public static void mostrarAlumno() {
		//Ari - igual que la clase de amachon
		
	}
	
	public static void guardarAlumno() {
		//Paola
	
	}
}
