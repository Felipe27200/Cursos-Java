import java.security.SecureRandom;

public class TirarDado
{
  public static void main(String[] args)
  {
    SecureRandom numerosAleatorios = new SecureRandom();

    int frecuencia1 = 0,
        frecuencia2 = 0,
        frecuencia3 = 0,
        frecuencia4 = 0,
        frecuencia5 = 0,
        frecuencia6 = 0;

    for (int tiro = 1; tiro <= 6000000; tiro++)
    {
      int cara = 1 + numerosAleatorios.nextInt(6);

      switch (cara)
      {
        case 1:
          ++frecuencia1;
          break;

        case 2:
          ++frecuencia2;
          break;
 
        case 3:
          ++frecuencia3;
          break;
 
        case 4:
          ++frecuencia4;
          break;

        case 5:
          ++frecuencia5;
          break;

        case 6:
          ++frecuencia6;
          break;
      }
    }

    System.out.println("Cara\tFrecuencia");
    System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
       frecuencia1, frecuencia2, frecuencia3, frecuencia4,
       frecuencia5, frecuencia6);
  }
}