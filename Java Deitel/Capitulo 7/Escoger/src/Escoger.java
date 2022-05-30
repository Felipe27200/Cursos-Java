import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;

public class Escoger
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    SecureRandom eleccion = new SecureRandom();

    System.out.print("Escribe la cantidad de ejercicios ó" + 
    " <Ctrl> z para terminar: ");

    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();
      int espacio = 0;

      System.out.print("Cuántos ejercicios desea resolver: ");
      int ejercicios = entrada.nextInt();

      if (ejercicios <= numero)
      {
        int []preguntas = new int[ejercicios];

        for (int contador = 0; contador < preguntas.length; contador++)
        preguntas[contador] = 1 + eleccion.nextInt(numero);

        Arrays.sort(preguntas);

        System.out.println("Estos son los ejercicios que solucionara:");

        for (int indice = 0; indice < preguntas.length; indice++)
        {
          for (int i = 0; i < preguntas.length; i++)
          {
            if (indice != i && preguntas[indice] == preguntas[i])
               preguntas[indice] = 0;
          }        
        }

        for (int indice : preguntas)
        {
          if (indice != 0)
          {
            System.out.printf("%-5d", indice);
            espacio++;
          }

          if (espacio % 4 == 0 && indice != 0)
          {
            System.out.println();
          }
        }
      }

      System.out.print("\nEscribe la cantidad de ejercicios ó" + 
      " <Ctrl> z para terminar: ");
    }
  }
}