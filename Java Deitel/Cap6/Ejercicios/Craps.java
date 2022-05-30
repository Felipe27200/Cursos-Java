import java.security.SecureRandom;
import java.util.Scanner;

public class Craps
{
  private static final SecureRandom numerosAleatorios = new SecureRandom();

  private enum Estado {CONTINUA, GANO, PERDIO};

  private static int saldoBanco = 1000;

  private static final int DOS_UNOS = 2;
  private static final int TRES = 3;
  private static final int SIETE = 7;
  private static final int ONCE = 11;
  private static final int DOCE = 12;

  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Introduzca la apuesta o (Ctrl + para terminar): ");

    while (saldoBanco > 0 && entrada.hasNext())
    {
      int apuesta = entrada.nextInt();

      if (apuesta > 0 && apuesta <= saldoBanco)
      {
        int miPunto = 0;
        Estado estadoJuego;

        int sumaDeDados = tirarDados();

        switch (sumaDeDados)
        {
          case SIETE:
          case ONCE:
            saldoBanco += apuesta;
            estadoJuego = Estado.GANO;
            break;

          case DOS_UNOS:
          case TRES:
          case DOCE:
            saldoBanco -= apuesta;
            estadoJuego = Estado.PERDIO;
            break;

          default:
            estadoJuego = Estado.CONTINUA;
            miPunto = sumaDeDados;
            System.out.printf("El punto es %d%n", miPunto);
            break;
        }

        charla();

        while (estadoJuego == Estado.CONTINUA && saldoBanco > 0)
        {
          sumaDeDados = tirarDados();

          if (sumaDeDados == miPunto)
          {
             estadoJuego = Estado.GANO;
             saldoBanco += apuesta;
          }
          else
            if (sumaDeDados == SIETE)
          {
            estadoJuego = Estado.PERDIO;
            saldoBanco -= apuesta;
          }
        }

        if (estadoJuego == Estado.GANO)
        {
          System.out.println("El jugador gana");
          System.out.printf("Su saldo es : %d%n", saldoBanco);
        }
        else
        {
          System.out.println("El jugador pierde");
          System.out.printf("Su saldo es : %d%n", saldoBanco);
        }
      }
      else System.out.println("Valor invalido");

      charla();

      if (saldoBanco > 0)
        System.out.print("Introduzca la apuesta o (Ctrl + para terminar): ");
      else 
        System.out.println("Lo siento. ¡Se quedó sin fondos!");
    }
  }

  public static int tirarDados()
  {
    int dado1 = 1 + numerosAleatorios.nextInt(6);
    int dado2 = 1 + numerosAleatorios.nextInt(6);

    int suma = dado1 + dado2;

    System.out.printf("El jugador tiro %d + %d = %d%n",
       dado1, dado2, suma);

    return suma;
  }

  public static void charla()
  {
    int charla = numerosAleatorios.nextInt(11);

    switch (charla)
    {
      case 0:
        System.out.println("¡Ganaré, ganaré y gallina cenaré!");
        System.out.println("O ESPERA ESTO NO ES BLACJACK!!!");
        break;

      case 1:
        System.out.println("	¡Hagan sus apuesta!");
        break;
 
      case 2: 
        System.out.println("	$La suerte está echada$");
        break;

      case 3:
        System.out.println(" 	$$$*_* Apuesta Segura. *_*$$$");
        break;

      case 4:
        System.out.println("	Juegas el todo por el todo 7(^w^)7");
        break;

      case 5:
        System.out.println("	*Correr el dado*");
        break;

      case 6:
        System.out.println("	Run, Run for the MONEY");
        break;

      case 7:
        System.out.println("	*En la mesa y en el juego se conoce el caballero*");
        break;

      case 8:
        System.out.println("	*El que no arriesga no gana*");
        break;

      case 9:
        System.out.println("	*NO JUEGUES LO QUE NO TIENES*");
        break;

      case 10:
        System.out.println("	*Más fácil es hallar la fortuna que detenerla*");

    }
  }
}