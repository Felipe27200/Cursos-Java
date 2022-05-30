import java.util.Scanner;

public class Multiplo
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int a, b, multiplo;

    System.out.print("Escriba el primer número: ");
    a = entrada.nextInt();

    System.out.print("Escriba el segundo número: ");
    b = entrada.nextInt();

    multiplo = b % a;

    if (multiplo == 0)
       System.out.printf("El primer número es múltiplo del segundo");

    if (multiplo != 0)
       System.out.println("No son múltiplos");
  }
}