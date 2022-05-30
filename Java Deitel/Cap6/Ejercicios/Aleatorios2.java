import java.security.SecureRandom;

public class Aleatorios2
{
  public static void main(String[] args)
  {
    SecureRandom numerosAleatorios = new SecureRandom();

    System.out.println("Conjunto 1: 2, 4, 6, 8, 10");
    int n = 2 * (numerosAleatorios.nextInt(5) + 1);
    System.out.println("n1 = " + n);

    System.out.println("Conjunto 2: 3, 5, 7, 9, 11");
    n = 2 * (numerosAleatorios.nextInt(5) + 1) + 1;
    System.out.println("n2 = " + n);

    System.out.println("Conjunto 3: 6, 10, 14, 18, 22");
    n =  2 * (2 * (numerosAleatorios.nextInt(5) + 1) + 1);
    System.out.println("n3 = " + n);
  }
}