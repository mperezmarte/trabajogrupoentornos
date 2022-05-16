package creacionAlumnos;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PruebaAlumno {

	public static void main(String[] args) {

		//Ari
		ArrayList<Alumnos> listaAlum = new ArrayList<Alumnos>();
		Scanner ent = new Scanner(System.in);
		int op = 0;
		boolean continuar = true;
		
		
		while(continuar) {
		System.out.println("\nElige una opcion: \n"
				+ "\t1º) Añadir alumno \n" 					
				+ "\t2º) Eliminar alumno \n" 
				+ "\t3º) Mostrar alumno \n"
				+ "\t4º) Guardar alumno \n"
				+ "\t5º) Salir");
		
		op = ent.nextInt();
					
		switch(op) {
			case 1: addAlumno(listaAlum);
					break;	
					
			case 2: deleteAlumno(listaAlum);
					break;
					
			case 3: mostrarAlumno(listaAlum);
					break;
					
			case 4: guardarAlumno(listaAlum);
				continuar = false;
				System.out.println("Has salido del programa");
					break;
			default: System.out.println("Opción no valida");
					
					
		}
		
		}
		
		
	}
	
	//Aqui van los metodos
	public static void cargarArchivo(ArrayList<Alumnos> listaAlum) {
		FileReader fr= null;
		BufferedReader br = null;
		String linea=" ";
		//LECTURA DEL FICHERO
		try {
			fr=new FileReader(".\\src\\creacionAlumnosalumnos.csv");
			br=new BufferedReader(fr);
			
			while(br.ready()) {
				linea = br.readLine();
		
				listaAlum.add(new Alumnos(linea.split(";")));
			};

	
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Error de E/S");
		}
		
		finally {
			if(br != null) {
				try{
					br.close();
				}catch(IOException ex){
					System.out.println(ex.getMessage());
				}
			}
		}
	}
	
	public static void addAlumno(ArrayList<Alumnos> lista) {
		Scanner ent = new Scanner(System.in);
		char cont = ' ';
		Alumnos alumno;
		
		do {

			Alumnos alumnoAd = new Alumnos();	
			
			System.out.println("Inserte los datos del alumno: ");
			System.out.println("Nombre: ");
			alumnoAd.setNombre(ent.nextLine());
			System.out.println("Edad: ");
			alumnoAd.setEdad(ent.nextInt());
			ent.nextLine();
			System.out.println("DNI: ");
			alumnoAd.setDni(ent.nextLine());
			
			lista.add(alumnoAd);
			
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
	//Ari
	public static void mostrarAlumno(ArrayList<Alumnos> listaAlum) {
		cargarArchivo(listaAlum);
		if(listaAlum.isEmpty()) {
			System.out.println("No hay ningún alumnos todavía\n");
		}else {
			for(Alumnos a : listaAlum ) {
				System.out.println(a);
				
			}
		}
				
	}
		
	public static void guardarAlumno(ArrayList<Alumnos> listaAlum) {
		//Paola
		
		FileWriter fw=null;
		BufferedWriter bw =null;
		try {
			fw= new FileWriter(".\\src\\creacionAlumnosalumnos.csv");
			bw = new BufferedWriter(fw);
			for(Alumnos al:listaAlum) {
			 bw.write(al.getNombre()+";"+al.getEdad()+" años;"+al.getDni());
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
