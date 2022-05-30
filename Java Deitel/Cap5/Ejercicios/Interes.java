public class Interes
{
  public static void main(String[] args)
  {
    double monto;
    double principal = 1000.0;
    double tasa = 0.05;

    System.out.printf("%s%20s%7s%n", "Year", "Monto en Deposito", "Tasa");

    for (int anio = 1; anio <= 10; ++anio)
    {
      monto = principal * Math.pow(1.0 + tasa, anio);

      System.out.printf("%4d%,20.2f%7.2f%n", anio, monto, tasa);

      if (anio >= 10 && tasa <= 0.09)
      {
        anio = 0;
        tasa += 0.01;
        System.out.printf("%n%s%20s%7s%n", "Year", "Monto en Deposito", "Tasa");
      }
    }
  }
}