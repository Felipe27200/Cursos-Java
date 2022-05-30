public class NumeroPerfecto
{
  public static void main(String[] args)
  {
    for (int numero = 1; numero <= 33550336; numero++)
    { 
      esPerfecto(numero);
    }
  }

  public static void esPerfecto(int numero)
  {
    int suma = 0;
    String divisores = "";

    for (int divisor = 1; divisor <= numero - 1; divisor++)
    {
      if (numero % divisor == 0)
      {
        suma += divisor;

        divisores += Integer.toString(divisor) + " ";
      }
    }

    if (suma == numero)
    {
      System.out.printf("El número %d es perfecto: %b%n", numero, true);
      System.out.println(divisores + "= " + numero + "\n");
    }
  }
}