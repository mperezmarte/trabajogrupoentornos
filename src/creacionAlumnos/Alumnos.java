package creacionAlumnos;

public class Alumnos {
	
	//Aqu? hay que hacer la parte de los Alumnos, con los getter, setter y el toString
	//Parte de Isma
	private String nombre;
	private int edad;
	private String dni;
	
	public Alumnos() {
		nombre = "";
		edad = 0;
		dni = "";
	}
	
	public Alumnos(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Alumnos(String [] listaAl) {
		this.nombre = listaAl[0];
		this.edad = Integer.parseInt(listaAl[1]);
		this.dni = listaAl[2];
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Alumno: " + "\n\t" + "Nombre: " + getNombre() + "\n\t" + "Edad: " + getEdad() + "\n\t" + "DNI: " + getDni();
	}
	
	
	
}
