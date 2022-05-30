public class Damas
{
  public static void main(String[] args)
  {
    int contador = 1;

    while (contador <= 4)
    {
      int linea1 = 0;
      int linea2 = 0;
      int necesario = 7;

      while (linea1 <= necesario)
      {
        System.out.print("*");
        System.out.print(" ");
        linea1++;
      }

      System.out.println();

      while (linea2 <= necesario)
      {
        System.out.print(" ");
        System.out.print("*");

        linea2++;
      }

      System.out.println();

      contador++;
    }
  }
}