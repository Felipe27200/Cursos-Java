import java.util.Scanner;

public class Triangulo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el primer lado o 0 para terminar: ");
    double lado1 = entrada.nextDouble();

    while (lado1 != 0)
    {
      System.out.print("Escriba el segundo lado: ");
      double lado2 = entrada.nextDouble();

      if (lado2 == 0)
        System.out.println("0 no puede ser el lado de un triángulo");

      System.out.print("Escriba el tercer lado: ");
      double lado3 = entrada.nextDouble();

      if (lado3 == 0)
        System.out.println("0 no puede ser el lado de un triángulo");

      double suma1 = lado2 + lado3;
      double suma2 = lado1 + lado3;
      double suma3 = lado1 + lado2;

      if (lado2 != 0)
      if (lado3 != 0)
      if (suma1 > lado1)
      if (suma2 > lado2)
      if (suma3 > lado3)
         System.out.println("Los lados pueden formar un triángulo");
      else 
        System.out.println("Los lados no pueden formar un triángulo");

    System.out.print("Escriba el primer lado o 0 para terminar: ");
    lado1 = entrada.nextDouble();
    }
  }
}