import java.util.Scanner;

public class ParOImpar
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int a;

    System.out.print("Escriba el n�mero: ");
    a = entrada.nextInt();

    int par = a % 2;

    if (par == 0)
       System.out.printf("El n�mero es par");

    if (par != 0)
       System.out.printf("El n�mero es impar");
  }
}