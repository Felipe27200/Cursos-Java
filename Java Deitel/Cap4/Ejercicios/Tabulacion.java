public class Tabulacion
{
  public static void main(String[] args)
  {
    int n = 1;

    System.out.println("N	10*N	100*N	1000*N\n");

    while (n <= 5)
    {
      System.out.printf("%d	%d	%d	%d%n", n, n*10,
        n*100, n*1000);

      n++;
    }
  }
}