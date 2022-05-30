package composicion;

public class EmpleadoBaseMasComision {
	private double salarioBase;
	private EmpleadoPorComision empleadoPorComision;
	
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
									double ventasBrutas, double tarifaComision, double salarioBase)
	{
		empleadoPorComision = new EmpleadoPorComision(primerNombre, apellidoPaterno, numeroSeguroSocial,
													ventasBrutas, tarifaComision);	

		if (salarioBase <= 0.0)
			throw new IllegalArgumentException("Salario base deber ser mayor a cero");
		
		this.salarioBase = salarioBase;
	}

	public EmpleadoPorComision getEmpleadoPorComision() {
		return empleadoPorComision;
	}
	
	public void setSalarioBase(double salarioBase)
	{
		if (salarioBase <= 0.0)
			throw new IllegalArgumentException("Salario base deber ser mayor a cero");
		
		this.salarioBase = salarioBase;		
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double ingresos() {
		return getSalarioBase() + empleadoPorComision.ingresos();
	}
	
	public String toString()
	{
		return String.format("%s %s%n%s: %.2f", "con sueldo base",
				empleadoPorComision, "sueldo base", getSalarioBase());
	}
}
