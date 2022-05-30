package com.Empleados;

import com.fechanacimiento.Fecha;
import com.interfaz.PorPagar;

public abstract class Empleado implements PorPagar{
	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSeguroSocial;
	
	private Fecha fechaNacimiento;

	public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, int mes, int dia, int anio) 
	{
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		
		try {
			fechaNacimiento = new Fecha(mes, dia, anio);			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
			
			System.out.println("\n••• LA FECHA NACIMIENTO NO PUDO SER ESTABLECIDA •••\n");
		}
	}
	
	public String getPrimerNombre()
	{
		return primerNombre;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	@Override
	public double obtenerMontoPago() {
		return ingresos();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s%nNúmero de seguro social: %s%nFecha de Nacimiento: %s", getPrimerNombre(),
				getApellidoPaterno(), getNumeroSeguroSocial(), getFechaNacimiento());
	}
	
	public abstract double ingresos();
}
