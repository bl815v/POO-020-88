package co.edu.udistrital.model;

public class Persona {
	public String nombre;
	public int edad;
	
	//contructor
	public Persona () {
		nombre = "";
		edad = 0;
	}

	//toString
	@Override
	public String toString() {
		return "\nNombre: " + nombre + 
				"\nEdad: " + edad;
	}
	
	public boolean sonNombresIguales(Persona x) {
		if(nombre.equals(x.nombre))
			return true;
		else
			return false;
	}
	
	public String esMayor(Persona x) {
		if(edad > x.edad)
			return "Es mayor";
		else if(edad == x.edad)
			return "Es igual";
		else
			return "Es menor";
	}
	

	public String ultimaLetraPrimero(Persona x) {
		char ultimaLetra1 = nombre.charAt(nombre.length() - 1);
		char ultimaLetra2 = x.nombre.charAt(x.nombre.length()-1);
		
		if(ultimaLetra1 < ultimaLetra2)
			return "La ultima letra de " + nombre + " va primero que la de " + x.nombre;
		else
			return "La ultima letra de " + x.nombre + " va primero que la de " + nombre;
	}
	
	public String saludo() {
		return "Hola a todos!";
	}
	
	public String saludo(Persona x) {
		return "Hola " + x.nombre + "!";
	}
	
	
}
