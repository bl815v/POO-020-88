package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Profesor;

public class Main {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de usuarios a registrar: ");
		int n = leer.nextInt();
		while(n < 0) {
			System.out.println("Error, la cantidad debe ser positiva...");
			n = leer.nextInt();
		}
			
		Persona[] p = new Persona[n];
		
		int edad, horasClase;
		String nombre, carrera, especialidad;
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("\nSeleccione el usuario a registrar:"
					+ "\n1 = Persona"
					+ "\n2 = Estudiante"
					+ "\n3 = Profesor"
					+ "\nSu opcion: ");
			int opcion = leer.nextInt(); 
	    	leer.nextLine(); 
	    	System.out.print("Escriba el nombre: ");
	    	nombre = leer.nextLine(); 
	    	System.out.print("Escriba la edad: ");
	    	edad = leer.nextInt();
	    	switch (opcion) { 
		    case 1:
		    	Persona a = new Persona(nombre,edad);
		    	p[i] = a;
		    	break;
		    case 2:
		    	leer.nextLine(); 
		    	System.out.print("Escriba la carrera: ");
		    	carrera = leer.nextLine();
		    	Persona b = new Estudiante(nombre,edad, carrera);
		    	p[i] = b;
		    	break;
		    case 3:
		    	System.out.print("Escriba las horas de clase: ");
		    	horasClase = leer.nextInt();
		    	leer.nextLine();
		    	System.out.print("Escriba la especialidad: ");
		    	especialidad = leer.nextLine(); 
		    	Persona c = new Profesor(nombre,edad, horasClase, especialidad);
		    	p[i] = c;
		    	break;
		    default:
		    	Persona aa = new Persona(nombre,edad);
		    	p[i] = aa;
		    	break;
		    }
		    
		}
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("___________________________________________________________________");
			System.out.println(p[i]);
		}
		System.out.println("___________________________________________________________________");
		
		
	
	}
}
