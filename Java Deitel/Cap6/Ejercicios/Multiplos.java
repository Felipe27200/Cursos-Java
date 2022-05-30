import java.util.Scanner;

public class Multiplos
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el n�mero o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      int numero1 = entrada.nextInt();

      System.out.print("Escriba el segundo n�mero: ");
      int numero2 = entrada.nextInt();

      if (numero1 != 0)
      {
        System.out.printf("Es m�ltiplo?: %b%n", esMultiplo(numero1, numero2));
      }
      else
        System.out.println("Cero es m�ltiplo de todos los n�meros");

      System.out.print("Escriba el n�mero o el IFA para terminar: ");
    }
  }

  public static boolean esMultiplo(int numero1, int numero2)
  {
    boolean multiplo;

    if (numero2 % numero1 == 0)
       multiplo = true;
    else
      multiplo = false;

    return multiplo;
  }
}