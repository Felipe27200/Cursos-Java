public class InteresEntero
{
  public static void main(String[] args)
  {
    int monto;
    int principal = 100000;
    double tasa = 5;

    System.out.printf("%s%20s%n", "Anio", "Monto en deposito");

    for (int anio = 1; anio <= 10; ++anio)
    {
      monto = (int) (principal * Math.pow(1.0 + (tasa / 100), anio));
      System.out.printf("%4d%17d.%d%n", anio, monto /100, monto % 100);
    }
  }
}