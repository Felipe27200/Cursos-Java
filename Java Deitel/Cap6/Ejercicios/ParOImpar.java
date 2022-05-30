import java.util.Scanner;

public class ParOImpar
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el número o el IFA (ctrl + z) para terminar: ");

    while (entrada.hasNext())
    {
      int entero = entrada.nextInt();

      System.out.printf("%n*El número es par: %b*%n%n", esPar(entero));

      System.out.print("Escriba el número o el IFA (ctrl + z) para terminar: ");
    }
  }

  public static boolean esPar(int numero)
  {
    boolean par;

    if (numero % 2 == 0)
      par = true;
    else
      par = false;

    return par;
  }
}