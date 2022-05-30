public class CalculoPI
{
  public static void main(String[] args)
  {

    double irracional = 0;
    double denominador = 1;

    for (int terminos = 1; terminos <= 200000; ++terminos)
    {
      int resta = terminos % 2;
 
      if (resta == 0)
      irracional -= 4 / denominador;
      else 
        irracional += 4 / denominador;

      denominador += 2;
    }

    System.out.println("\n**************");
    System.out.printf("%5s%5.5f%s%n", "*Pi = ", irracional, "*");
    System.out.println("**************");
  }
}