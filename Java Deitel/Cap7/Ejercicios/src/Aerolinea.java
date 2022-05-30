import java.util.Scanner;

public class Aerolinea
{
  private static final Scanner entrada = new Scanner(System.in);

  public static void main(String[] args)
  {
    boolean[] asiento = new boolean[11];
    boolean[] cupo = new boolean[2];

    for (int i = 0; i < asiento.length; i++)
    {
      asiento[i] = false;
    }

    while (cupo[0] == false || cupo[1] == false)
    {
      System.out.println("Por favor escriba 1 para Primera Clase");
      System.out.println("Por favor escriba 2 para Económico.");
      int eleccion = entrada.nextInt();

      if (eleccion >= 1 && eleccion <= 2)       
        ordenar(eleccion, asiento, cupo);
      else
        System.out.println("Opción no valida.");
    }

    System.out.println("*************************************************");
    System.out.println("*Lo lamentamos todos los asientos están ocupados*");
    System.out.println("*************************************************");
  }

  public static void ordenar(int eleccion, boolean[] asiento, boolean[] cupo)
  {
    boolean determinar = false;

    while (determinar == false)
    {
      int a = 1, b = 5;

      if (eleccion == 2)
      {
        a = 6;
        b = 0;
      }

      for (int i = a; i < asiento.length - b; i++)
      {
        if (asiento[i] == false)
        {
          asiento[i] = true;
          determinar = true;

          System.out.printf("%nSu asiento es el #%d en %s.%n%n", i,
            (eleccion == 1 ? "Primera Clase" : "Económico"));
        }

        if (i == asiento.length - b - 1 && asiento[i] == true)
        {
          cupo[eleccion - 1] = true;
        }

        if (determinar == true)
           break;
      }

      if (determinar == false && (cupo[0] != true || cupo[1] != true))
      {
        System.out.println("\nSin cupos.\n");
        eleccion = lleno(eleccion);

        if (eleccion != 1 && eleccion != 2)
        {
          determinar = true;
          System.out.println("El proximo vuelo sale en 3 horas.\n");
        }
      }
      else
        determinar = true;
    }
  }

  public static int lleno(int eleccion)
  {
    System.out.printf("Desea un asiento en %s%n",
     (eleccion == 1 ? "Económico" : "Primera Clase"));
    System.out.printf("Escriba %d o -1 para terminar: ",
      (eleccion == 1 ? 2 : 1));
    int eleccion2 = entrada.nextInt();

    return eleccion2;
  }
}