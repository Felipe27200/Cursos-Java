import java.security.SecureRandom;

public class Craps
{
  private static final SecureRandom numerosAleatorios = new SecureRandom();

  private enum Estado {CONTINUA, GANO, PERDIO};

  private static final int DOS_UNOS = 2;
  private static final int TRES = 3;
  private static final int SIETE = 7;
  private static final int ONCE = 11;
  private static final int DOCE = 12;

  public static void main(String[] args)
  {
    int[] victoria = new int[22];
    int[] derrota = new int[22];

    for (int contador = 1; contador <= 1000000; contador++)
    {
      int tiro = 0;
      int miPunto = 0;
      Estado estadoJuego;

      int sumaDeDados = tirarDados();
 
      switch (sumaDeDados)
      {
        case SIETE:
        case ONCE:
          estadoJuego = Estado.GANO;
          victoria[1]++;
          break;

        case DOS_UNOS:
        case TRES:
        case DOCE:
          derrota[1]++;
          estadoJuego = Estado.PERDIO;
          break;

        default:
          estadoJuego = Estado.CONTINUA;
          miPunto = sumaDeDados;
          tiro++;
          break;
      }

      while (estadoJuego == Estado.CONTINUA)
      {
        sumaDeDados = tirarDados();
        tiro++;

        if (sumaDeDados == miPunto)
        {
           estadoJuego = Estado.GANO;

           if (tiro > 20)
              victoria[21]++;
           else
             victoria[tiro]++;
        }
        else if (sumaDeDados == SIETE)
        {
           estadoJuego = Estado.PERDIO;

           if (tiro > 20)
              derrota[21]++;
           else
              derrota[tiro]++;
        }
      }
    }

    System.out.println("Victorias por tiro:");

    for (int i = 1; i < victoria.length - 11; i++)
    {
      if (i == 1)
        System.out.printf("%02d: %,d	%02d: %,d 	%02d+: %,d%n", 
           i, victoria[i], i + 10, victoria[i + 10], i + 20, victoria[i + 20]);
      else
        System.out.printf("%02d: %,d	%02d: %,d%n", i, victoria[i],
           i + 10, victoria[i + 10]);        
    }

    int total = 0;

    for (int elemento : victoria)
      total += elemento;

    System.out.printf("%nTotal Victorias: %,d%n%n", total);
    System.out.println("Derrotas por tiro:");

    for (int i = 1; i < derrota.length - 11; i++)
    {
      if (i == 1)
        System.out.printf("%02d: %,d	%02d: %,d 	%02d+: %,d%n", 
           i, derrota[i], i + 10, derrota[i + 10], i + 20, derrota[i + 20]);
      else
        System.out.printf("%02d: %,d	%02d: %,d%n", i, derrota[i],
           i + 10, derrota[i + 10]);       
    }

    total = 0;

    for (int elemento : derrota)
      total += elemento;

    System.out.printf("%nTotal derrotas: %,d%n%n", total);

    System.out.println("Las posibilidades de ganar en esta aplicación son " +
      "del: 49%" +"\nLas de perder son: 51%\n");

    System.out.println("Entre más avanza el juego la derrota sobrepuja a la " +
      "victoria");
  }

  public static int tirarDados()
  {
    int dado1 = 1 + numerosAleatorios.nextInt(6);
    int dado2 = 1 + numerosAleatorios.nextInt(6);

    int suma = dado1 + dado2;

    return suma;
  }
}