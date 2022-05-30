import java.util.Scanner;

public class CargosEstacionamiento
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double total = 0.0;

    System.out.println("Introduzca las horas de permanencia del cliente ");
    System.out.println(" O el indicador de fin de archivo para terminar: ");

    while (entrada.hasNext())
    {
      double horas = entrada.nextDouble();

      if (horas > 0.0 && horas <= 24.00)
      {
        System.out.printf("El cargo por estacionamiento es: %.2f%n", 
            calcularCargos(horas));

            total += 2 + calcularCargos(horas);
      }
      else
        System.out.println("Nadie pudo haber estacionado ese tiempo\n");

      System.out.printf("El total corriente de los recibos de ayer es: %f%n%n",
        total);

      System.out.println("Introduzca las horas de permanencia del cliente ");
      System.out.println(" O el indicador de fin de archivo para terminar: ");
    }
  }

  public static double calcularCargos(double horas)
  {
    double cargos = 0.0;

    if (horas > 3.00 && horas <= 3.99)
    {
      cargos = 0.5;
    }
    else if (horas > 3.99 && horas <= 24.00)
    {
      cargos = (double) ((int) ((horas - 3.00)) * 0.5);

      if (cargos >= 10.00)
         cargos = 10.00;
    }

    return cargos;
  }
}