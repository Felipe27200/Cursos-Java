import java.util.Scanner;

public class DosGrandes
{
  public static void main(String[] args)
  {  
    Scanner entrada = new Scanner(System.in);

    int mayor = -2147483648;
    int mayor2 = -2147483648;
    int contador = 1;

    while (contador <= 5)
    {
      System.out.print("Escriba el entero: ");
      int numero = entrada.nextInt();

      if(numero > mayor)
        mayor = numero;

      System.out.print("Escriba el entero: ");

      int numero2 = entrada.nextInt();

      if (numero2 > mayor2)
      if (numero2 > mayor)
         mayor2 = numero2; 

      contador++;        
    }

    System.out.printf("Los números más grandes son: %d y %d%n", mayor, mayor2);
  }
}