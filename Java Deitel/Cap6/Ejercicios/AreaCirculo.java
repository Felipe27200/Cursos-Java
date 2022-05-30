import java.util.Scanner;

public class AreaCirculo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Escriba el radio del círculo");
    System.out.println("o (Ctrl + z para terminar: )");

    while (entrada.hasNext())
    {
      double radio = entrada.nextDouble();

      circuloArea(radio);

      System.out.println("Escriba el radio del círculo");
      System.out.println("o (Ctrl + z para terminar: )");
    }
  }

  public static void circuloArea(double radio)
  {
    double area = Math.PI * Math.pow(radio, 2);

    System.out.printf("El área es: %.2f%n", area);
  }
}