public class SumaArgumentos
{
  public static void main(String[] args)
  {
    double total = 0.0;

    for (String elemento : args)
      total += Double.parseDouble(elemento);

    System.out.printf("La suma es: %.2f%n", total);
  }
}