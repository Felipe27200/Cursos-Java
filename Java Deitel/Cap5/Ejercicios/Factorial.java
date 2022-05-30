public class Factorial
{
  public static void main(String[] args)
  {
    System.out.println("Factoriales:");

    for (long numero = 1; numero <= 20; numero++)
    {
      long numero2;
      long factorial = 1;

      for (numero2 = numero; numero2 >= 1; numero2--)
      {
        factorial *= numero2;
      }

      System.out.printf("%d	", factorial);
    }
  }
}