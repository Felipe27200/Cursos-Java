import java.util.Scanner;

public class MinimoDeTres
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba los 3 dígitos o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      double numero1 = entrada.nextDouble();
      double numero2 = entrada.nextDouble();
      double numero3 = entrada.nextDouble();

      System.out.printf("%nEl número de menor valor es: %.2f%n%n",
        minimo3(numero1, numero2, numero3));

      System.out.print("Escriba los 3 dígitos o el IFA para terminar: ");
    }
  }

  public static double minimo3(double x, double y, double z)
  {
    return Math.min(x, Math.min(y, z));
  }
}