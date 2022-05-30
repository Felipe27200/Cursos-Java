package composicion;

public class EmpleadoPorComision {
	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSeguroSocial;
	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
								double ventasBrutas, double tarifaComision)
	{
		if (ventasBrutas < 0.0)
			throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
		
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException(
					"La tarifa comisión debe ser > 0.0 y < 1.0");
		
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	public void setVentasBrutas(double ventasBrutas)
	{
		if (ventasBrutas < 0.0)
			throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
		
		this.ventasBrutas = ventasBrutas;
	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}
	
	public void setTarifaComision(double tarifaComision)
	{
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
			throw new IllegalArgumentException(
					"La tarifa comisión debe ser > 0.0 y < 1.0");
		
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
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"Empleado por comisión", getPrimerNombre(), getApellidoPaterno(),
				"número seguro social", getNumeroSeguroSocial(), "ventas Brutas",
				getVentasBrutas(), "tarifa comisión", getTarifaComision());
	}
}
