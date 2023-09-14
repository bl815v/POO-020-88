package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Profesor;

public class Main {
	public static void main(String[] args) {
		
		Persona a = new Persona("Esteban", 17);
		System.out.println("__________________________________________________");
		System.out.println(a);
		System.out.println("__________________________________________________");
		Estudiante b = new Estudiante("Sofia", 18, "FIGRI");
		System.out.println(b);
		System.out.println("__________________________________________________");
		Profesor c = new Profesor("Juan", 56, 42, "Planta");
		System.out.println(c);
		System.out.println("__________________________________________________");
		
	}

}
