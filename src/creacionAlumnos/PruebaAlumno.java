package creacionAlumnos;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PruebaAlumno {

	public static void main(String[] args) {
		// AquÃ­ va el menu con un switch --> Ari
		ArrayList<Alumnos> listaLibros = new ArrayList<Alumnos>();

	}
	
	//Aqui­ van los metodos
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
