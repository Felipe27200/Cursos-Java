package com.herencia;

import com.empleado.Empleado;

public class EmpleadoPorComision extends Empleado{
	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSocial,
								double ventasBrutas, double tarifaComision)
	{
		super(primerNombre, apellidoPaterno, numeroSocial);
		
		if (ventasBrutas < 0.0)
			throw new IllegalArgumentException("VENTAS BRUTAS NO PUEDE SER > 0.0");
		
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException("LA TARIFA COMISION DEBE SER > 0.0 Y > 1.0");
		
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}
	
	public void setVentasBrutas(double ventasBrutas)
	{
		if (ventasBrutas < 0.0)
			throw new IllegalArgumentException("VENTAS BRUTAS NO PUEDE SER > 0.0");		

		this.ventasBrutas = ventasBrutas;
	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}
	
	public void setTarifaComision(double tarifaComision)
	{
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException("LA TARIFA COMISION DEBE SER > 0.0 Y > 1.0");
		
		this.tarifaComision = tarifaComision;
	}
	
	public double getTarifaComision() {
		return tarifaComision;
	}
	
	public double ingresos()
	{
		return getVentasBrutas() * getTarifaComision();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f%n%s: %.2f", 
				"por comisión", super.toString(), "ventas brutas",
				getVentasBrutas(), "tarifa de comisión", getTarifaComision());
	}
}
