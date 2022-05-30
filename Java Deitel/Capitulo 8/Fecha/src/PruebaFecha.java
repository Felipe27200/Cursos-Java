public class PruebaFecha 
{
  public static void main(String[] args)
  {
	Fecha fecha = new Fecha(12, 1, 1003);
	
	System.out.printf("%2s/%2s/%2s%n", "MM", "DD", "AA");
	   
	for (int contador = 1; contador <= 91; contador++)
	{
      if (contador > 1)
	  fecha.siguienteDia();

	  System.out.println(fecha);	  
	}
  }
}
