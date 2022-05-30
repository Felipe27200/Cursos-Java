package com.Empleados;

public class EmpleadoPorComision extends Empleado{
	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			int mes, int dia, int anio, double ventasBrutas, double tarifaComision)
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, mes, dia, anio);
		
		validarTarifaComision(tarifaComision);
		validarVentasBrutas(ventasBrutas);

		this.tarifaComision = tarifaComision;
		this.ventasBrutas = ventasBrutas;
	}
	
	public void setTarifaComision(double tarifaComision) {
		validarTarifaComision(tarifaComision);
		
		this.tarifaComision = tarifaComision;
	}
	
	public double getTarifaComision() {
		return tarifaComision;
	}
	
	public void setVentasBrutas(double ventasBrutas) {
		validarVentasBrutas(ventasBrutas);
		
		this.ventasBrutas = ventasBrutas;
	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}
	
	@Override
	public double ingresos()
	{
		return getTarifaComision() *  getVentasBrutas();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
				"empleado por comisión", super.toString(),
				"ventas brutas", getVentasBrutas(),
				"tarifa de comisión", getTarifaComision());
	}
	
	// Métodos static para validar las Variables de Instacia
	private static void validarVentasBrutas(double ventasBrutas)
	{
		if (ventasBrutas < 0.0)
			throw new IllegalArgumentException("\n••• Las ventas brutas deben ser >= 0.0 •••\n");
	}
	
	private static void validarTarifaComision(double tarifaComision)
	{
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException("\n••• La tarifa de comision debe ser > 0.0 y < 1.0 •••\n");
	}
}
