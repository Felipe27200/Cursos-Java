public class Triangulo
{
  public static void main(String[] args)
  {
    for (int contador = 1; contador <= 10; ++contador)
    {
      for (int asterisco = 1; asterisco <= contador; asterisco++)
       System.out.print("*"); 
 
      System.out.println();
      System.out.println();
    }

    for (int contador = 10; contador >= 1; --contador)
    {
      for (int asterisco = 1; asterisco <= contador; asterisco++)
        System.out.print("*");

      System.out.println();
      System.out.println();
    }

    for (int contador = 10; contador >= 1; contador--)
    {
      for (int espacio = 10; espacio >= contador + 1; espacio--)
        System.out.print(" ");

      for (int asterisco = 1; asterisco <= contador; asterisco++)
        System.out.print("*");
     
      System.out.println();
      System.out.println();
    }

    for (int contador = 10; contador >= 1; --contador)
    {
      for (int espacio = 1; espacio <= contador - 1; espacio++)
        System.out.print(" ");

      for (int asterisco = 10; asterisco >= contador; asterisco--)
        System.out.print("*");

      System.out.println();
      System.out.println();
    }
  }
}