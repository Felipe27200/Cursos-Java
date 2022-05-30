import java.util.Random;

public class TirarDados
{
  private final static Random aleatorio = new Random();

  public static void main(String[] args)
  {
    int[] suma = new int[13];

    for (int contador = 1; contador <= 36000000; contador++)
      suma[tirarDados()]++;

    System.out.println();

    System.out.println("SUMA	FRECUENCIA");

    for (int contador = 2; contador < suma.length; contador++)
      System.out.printf("%2d:	%,d%n", contador,suma[contador]);
  }

  public static int tirarDados()
  {
    int dado1 = 1 + aleatorio.nextInt(6);
    int dado2 = 1 + aleatorio.nextInt(6);

    return dado1 + dado2;
  }
}