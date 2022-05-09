package creacionAlumnos;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import pruebaBiblioteca.Libros;


public class PruebaAlumno {

	public static void main(String[] args) {
		
		ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
		
		// Aqui­ va el menu con un switch --> Ari
		

	}
	
	//Aqui­ van los metodos
	public static void addAlumno(ArrayList<Alumnos> lista) {
		Scanner ent = new Scanner(System.in);
	
		char cont = ' ';
		Alumnos alumno;
		
		do {

			
			
			Alumnos alumnoAd = new Alumnos();

						
			alumno = new Alumnos();

			
			System.out.println("Inserte los datos del alumno: ");
			System.out.println("Nombre: ");
			alumnoAd.setNombre(ent.nextLine());
			System.out.println("Edad: ");
			alumnoAd.setEdad(ent.nextInt());
			ent.nextLine();
			System.out.println("DNI: ");
			alumnoAd.setDni(ent.nextLine());
			
			lista.add(alumno);
			
			System.out.println("¿Desea añadir otro alumno? (S/N)");
			cont = ent.nextLine().toUpperCase().charAt(0);
			
			
			
		} while (cont == 'S');

	}
	
	public static void deleteAlumno(ArrayList<Alumnos> listaAlum) {
		//Paola
		Scanner consola = new Scanner(System.in);
		System.out.println("Alumno a eliminar");
		listaAlum.remove(Integer.parseInt(consola.nextLine())-1);
		mostrarAlumno(listaAlum);
	
	}
	
	public static void mostrarAlumno() {
		//Ari - igual que la clase de amachon
		
	}
	
	public static void guardarAlumno(ArrayList<Alumnos> listaAlum) {
		//Paola
		
		FileWriter fw=null;
		BufferedWriter bw =null;
		try {
			fw= new FileWriter("alumnos.csv");
			bw = new BufferedWriter(fw);
			for(Alumnos al:listaAlum) {
			 bw.write(al.getNombre()+";"+al.getEdad()+";"+al.getDni());
			 bw.newLine();
		 }
		 }catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try{
			if(bw !=null && fw !=null) {
				bw.close();
				fw.close();
			}
		}catch(Exception ex) {
			System.out.println("Error al cerrar" );
		}
	}

	}
}
