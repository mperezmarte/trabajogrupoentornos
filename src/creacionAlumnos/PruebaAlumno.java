package creacionAlumnos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.Amazon;


public class PruebaAlumno {

	public static void main(String[] args) {
		//Ari
		ArrayList<Alumnos> listaAlum = new ArrayList<Alumnos>();
		Scanner ent = new Scanner(System.in);
		int op = 0;
		boolean continuar = true;
		
		
		while(continuar) {
		System.out.println("Elige una opcion: \n"
				+ "1�) A�adir alumno \n" 					
				+ "2�) Eliminar alumno \n" 
				+ "3�) Mostrar alumno \n"
				+ "4�) Guardar alumno \n"
				+ "5�) Salir");
		
		op = ent.nextInt();
					
		switch(op) {
			case 1: addAlumno(listaAlum);
					break;	
					
			case 2: deleteAlumno(listaAlum);
					break;
					
			case 3: mostrarAlumno(listaAlum);
					break;
					
			case 4: guardarAlumno(listaAlum);
					break;
					
			case 5: continuar = false;
					System.out.println("Has salido del programa");
					
		}
		
		}
		
		
	}
	//Aqu� van los m�todos
	public static void addAlumno() {
		// Isma - igual que la clase de amachon
	}
	
	public static void deleteAlumno(ArrayList<Alumnos> listaAlum) {
		//Paola
		Scanner consola = new Scanner(System.in);
		System.out.println("�Qu� libro quieres eleminar?");
		listaAlum.remove(Integer.parseInt(consola.nextLine())-1);
		mostrarAlumno(listaAlum);
	
	}
	//Ari
	public static void mostrarAlumno(ArrayList<Alumnos> listaAlum) {
		for(Alumnos a : listaAlum ) {
			System.out.println(a);
			
		}
				
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
