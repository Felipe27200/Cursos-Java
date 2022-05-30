import java.util.Scanner;

public class PruebaRectangulo 
{
  public static void main(String[] args) throws IllegalArgumentException
  {
	Scanner entrada = new Scanner(System.in);
	Rectangulo rectangulo = new Rectangulo();  
	
	System.out.print("Escribe la longitud y la anchura separados por espacio o <Ctrl> z para terminar: ");
	
	while(entrada.hasNext())
	{
	  double longitud = entrada.nextDouble();
	  double anchura = entrada.nextDouble();
		
	  try
	  {
		rectangulo.establecerLongitud(longitud);
		rectangulo.establecerAnchura(anchura);
		
		System.out.printf("%nEl perimetro es: %.2f%nEl área es: %.2f%n", rectangulo.perimetro(),
				rectangulo.area());
	  }
	  catch (IllegalArgumentException e)
	  {
		 System.out.println(e.getMessage());
	  }
	  
		System.out.print("\nEscribe la longitud y la anchura separados por espacio o <Ctrl> z para terminar: ");
	}
  }
}
