import java.util.Scanner;

public class Mayor
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int mayor = -2147483648;
    int contador = 1;

    while (contador <= 10)
    {
      System.out.print("Escriba el entero: ");
      int numero = entrada.nextInt();

      if (numero > mayor)
         mayor = numero;

      contador++; 
    }

    System.out.printf("El número mayor es: %d%n", mayor);
  }
}