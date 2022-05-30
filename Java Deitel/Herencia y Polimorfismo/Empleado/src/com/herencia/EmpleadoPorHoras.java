package com.herencia;

import com.empleado.Empleado;

public class EmpleadoPorHoras extends Empleado{
	private double horas;
	private double sueldo;
	
	public EmpleadoPorHoras(String nombre, String apellido, String numeroSocial,
							double horas, double sueldo)
	{
		super(nombre, apellido, numeroSocial);
		
		if (sueldo < 0.0)
			throw new IllegalArgumentException("SUELDO DEBE SER MAYOR A CERO");
		
		if (horas < 0.0 || horas > 168)
			throw new IllegalArgumentException("LAS HORAS DEBEN SER >= 0.0 O <= 128.0");
		
		this.sueldo = sueldo;
		this.horas = horas;
	}
	
	public void setSueldo(double sueldo)
	{
		if (sueldo < 0.0)
			throw new IllegalArgumentException("SUELDO DEBE SER MAYOR A CERO");

		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setHoras(double horas) {
		if (horas < 0.0 || horas > 168)
			throw new IllegalArgumentException("LAS HORAS DEBEN SER >= 0.0 O <= 128.0");

		this.horas = horas;
	}
	
	public double getHoras() {
		return horas;
	}
	
	public double ingresos() {
		return getHoras() * getSueldo();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f%n%s: %.2f", "por horas",
				super.toString(), "horas trabajadas", getHoras(),
				"sueldo por hora", getSueldo());
	}
}
