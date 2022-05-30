public class CicloInfinito
{
  public static void main(String[] args)
  {
    int contador = 1;
    int potencia = 1;

    while (contador >= 0)
    {
      potencia *= 2;
      System.out.printf("%d%n", potencia);
      contador++;
    }
  }
}