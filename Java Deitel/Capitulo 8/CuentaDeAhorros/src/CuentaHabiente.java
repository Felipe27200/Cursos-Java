import java.util.Scanner;

public class CuentaHabiente 
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

	try
	{
	  CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00, "ahorrador1");	
	  CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00, "ahorrador2");	

	  mostrarInteresAnual(ahorrador1);
	  mostrarInteresAnual(ahorrador2);
	  
	  CuentaDeAhorros.modificarTasaInteres(0.05);
	  
	  System.out.println("ahorrador1:");
	  mostrarInteresMensual(ahorrador1, 13);
	  System.out.println("ahorrador2:");
	  mostrarInteresMensual(ahorrador2, 13);
	}
	catch (IllegalArgumentException e)
	{
	  System.out.println(e.getMessage());
	}
  }
  
  public static void mostrarInteresAnual(CuentaDeAhorros ahorrador)
  {
	System.out.println(ahorrador.obtenerNombre() + ":");
    System.out.printf("%3s%20s%n", "Mes", "Interes Mensual");

	for (int mes = 1; mes <= 12; mes++)
	{
      mostrarInteresMensual(ahorrador, mes);		
	}
	
	System.out.println();
  }
  
  public static void mostrarInteresMensual(CuentaDeAhorros ahorrador, int mes)
  {
     ahorrador.calcularInteresMensual();
	  
	 System.out.printf("%3d %19.2f%n", mes, ahorrador.obtenerSaldoAhorros());
  }
}
