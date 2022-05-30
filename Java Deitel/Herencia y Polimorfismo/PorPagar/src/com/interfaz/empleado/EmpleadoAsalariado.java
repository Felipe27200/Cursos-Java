package com.interfaz.empleado;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			 double salarioSemanal)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		
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
	
	public double obtenerMontoPago()
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
