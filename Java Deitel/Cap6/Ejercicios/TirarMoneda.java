import java.security.SecureRandom;
import java.util.Scanner;

public class TirarMoneda
{
  private enum Moneda {CARA, CRUZ, NADA};

  private static int cara;
  private static int cruz;
  private static SecureRandom lanzar = new SecureRandom();

  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
   
    System.out.print("1 = Lanzar moneda\n2 = finalizar  ");

    int decision = entrada.nextInt();

    while (decision != 2)
    {
      System.out.printf("%nResultado: %s%n%n", tirar().name());

      System.out.print("1 = Lanzar moneda\n2 = finalizar  ");

      decision = entrada.nextInt();
    }

    System.out.printf("CARA: %d%nCRUZ: %d%n", cara, cruz);
  }

  public static Moneda tirar()
  {
    int tiro = lanzar.nextInt(2);
    Moneda resultado = Moneda.NADA;

    switch (tiro)
    {
      case 0:
        resultado = Moneda.CARA;
        cara++;
        break;

      case 1:
        resultado = Moneda.CRUZ;
        cruz++;
        break;
    }

    return resultado; 
  }
}