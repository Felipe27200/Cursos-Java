package com.empleado;

public class Empleado {
	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSocial;
	
	public Empleado(String nombre, String apellido, String numeroSocial)
	{
		primerNombre = nombre;
		apellidoPaterno = apellido;
		this.numeroSocial = numeroSocial;
	}
	
	public String getPrimerNombre()
	{
		return primerNombre;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public String getNumeroSocial() {
		return numeroSocial;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s", "empleado", getPrimerNombre(),
				getApellidoPaterno(), "número seguro social", getNumeroSocial());
	}
}
