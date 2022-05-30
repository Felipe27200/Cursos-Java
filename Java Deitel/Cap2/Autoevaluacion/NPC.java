import java.util.Scanner;

public class NPC
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int a, b, c, d, e, positivo = 0, negativo = 0, cero = 0;

    System.out.print("Escriba el primer número: ");
    a = entrada.nextInt();

    System.out.print("Escriba el segundo número: ");
    b = entrada.nextInt();

    System.out.print("Escriba el tercer número: ");
    c = entrada.nextInt();

    System.out.print("Escriba el cuarto número: ");
    d = entrada.nextInt();

    System.out.print("Escriba el quinto número: ");
    e = entrada.nextInt();

    if (a > 0)
     positivo += 1;

    if (b > 0)
     positivo += 1;

    if (c > 0)
     positivo += 1;

    if (d > 0)
     positivo += 1;

    if (e > 0)
     positivo += 1;

    if (a < 0)
       negativo += 1;

    if (b < 0)
     negativo += 1;

    if (c < 0)
     negativo += 1;

    if (d < 0)
     negativo += 1;

    if (e < 0)
     negativo += 1;

    if (a == 0)
       cero += 1;

    if (b == 0)
     cero += 1;

    if (c == 0)
     cero += 1;

    if (d == 0)
     cero += 1;

    if (e == 0)
     cero += 1;

    System.out.printf("Cantidad de positivos: %d%n", positivo);
    System.out.printf("Cantidad de negativos: %d%n", negativo);
    System.out.printf("Cantidad de ceros: %d%n", cero);
  }
}