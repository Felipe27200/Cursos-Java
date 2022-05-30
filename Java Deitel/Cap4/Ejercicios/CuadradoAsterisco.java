import java.util.Scanner;

public class CuadradoAsterisco
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba una longitud entre 1 y 20 o -1 para terminar: ");
    int cuadrado = entrada.nextInt();

    if (cuadrado >= 1)
    if (cuadrado <= 20)
       cuadrado = cuadrado;
    else
    {
      cuadrado = 0;
      System.out.println("Longitud no valida");
    }

    while (cuadrado != -1)
    {
      int techo = 0;

      while(techo < cuadrado)
      {
        System.out.print("*");
        techo++;
      }

      System.out.println();

      int columnas = 0;

      while (columnas < cuadrado -2)
      {
        System.out.print("*");

        // La variable vuelve a su valor inicial cada vez que el ciclo se repite.
        int espacio = 0;

        // Se compara con cuadrado ya que es la única variable sin modificar
        // La condición indica que se repite cuando el número alcance a cuadrado
        // restado -2.
        while (espacio < cuadrado - 2)
        {
          System.out.print(" ");
          espacio++;
        }

        System.out.println("*");

        columnas++;
      }

      int piso = 0;

      while(piso < cuadrado)
      {
        System.out.print("*");
        ++piso;
      }

      System.out.println();

      System.out.print("Escriba una longitud o -1 para terminar: ");
      cuadrado = entrada.nextInt();

      if (cuadrado >= 1)
       if (cuadrado <= 20)
        cuadrado = cuadrado;
      else
      {
        cuadrado = 0;
        System.out.println("Longitud no valida");
      }
    }
  } 
}