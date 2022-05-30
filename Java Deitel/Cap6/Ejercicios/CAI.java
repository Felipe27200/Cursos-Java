import java.security.SecureRandom;
import java.util.Scanner;

public class CAI
{
   private static SecureRandom numerosAleatorios = new SecureRandom();
   private static int multiplicando;
   private static int multiplicador;

  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.printf("%s%n%s%n", "El número entero que escribas representa el nivel o ",
      "cantidad de dígitos que tendra cada factor.");

    System.out.print("Escoge un nivel o (Ctrl + z) para terminar: ");

    while (entrada.hasNext())
    {
      int dificultad = entrada.nextInt();      
      int correcto = 0;

      System.out.printf("Escoge: 1 = suma; 2 = resta; 3 = multiplicacion; %s%s%n", 
        "4 = division; ", "5 = aleatorio.");
      int aritmetica = entrada.nextInt();

      if (dificultad >= 1)
      {
        for (int contador = 1; contador <= 10; contador++)
        {
          int resultado = analisis(dificultad, aritmetica);

          System.out.print("Escribe la respuesta: ");
          int producto = entrada.nextInt();

          if (producto == resultado)
          {
            evitaLaFatiga(true);
            correcto++;
          }

          while (producto != resultado)
          {
            evitaLaFatiga(false);

            if (contador == 10)
              break;

            producto = entrada.nextInt();
            contador++;

            if (producto == resultado)
              evitaLaFatiga(true);
          }
        }
      }

      if (correcto >= 7)
      {
        System.out.println("\n¡Felicidades, estás listo para pasar al siguiente nivel!\n");
      }
      else if (correcto < 7)
      {
        System.out.println("\nPor favor pide ayuda adicional a tu instructor\n");
      }

      System.out.printf("%s%n%s%n", "El número entero que escribas representa el nivel o ",
        "cantidad de dígitos que tendra cada factor.");

      System.out.print("Escoge un nivel o (Ctrl + z) para terminar: ");
    }
  }

  public static int analisis(int dificultad, int aritmetica)
  {
    int cifra = 1;
    int resultado = 0;

    if (aritmetica == 5)
      aritmetica = 1 + numerosAleatorios.nextInt(4);

    for (int contador = 1; contador <= dificultad; contador++)
      cifra *= 10;

    multiplicando = numerosAleatorios.nextInt(cifra);
    multiplicador = numerosAleatorios.nextInt(cifra);

    switch (aritmetica)
    {
      case 1:
        System.out.printf("¿Cuánto es %d más %d?%n%n", multiplicando, multiplicador);
        resultado = multiplicando + multiplicador;
        break;

      case 2:
        System.out.printf("¿Cuánto es %d menos %d?%n%n", multiplicando, multiplicador);
        resultado = multiplicando - multiplicador;
        break;

      case 3:
        System.out.printf("¿Cuánto es %d por %d?%n%n", multiplicando, multiplicador);
        resultado = multiplicando * multiplicador;
        break;

      case 4:
        System.out.printf("¿Cuánto es %d entre %d?%n%n", multiplicando, multiplicador);
        resultado = multiplicando / multiplicador;
        break;
    }

    return resultado;
  }

  public static void evitaLaFatiga(boolean resultado)
  {
    if (resultado == true)
    {
      switch (1 + numerosAleatorios.nextInt(4))
      {
        case 1:
          System.out.println("¡Muy bien!\n");
          break;

        case 2:
          System.out.println("¡Excelente!\n");
          break;

        case 3:
          System.out.println("¡Buen trabajo!\n");
          break;

        case 4:
          System.out.println("¡Sigue así!\n");
          break;
      }
    }
    else
    {
      switch (1 + numerosAleatorios.nextInt(4))
      {
        case 1:
          System.out.println("No. Por favor intenta de nuevo.");
          break;

        case 2:
          System.out.println("Incorrecto. Intenta una vez más.");
          break;

        case 3:
          System.out.println("¡No te rindas!");
          break;

        case 4:
          System.out.println("No. Sigue intentando.");
          break;
      }
    }
  }
}