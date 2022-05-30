import java.util.Scanner;

public class Unico
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int[] arreglo = new int[5];

    for (int indice = 0; indice < arreglo.length; indice++)
    {
      System.out.print("Escriba un número entre 10 y 100: ");
      int numero = entrada.nextInt();

      if (numero >= 10 && numero <= 100)
      {
        boolean copia = false;
        arreglo[indice] = numero;

        for (int comparar = 0; comparar < arreglo.length; comparar++)
        {
          if (indice != comparar && arreglo[indice] == arreglo[comparar])
              copia = true;
        }

        if (copia == false)
           System.out.printf("%d: es único%n", arreglo[indice]);
        else
           System.out.println("Valor ya ingresado.");
      }
      else
      {
        System.out.println("Número fuera del rango");
        indice--;
      }

      System.out.println();
    }

    System.out.println("Valores únicos:");

    for (int indice = 0; indice < arreglo.length; indice++)
    {
      boolean unico = true;

      for (int diferencia = 0; diferencia < arreglo.length; diferencia++)
      {
        if (indice != diferencia && arreglo[indice] == arreglo[diferencia])
           unico = false;
      }

      if (unico == true)
         System.out.printf("%-5d", arreglo[indice]);
    }
  }
}