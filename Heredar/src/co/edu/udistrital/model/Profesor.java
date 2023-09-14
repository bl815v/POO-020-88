package co.edu.udistrital.model;

public class Profesor extends Persona{
	int horasclase;
	String especialidad;
	
	public Profesor(String pnombre, int pedad, int phorasclase, String pespecialidad) {
		super(pnombre, pedad);
		horasclase = phorasclase;
		especialidad = pespecialidad;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nHoras de clase: " + horasclase +
				"\nEspecialidad: " + especialidad;
	}

	public int getHorasclase() {
		return horasclase;
	}

	public void setHorasclase(int horasclase) {
		this.horasclase = horasclase;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
		
}
