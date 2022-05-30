import java.util.Scanner;

public class FExponencial
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el entero (+) para la constante E o 0 para terminar: ");
    int numero = entrada.nextInt();

    while (numero != 0)
    {
      if (numero > 0)
      {
        System.out.print("Escriba el valor de x: ");
        int base = entrada.nextInt();

        if (base > 0)
        {
          double registroFactorial = 0;
          int numero1 = numero;
          int exponente = numero;

          while (numero1 >= 1)
          {   
            double factorial = 1;
            double calculoFactorial = 1;
          
            while (factorial <= numero1)
            {
              calculoFactorial *= factorial;
              factorial++;
            }

            double exponencial = Math.pow(base, exponente);
            registroFactorial += exponencial / calculoFactorial;
            exponente--;
            numero1--;
          }

          double constanteE = 1 + registroFactorial;

          System.out.printf("La constante de E en funcion exponencial de %d es: %f%n",
          numero, constanteE);
        }
        else 
          System.out.println("Valor no valido");
      }
      else
       System.out.println("Valor no valido");

      System.out.print("Escriba el entero (+) para la constante E o 0 para terminar: ");
      numero = entrada.nextInt();
    }
  }
}