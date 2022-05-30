import java.util.Scanner;

public class SeparacionDigitos
{
  private enum Estado {VALIDO, CERO}; 

  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un entero o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();

      mostrarDigitos(numero);

      System.out.println();

      System.out.print("Escriba un entero o el IFA para terminar: ");
    } 
  }

  public static void mostrarDigitos(int numero)
  {
    if (numero >= 1 && numero <= 99999)
    {
      int b = 10000;

      Estado cero = Estado.CERO;

      for (int contador = 1; contador <= 5; contador++)
      {
        int separacion = cociente(numero, b);
        b /= 10;

        if (residuo(separacion) != 0 || cero == Estado.VALIDO)
        {          
          System.out.printf("%d  ", residuo(separacion));
          cero = Estado.VALIDO;  
        }
      }
    }
    else
      System.out.println("**Entero fuera del rango**");
  }

  public static int cociente(int a, int b)
  {
    return a / b;
  }

  public static int residuo(int a)
  {
    return a % 10;
  }
}