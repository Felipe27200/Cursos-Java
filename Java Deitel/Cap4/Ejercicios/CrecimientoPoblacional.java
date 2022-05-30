public class CrecimientoPoblacional
{
  public static void main(String[] args)
  {
    int inicio = 0;
    double p0 = 7690330871L;
    double pf;

    System.out.println("Año	Población Futura	Aumento");

    while (inicio <= 75)
    {
      pf = p0 * Math.pow(1 + 1.22, inicio);

      double aumento = pf - p0;

      System.out.printf("%d	%.2f		%.2f%n", inicio, pf, aumento);

      if (pf == p0 * 2)
        System.out.println("La población alcanzo el doble de su valor inicial");

      inicio++;
    }
  }
}