import java.util.Scanner;

public class Factorial
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un entero (+) o -1 para terminar: ");
    int numero = entrada.nextInt();

    while (numero != -1)
    {
      if (numero == 0)
         System.out.println("El factorial de 0 es: 1");

      int factorial = numero -1;
 
      int calculoFactorial = numero;
 
      while (factorial >= 1)
      {
        calculoFactorial *= factorial;
        factorial--;
      }

      if (numero != 0)
      if (numero > -2)
         System.out.printf("El fatorial de %d es: %d%n", numero, calculoFactorial);

      System.out.print("Escriba un entero (+) o -1 para terminar: ");
        numero = entrada.nextInt();
    }
  }
}