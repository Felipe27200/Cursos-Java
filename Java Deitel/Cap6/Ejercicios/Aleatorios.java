import java.security.SecureRandom;

public class Aleatorios
{
  public static void main(String[] args)
  {
    SecureRandom numerosAleatorios = new SecureRandom();

    System.out.printf("1<=n<=2: %d%n", 1 + numerosAleatorios.nextInt(2));
    System.out.printf("1<=n<=100: %d%n", 1 + numerosAleatorios.nextInt(100));
    System.out.printf("0<=n<=9: %d%n", numerosAleatorios.nextInt(10));
    System.out.printf("1000<=n<=1112: %d%n", 1000 + numerosAleatorios.nextInt(113));
    System.out.printf("-1<=n<=1: %d%n", numerosAleatorios.nextInt(3) - 1);
    System.out.printf("-3<=n<=11: %d%n", numerosAleatorios.nextInt(15) - 3);
  }
}