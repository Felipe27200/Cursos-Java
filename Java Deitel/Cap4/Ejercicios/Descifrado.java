import java.util.Scanner;

public class Descifrado
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el numero a descifrar: ");
    int numero = entrada.nextInt();

   if (numero >= -99999)
   {
     if (numero >= -99999)
     {
       int a = numero / 1000 % 10;
       int b = numero / 100 % 10;
       int c = numero / 10 % 10;
       int d = numero % 10;

       int descifrado1 = a + 10 - 7;

         if (descifrado1 >= 10)
         {
           descifrado1 -= 10;
         }

       int descifrado2 = b + 10 - 7;

         if (descifrado2 >= 10)
         {
           descifrado2 -= 10;
         }

       int descifrado3 = c + 10 - 7;

         if (descifrado3 >= 10)
         {
           descifrado3 -= 10;
         }

       int descifrado4 = d + 10 - 7;

         if (descifrado4 >= 10)
         {
           descifrado4 -= 10;
         }

       System.out.printf("El número descifrado es: %d%d%d%d%n", descifrado3, descifrado4,
         descifrado1, descifrado2);
     }
     else 
       System.out.println("Número invalido");
   }
  }
}