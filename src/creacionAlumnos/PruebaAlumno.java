package creacionAlumnos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PruebaAlumno {

	public static void main(String[] args) {
		// Aquí va el menú con un switch --> Ari

	}
	
	//Aquí van los métodos
	public static void addAlumno() {
		// Isma - igual que la clase de amachon
	}
	
	public static void deleteAlumno(ArrayList<Alumnos> listaAlum) {
		//Paola
		Scanner consola = new Scanner(System.in);
		System.out.println("¿Qué libro quieres eleminar?");
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
			fw= new FileWriter("librosdos.csv");
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
