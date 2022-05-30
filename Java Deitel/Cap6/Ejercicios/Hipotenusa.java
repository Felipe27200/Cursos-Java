import java.util.Scanner;

public class Hipotenusa
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
  
    System.out.println("Escriba la longitud del lado 1 o el ifa para terminar: ");

    while (entrada.hasNext())
    {
      double lado1 = entrada.nextDouble();

      System.out.println("Escriba el lado 2: ");
      double lado2 = entrada.nextDouble();

      if (lado1 > 0 & lado2 > 0)
      {
        System.out.printf("%nLa hipotenusa del triángulo es: %.2f%n%n",
          hipotenusa(lado1, lado2));
      }
      else 
        System.out.println("Las longitudes no pueden ser negativas");

      System.out.println("Escriba la longitud del lado 1 o el ifa para terminar: ");
    }
  }

  public static double hipotenusa(double lado1, double lado2)
  {
    double c = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));

    return c;
  }
}