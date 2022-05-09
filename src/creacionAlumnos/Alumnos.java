package creacionAlumnos;

public class Alumnos {
	
	//Aquí hay que hacer la parte de los Alumnos, con los getter, setter y el toString
	//Parte de Isma
	private String nombre;
	private int edad;
	private String dni;
	
	
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
		return "Alumno: " + "\n\t" + "Nombre: " + getNombre() + "\n\t" + "Edad: " + getDni() + "\n\t" + "DNI: " + getDni();
	}
	
	
	
}
