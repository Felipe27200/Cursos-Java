import java.util.Scanner;

public class MCD
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el entero o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      int numero1 = entrada.nextInt();

      System.out.print("Escriba el segundo entero: ");
      int numero2 = entrada.nextInt();

      if (numero1 > numero2)
        System.out.printf("El MCD es: %d%n", mcd(numero1, numero2));
      else if (numero2 > numero1)
        System.out.printf("El MCD es: %d%n", mcd(numero2, numero1));

      System.out.print("Escriba el entero o el IFA para terminar: ");
    }
  }

  public static int mcd(int mayor, int menor)
  {
    int dividendo = mayor;
    int divisor = menor;
    int residuo = 1;

    if (mayor != 0 && menor != 0)
    {
      while (residuo != 0)
      {
        residuo = dividendo % divisor;

        dividendo = divisor;
        divisor = residuo;
      }
     }
     else if (mayor == 0 || menor == 0)
     {
       return 0;
     }

    return dividendo;
  }
}