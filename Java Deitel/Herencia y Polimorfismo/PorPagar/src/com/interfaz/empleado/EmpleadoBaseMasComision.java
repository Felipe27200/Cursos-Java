package com.interfaz.empleado;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	private double salarioBase;
	
	public EmpleadoBaseMasComision (String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			double ventasBrutas, double tarifaComision, double salarioBase)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial,
				ventasBrutas, tarifaComision);
		
		validarSalarioBase(salarioBase);
		
		this.salarioBase = salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		validarSalarioBase(salarioBase);
		
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	public double obtenerMontoPago()
	{
		return getSalarioBase() + super.obtenerMontoPago();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s%n%s: $%,.2f",
				"con salario base", super.toString(),
				"salario base", getSalarioBase());
	}
	
	private static void validarSalarioBase(double salarioBase) {
		if (salarioBase < 0.0)
			throw new IllegalArgumentException("\n••• El salario base de ser >= 0.0 •••\n");
	}
}
