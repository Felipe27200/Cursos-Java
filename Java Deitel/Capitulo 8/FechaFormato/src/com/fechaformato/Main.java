package com.fechaformato;

public class Main {
	public static void main(String[] args) {
		try {
			Fecha fecha1 = new Fecha(60, 2020);
			
			System.out.println("Fecha: " + fecha1);
			System.out.println("Fecha: " + fecha1.mesString());
			System.out.println("Fecha: " + fecha1.diaDelAnio());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}		
		Fecha fecha2 = new Fecha("Julio", 27, 2013);
		Fecha fecha3 = new Fecha (29, 3, 2020);	
		
		System.out.println("\nFecha 2: " + fecha2);
		System.out.println("Fecha 2: " + fecha2.mesString());
		System.out.println("Fecha 2: " + fecha2.diaDelAnio());

		System.out.println("\nFecha 3: " + fecha3);
		System.out.println("Fecha 3: " + fecha3.mesString());
		System.out.println("Fecha 3: " + fecha3.diaDelAnio());
	}
}
