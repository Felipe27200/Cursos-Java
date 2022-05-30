public class PruebaBreak
{
  public static void main(String[] args)
  {
    int cuenta;

    for (cuenta = 1; cuenta <= 10; ++cuenta)
    {
      System.out.printf("%d ", cuenta);

      if (cuenta == 4)
       cuenta += 6;
    }

    cuenta -= 6;

    System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta);
  }
}