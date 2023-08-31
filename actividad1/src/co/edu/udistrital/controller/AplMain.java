package co.edu.udistrital.controller;

import co.edu.udistrital.model.Persona;

public class AplMain {

	public static void main(String[] args) {
		Persona a;
		a = new Persona();
		Persona b = new Persona();
		
		a.nombre = "Esteban";
		a.edad = 17;
		b.nombre = "Sofia";
		b.edad = 18;
		
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println("Se llaman igual? " + a.sonNombresIguales(b));
		System.out.println();
		System.out.println(a.nombre + " " + a.esMayor(b) + " que " + b.nombre);
		System.out.println();
		
		System.out.println(a.ultimaLetraPrimero(b));
		System.out.println();
		System.out.println(a.saludo());
		System.out.println(b.saludo(a));
		
		Persona c = new Persona("Nicki", 23);
		System.out.println(a.saludo(c));
	}
}
