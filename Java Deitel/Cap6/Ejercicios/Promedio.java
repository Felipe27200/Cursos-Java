import java.util.Scanner;

public class Promedio
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el promedio o (Ctrl + z) para terminar: ");

    while (entrada.hasNext())
    {
      int promedio = entrada.nextInt();

      if (promedio <= 100 && promedio >= 1)
        System.out.printf("El promedio es: %d%n", puntosCalidad(promedio));
      else 
        System.out.println("Promedio no valido");

      System.out.print("Escriba el promedio o (Ctrl + z) para terminar: ");
    }
  }

  public static int puntosCalidad(int numero)
  {
    int promedio;

    switch (numero / 10)
    {
      case 10:
      case 9:
        promedio = 4;
        break;

      case 8:
        promedio = 3;
        break;

      case 7:
        promedio = 2;
        break;

      case 6:
        promedio = 1;
        break;

      default:
        promedio = 0;
    }

    return promedio;
  }
}