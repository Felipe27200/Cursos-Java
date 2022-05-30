package Horario;

import Fecha_Tiempo.Fecha;
import Fecha_Tiempo.Tiempo;

public class Main {
	public static void main(String[] args) {
		Tiempo tiempo = new Tiempo(23, 59, 59);
		Fecha fecha = new Fecha(7, 31, 2010);
		
		System.out.println(tiempo);
		
		tiempo.setFecha(fecha);
		
		System.out.println("\n" + tiempo);
		tiempo.incrementarHora();
		
		System.out.println("\n" + tiempo);
	}
}
