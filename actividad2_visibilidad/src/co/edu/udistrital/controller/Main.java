package co.edu.udistrital.controller;

import co.edu.udistrital.model.Mascota;

public class Main {

	public static void main(String[] args) {
		Mascota x = new Mascota();
		
		x.setNombre("Toby"); x.setTipo("Perro"); x.setEdad(5);
		System.out.println(x);
		System.out.println("Mi mascota se llama " + x.getNombre());
		System.out.println();
		
		Mascota y = new Mascota("Zeus", "Perro", 3);
		System.out.println(y);
	}

}
