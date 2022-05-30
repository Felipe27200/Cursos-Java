public class PruebaSinContinue
{
  public static void main(String[] args)
  {
    for (int cuenta = 1; cuenta <= 10; cuenta ++)
    {
      if (cuenta != 5)
        System.out.printf("%d ", cuenta);
    }

    System.out.printf("%nSe omitio las instrucciones cuando era cuenta = 5");
  }
}