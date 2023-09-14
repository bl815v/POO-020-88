package co.edu.udistrital.model;

public class Profesor extends Persona{
	int horasClase;
	String especialidad;
	
	public Profesor(String pnombre, int pedad, int phorasClase, String pespecialidad) {
		super(pnombre, pedad);
		horasClase = phorasClase;
		especialidad = pespecialidad;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nHoras de clase: " + horasClase +
				"\nEspecialidad: " + especialidad;
	}

	public int getHorasclase() {
		return horasClase;
	}

	public void setHorasclase(int horasclase) {
		this.horasClase = horasclase;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
		
}
