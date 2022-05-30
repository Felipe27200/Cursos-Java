public class Rombo
{
  public static void main(String[] args)
  {
    for (int contador = 1; contador <= 9; contador += 2)
    {
      for (int espacio = 12; espacio >= contador + 2; espacio -= 2)
        System.out.print(" ");

      for (int asterisco = 1; asterisco <= contador; asterisco++)
        System.out.print("*");

      System.out.println();
    }

    for (int contador = 7; contador >= 1; contador -= 2)
    {
      for (int espacio = 10; espacio >= contador; espacio -= 2)
        System.out.print(" ");

      for (int asterisco = 1; asterisco <= contador; asterisco++)
        System.out.print("*");

      System.out.println();
    }
  }
}