import java.util.Scanner;

public class DistanciaEntrePuntos
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba las primeras coordenadas o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      double x1 = entrada.nextDouble();
      double y1 = entrada.nextDouble();

      System.out.print("Escriba las segundas coordenadas: ");
      double x2 = entrada.nextDouble();
      double y2 = entrada.nextDouble();

      System.out.printf("La distancia entre los puntos es: %.2f%n", 
        distancia(x1, y1, x2, y2));

      System.out.print("Escriba las primeras coordenadas o el IFA para terminar: ");
    }
  }

  public static double distancia(double x1, double y1, double x2, double y2)
  {
    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    return distancia;
  }  
}