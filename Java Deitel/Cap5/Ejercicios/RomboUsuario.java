import java.util.Scanner;

public class RomboUsuario
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.println("******************************");
    System.out.println("*Programa que dibuja un Rombo*");
    System.out.println("******************************\n");

    System.out.print("Escriba un número o impar o -1 para terminar:");
    int numero = entrada.nextInt();

    while (numero != -1)
    {
      if (numero %2 != 0 && numero >= 1 && numero <= 19)
      {
        for (int contador = 1; contador <= numero; contador += 2)
        {
          for (int espacio = numero + 3; espacio >= contador + 2; espacio -= 2)
            System.out.print(" ");

          for (int asterisco = 1; asterisco <= contador; asterisco++)
            System.out.print("*");

          System.out.println();
        }

        for (int contador = numero - 2; contador >= 1; contador -= 2)
        {
          for (int espacio = numero ; espacio >= contador; espacio -= 2)
            System.out.print(" ");

          for (int asterisco = 1; asterisco <= contador; asterisco++)
            System.out.print("*");

         System.out.println();
        }
      }
      else
      {
        System.out.println("*****************");
        System.out.println("*Valor no valido*");
        System.out.println("*****************");
      }

      System.out.print("Escriba un número o impar o -1 para terminar:");
        numero = entrada.nextInt();
    }
  }
}
 
