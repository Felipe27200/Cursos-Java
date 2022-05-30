import java.util.Scanner;

public class RedondeoFloor
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escribe un número o el IFA para terminar el programa: ");

    while (entrada.hasNext())
    {
      double x = entrada.nextDouble();

      double y = Math.floor(x + 0.5);

      System.out.printf("x: %.2f%ny: %.2f%n%n", x, y);

      System.out.print("Escribe un número o el IFA para terminar el programa:");
    }
  }
}