import java.util.Scanner;

public class Binario
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el número en binario o -1 para terminar: ");
    int numero = entrada.nextInt();

    while (numero != -1)
    {
      int a = numero / 1000000000 % 10;

      if (a >= 0)
      if (a <= 1)
        a = a;

      int b = numero / 100000000 % 10;

      if (b >= 0)
      if (b <= 1)
        b = b;

      int c = numero / 10000000 % 10;

      if (c >= 0)
      if (c <= 1)
        c = c;

      int d = numero / 1000000 % 10;

      if (d >= 0)
      if (d <= 1)
        d = d;

      int e = numero / 100000 % 10;

      if (e >= 0)
      if (e <= 1)
        e = e;

      int f = numero / 10000 % 10;

      if (f >= 0)
      if (f <= 1)
        f = f;

      int g = numero / 1000 % 10;

      if (g >= 0)
      if (g <= 1)
        g = g;

      int h = numero / 100 % 10;

      if (h >= 0)
      if (h <= 1)
        h = h;

      int i = numero / 10 % 10;

      if (i >= 0)
      if (i <= 1)
        i = i;

      int j = numero % 10;

      if (j >= 0)
      if (j <= 1)
        j = j;

      int decimal = j * 1 + i * 2 + h * 4 + g * 8 + f * 16; 
      int decimal2 = e * 32 + d * 64 + c * 128 + b * 256 + a * 512 + decimal;

      if (a >= 0)
      if (a <= 1)
      if (b >= 0)
      if (b <= 1)
      if (c >= 0)
      if (c <= 1)
      if (d >= 0)
      if (d <= 1)
      if (e >= 0)
      if (e <= 1)
      if (f >= 0)
      if (f <= 1)
      if (g >= 0)
      if (g <= 1)
      if (h >= 0)
      if (h <= 1)
      if (i >= 0)
      if (i <= 1)
      if (j >= 0)
      if (j <= 1)
      System.out.printf("El equivalente decimal de %d es: %d%n", numero, decimal);
      else{
        System.out.println("No es un número en binario");}

      System.out.print("Escriba el número en binario o -1 para terminar: ");
      numero = entrada.nextInt();
    }    
  }
}