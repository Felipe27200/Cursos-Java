import java.util.Scanner;

public class InvertirDigitos
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el entero o el IFa para terminar: ");

    while (entrada.hasNext())
    {
      System.out.printf("El número invertido: %d%n", 
        invertir(entrada.nextInt()));

      System.out.print("Escriba el entero o el IFa para terminar: ");
    }
  }

  public static int invertir(int numero)
  {
    int divisor = 10;
    int invertido = 0;

    while (numero / divisor != 0)
      divisor *= 10;

    for (int contador = 1; contador <= divisor / 10; contador *= 10)
    {
      int digito = (numero / contador) % 10;

      invertido = invertido * 10 + digito;
    }

    return invertido;
  }
}