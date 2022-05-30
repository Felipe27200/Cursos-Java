import java.util.Scanner;

public class Exponenciacion
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el entero o el IFA para terminar: ");
    
    while (entrada.hasNext())
    {
      int base = entrada.nextInt();

      System.out.print("Introdusca el exponente: ");
      int exponente = entrada.nextInt();

      if (exponente != 0)
      {
        System.out.printf("Exponenciación: %d%n%n", enteroPotencia(base, exponente));
      }
      else
        System.out.println("Exponenciación: 1\n");

        System.out.print("Escriba el entero o el IFA para terminar: ");
    }
  }

  public static int enteroPotencia(int base, int exponente)
  {
    int resultado = 1;

    for (int contador = 1; contador <= exponente; contador++)
    {
      resultado *= base;
    }

    return resultado;
  }
}