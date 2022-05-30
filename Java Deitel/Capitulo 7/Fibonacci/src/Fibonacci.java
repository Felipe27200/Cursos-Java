import java.util.Scanner;

public class Fibonacci 
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
	  
	System.out.print("Escriba el número n para la serie de Fibonacci o <Ctrl> z para salir: ");
	
	while (entrada.hasNext())
	{
      int enesimo = entrada.nextInt();

	  fibonacci(enesimo);
	  System.out.println();

	  System.out.print("Escriba el número n para la serie de Fibonacci o <Ctrl> z para salir: ");
	}
  }
  
  public static void fibonacci(int enesimo)
  {
	double numero1 = 0; 
	double numero2 = 1;
	
	for (int contador = 1; contador <= enesimo; contador++)
	{
	  double suma = numero1 + numero2;
	  
	  numero1 = numero2; numero2 = suma;
	  
	  System.out.printf("Numero%d: %.0f%n", contador, suma);
	}
  }
}
