public class ContadorWhile
{
  public static void main(String[] args)
  {
    int contador = 1;

    while (++contador <= 10)
    {
      System.out.printf("%d ", contador);
    }

    System.out.println();  
  }
}