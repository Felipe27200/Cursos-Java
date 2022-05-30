import java.util.Scanner;

public class Separacion
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el número:");
    int number = entrada.nextInt();

    int a = number / 10000 % 10;
    int b = number / 1000 % 10;
    int c = number / 100 % 10;
    int d = number / 10 % 10;
    int e = number % 10;     

    System.out.printf("%d %d %d %d %d%n", a, b, c, d, e);
  }
}