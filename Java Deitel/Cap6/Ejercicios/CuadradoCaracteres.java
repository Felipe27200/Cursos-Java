import java.util.Scanner;

public class CuadradoCaracteres
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un número o (Ctrl + z) para terminar: ");
  
    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();

      System.out.print("Escriba un carácter: ");
      char relleno = entrada.next().charAt(0);

      cuadradoDeCaracteres(numero, relleno);

      System.out.print("Escriba un número o (Ctrl + z) para terminar: ");
    }
  }

  public static void cuadradoDeCaracteres(int lado, char caracterRelleno)
  {
    for (int contador = 1; contador <= lado; contador++)
    {
      for (int i = 1; i <= lado; i++)
      {
        System.out.print(caracterRelleno);
      }

      System.out.println();
    }
  }
}