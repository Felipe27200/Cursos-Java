public class Primos
{
  private static int nuevaLinea;

  public static void main(String[] args)
  {
    for (int numero = 1; numero <= 10000; numero++)
    {
      primo(numero);
    }
  }

  public static void primo(int numero)
  {
    int divisores = 0;

    for (int divisor = 1; divisor <= numero; divisor++)
    {
      if (numero % divisor == 0)
        divisores++;

      if (divisores > 2)
        return;
    }

    if (divisores == 2)
    {
      System.out.printf("%5d", numero);
      nuevaLinea++;
     
      if (nuevaLinea % 5 == 0)
        System.out.println();
    }
  }
}