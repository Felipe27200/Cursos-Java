import java.util.Scanner;

public class Suma
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int numero1, numero2, suma;

    System.out.print("Introduzca el primero n�mero: ");
    numero1 = entrada.nextInt();

    System.out.print("Introduzca el segundo n�mero: ");
    numero2 = entrada.nextInt();

    suma = numero1 + numero2;

    System.out.printf("La suma es: %d%n", suma);
  }
}