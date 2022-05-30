public class CuentaDeAhorros 
{
  private static double tasaInteresAnual = 0.04;
  private double saldoAhorros;
  private String nombre;
  
  public CuentaDeAhorros(double saldoAhorros, String nombre)
  {
	 if (saldoAhorros <= 0.0 || saldoAhorros > Double.MAX_VALUE)
		 throw new IllegalArgumentException("Valor inválido");
	 
	 this.saldoAhorros = saldoAhorros;
	 this.nombre = nombre;
  }
  
  public void establecerSaldoAhorros(double saldoAhorros)
  {
	if (saldoAhorros <= 0.0 && saldoAhorros > Double.MAX_VALUE)
	 throw new IllegalArgumentException("Valor inválido " + nombre);
		 
	this.saldoAhorros = saldoAhorros;
  }
  
  public double obtenerSaldoAhorros()
  {
	return saldoAhorros;
  }
  
  public String obtenerNombre()
  {
	  return nombre;
  }
  
  public static void modificarTasaInteres(double nuevaTasaInteresAnual)
  {
	if (nuevaTasaInteresAnual <= 0.0 || nuevaTasaInteresAnual > Double.MAX_VALUE)
      throw new IllegalArgumentException("Valor inválido");
	
	tasaInteresAnual = nuevaTasaInteresAnual;
  }
  
  public double obtenerTasaInteresAnual()
  {
	return tasaInteresAnual;  
  }
  
  public void calcularInteresMensual()
  {
	saldoAhorros += saldoAhorros * tasaInteresAnual / 12; 
  }
}
