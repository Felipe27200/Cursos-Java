import java.util.Scanner;

public class ConstanteE
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un entero (+) o -1 para terminar: ");
    int numero = entrada.nextInt();

    while(numero != -1)
    {
      double registroFactorial = 0;
      int numero1 = numero;
      
      while (numero1 >= 1)
      {
        int factorial = 1;
        int calculoFactorial = 1;

        while (factorial <= numero1)
        {
          calculoFactorial *= factorial;
          ++factorial;
        }    

        registroFactorial += 1 / (double)calculoFactorial;
        numero1--;
      }
 
      double constanteE = 1 + registroFactorial;

      if (numero >= 1)
      System.out.printf("La constante de E de %d es: %.15f%n", numero, constanteE);

      System.out.print("Escriba un entero (+) o 0 para terminar: ");
      numero = entrada.nextInt();
    }
  }
}