import java.util.Scanner;

public class Barras
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int contador = 1;
    int numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, numero5 = 0;

    while (contador <= 5)
    {
      System.out.print("Escriba un número (Z) entre 1 y 30: ");
      int numero = entrada.nextInt();

      if (numero >= 1 && numero <= 30)
      {
        switch (contador)
        {
          case 1: 
            numero1 = numero;
            break;

          case 2: 
            numero2 = numero;
            break;

          case 3: 
            numero3 = numero;
            break;

          case 4: 
            numero4 = numero;
            break;

          case 5: 
            numero5 = numero;
            break;
        }

        contador++;
      }
      else 
        System.out.println("No es un valor valido");

      if (contador == 6)
      {
        for (int asterisco = 1; asterisco <= numero1; asterisco++)
         System.out.print("*");

         System.out.println();

        for (int asterisco = 1; asterisco <= numero2; asterisco++)
         System.out.print("*");

         System.out.println();

        for (int asterisco = 1; asterisco <= numero3; asterisco++)
         System.out.print("*");

         System.out.println();

        for (int asterisco = 1; asterisco <= numero4; asterisco++)
         System.out.print("*");

         System.out.println();

        for (int asterisco = 1; asterisco <= numero5; asterisco++)
         System.out.print("*");

         System.out.println();
      }
    }
  }
}