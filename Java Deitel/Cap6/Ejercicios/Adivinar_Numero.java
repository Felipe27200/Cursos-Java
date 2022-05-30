import java.security.SecureRandom;
import java.util.Scanner;

public class Adivinar_Numero
{
  public static void main(String[] args)
  {
    SecureRandom numeroAleatorio = new SecureRandom();    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Adivina el número o escribe (Ctrl + z) para terminar: ");

    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();
      int adivinar = 1 + numeroAleatorio.nextInt(1000);
      int intentos = 0;

      while (numero != adivinar)
      {
        if (numero < adivinar)
          System.out.println("Demasiado bajo. Intente de nuevo.");

        if (numero > adivinar)
          System.out.println("Demasiado alto. Intente de nuevo.");

        intentos++;

        System.out.print("Intenta de nuevo: ");
        numero = entrada.nextInt();
      }

      System.out.println("Felicidades. Adivino el número! " + adivinar);
      System.out.printf("%nNúmero de intentos: %d%n", intentos);

      if (intentos < 10)
         System.out.println("¡O ya sabía usted el secreto, o tuvo suerte!\n");
      else if (intentos == 10)
         System.out.println("¡Aja! ¡Sabía usted el secreto!\n");
      else if (intentos > 10)
         System.out.println("¡Debería haberlo hecho mejor!\n");

      System.out.print("Adivina el número o escribe (Ctrl + z) para terminar: "); 
    }
  }
}