package com.Empleados;

public class TrabajadorPorPiezas extends Empleado{
	private double sueldo;
	private int piezas;
	
	public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			int mes, int dia, int anio, int piezas, double sueldo)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, mes, dia, anio);
		
		validarPiezas(piezas);
		validarSueldo(sueldo);
		
		this.piezas = piezas;
		this.sueldo = sueldo;
	}
	
	public void setPiezas(int piezas) {
		validarPiezas(piezas);

		this.piezas = piezas;
	}
	
	public int getPiezas() {
		return piezas;
	}
	
	public void setSueldo(double sueldo) {
		validarSueldo(sueldo);
		
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	@Override
	public double ingresos() {
		return getSueldo() * getPiezas();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d; %s: $%.2f",
				"Trabajador por Piezas", super.toString(), 
				"Piezas producidas", getPiezas(),"Sueldo", getSueldo());
	}
	
	private static void validarPiezas(int piezas)
	{
		if (piezas < 0)
			throw new IllegalArgumentException("••• Las piezas realizadas deben ser >= 0 •••");
	}
	
	private static void validarSueldo(double sueldo)
	{
		if (sueldo < 0)
			throw new IllegalArgumentException("••• El sueldo debe ser >= 0 •••");		
	}
}
