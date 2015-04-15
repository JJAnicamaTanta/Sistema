package Clases;

public class Padre extends Persona{
	private int montoAportar;

	public Padre(String nombre, String apellido, int dni, int montoAportar) {
		super(nombre, apellido, dni);
		this.montoAportar = montoAportar;
	}
	
	public double depositar(){
		
	return 	montoAportar+=10/100*montoAportar;
		
	}

}
