import java.util.Scanner;

public class Comparacion2
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int numero1, numero2;

    System.out.print("Ingrese el primer n�mero: ");
    numero1 = entrada.nextInt();

    System.out.print("Ingrese el segundo n�mero: ");
    numero2 = entrada.nextInt();

    if (numero1 > numero2)
       System.out.printf("%d es m�s grande%n", numero1);

    if (numero1 < numero2)
       System.out.printf("%d es m�s grande%n", numero2);

    if (numero1 == numero2)
       System.out.printf("Estos n�meros son iguales");
  }
}