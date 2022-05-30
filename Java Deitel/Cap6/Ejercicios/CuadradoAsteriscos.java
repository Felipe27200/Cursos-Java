import java.util.Scanner;

public class CuadradoAsteriscos
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un número o el IFA (ctrl + z) para terminar: ");

    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();

      cuadradoDeAstericos(numero);

      System.out.print("Escriba un número o el IFA (ctrl + z) para terminar: ");
    }
  }

  public static void cuadradoDeAstericos(int lado)
  {
    for (int contador = 1; contador <= lado; contador++)
    {
      for (int i = 1; i <= lado; i++)
      {
        System.out.print("*");
      }
  
      System.out.println();
    }
  }
}