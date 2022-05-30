import java.util.Scanner;

public class Ventas_Totales
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    int[][] ventas = new int[5][4];

    for (int columna = 0; columna < ventas[0].length; columna++)
    {
      System.out.println("Empleado " + (columna + 1) + ": ");

      for (int fila = 0; fila < ventas.length; fila++)
      {
        System.out.print("Cantidad de producto " + (fila + 1) + " que vendio en el mes: ");
        int producto = entrada.nextInt();

        while (producto < 0 || producto > 10000)
        {
          System.out.print("Introduzca una cantidad entre 0 y 10000: ");
          producto = entrada.nextInt();
        }

        ventas[fila][columna] = producto;
      }

      System.out.println();
    }

    totalFila(ventas);
    totalColumna(ventas);
  }

  public static void totalFila(int[][] ventas)
  {
    System.out.print("      ");

    for (int empleado = 0; empleado < ventas[0].length; empleado++)
      System.out.printf("\tEmpleado%d", empleado + 1);

    System.out.println(" \tTotal");

    for (int fila = 0; fila < ventas.length; fila++)
    {
      int total = 0;

      System.out.printf("%s%-1d", "Prod.", fila + 1);

      for (int columna = 0; columna < ventas[fila]. length; columna++)
      {
        if (columna == 0)
          System.out.printf("\t%d", ventas[fila][columna]);
        else
          System.out.printf("\t\t%d", ventas[fila][columna]);

        total += ventas[fila][columna];
      }

      total *= precio(fila);

      System.out.printf("\t\t$%d%n%n", total);
    }
  }

  public static void totalColumna(int[][] ventas)
  {
    for (int asterisco = 1; asterisco <= 80; asterisco++)
      System.out.print("*");

    System.out.println();
    System.out.print("       ");

    for (int columna = 0; columna < ventas[0].length; columna++)
    {
      int total = 0;

      for (int fila = 0; fila < ventas.length; fila++)
      {
        total += ventas[fila][columna] * precio(fila);
      }

      if (columna == 0)
        System.out.printf("\t%d", total);
      else 
        System.out.printf("\t\t%d", total);
    }
  }

  public static int precio(int precio)
  {
    switch (precio)
    {
      case 0:
        precio = 4;
        break;

      case 1:
        precio = 8;
        break;

      case 2:
        precio = 12;
        break;

      case 3:
        precio = 16;
        break;

      case 4:
        precio = 20;
    }

    return precio;
  }
}