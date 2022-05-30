package com.Empleados;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			int mes, int dia, int anio, double salarioSemanal)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, mes, dia, anio);
		
		validarSalarioSemanal(salarioSemanal);
		
		this.salarioSemanal = salarioSemanal;
		
	}
	
	public void setSalarioSemanal(double salarioSemanal)
	{
		validarSalarioSemanal(salarioSemanal);
		
		this.salarioSemanal = salarioSemanal;
	}
	
	public double getSalarioSemanal()
	{
		return salarioSemanal;
	}
	
	@Override
	public double ingresos()
	{
		return getSalarioSemanal();
	}
	
	@Override
	public String toString()
	{
		return String.format("Empleado Asalariado: %s%n%s: $%.2f", super.toString(),
				"Salario semanal", getSalarioSemanal());
	}
	
	private static void validarSalarioSemanal(double salarioSemanal)
	{
		if (salarioSemanal < 0.0)
			throw new IllegalArgumentException("••• El salario semanal debe ser mayor a 0.0 •••");
	}
}
