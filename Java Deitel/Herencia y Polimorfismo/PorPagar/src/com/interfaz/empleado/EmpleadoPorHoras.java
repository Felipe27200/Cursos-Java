package com.interfaz.empleado;

public class EmpleadoPorHoras extends Empleado{

	private double sueldo;
	private double horas;
	
	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			double sueldo, double horas)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		
		validarSueldo(sueldo);
		validarHoras(horas);
		
		this.horas = horas;
		this.sueldo = sueldo;
	}
	
	public void setHoras(double horas) {
		validarHoras(horas);
		
		this.horas = horas;
	}
	
	public double getHoras() {
		return horas;
	}
	
	public void setSueldo(double sueldo) {
		validarSueldo(sueldo);
		
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	@Override
	public double obtenerMontoPago()
	{
		if (getHoras() <= 40)
			return getSueldo() * getHoras();
		else
			return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
	}
	
	@Override
	public String toString()
	{
		return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "Sueldo por hora", getSueldo(), "Horas Trabajadas",
				getHoras());
	}
	
	private static void validarSueldo(double sueldo)
	{
		if (sueldo < 0.0)
			throw new IllegalArgumentException("\n••• El sueldo por horas debe ser mayor a 0.0 •••\n");
	}
	
	private static void validarHoras(double horas)
	{
		if (horas < 0.0 || horas > 168.0)
			throw new IllegalArgumentException("\n••• Las horas deben ser >= 0.0 o <= 168.0");
	}
}
