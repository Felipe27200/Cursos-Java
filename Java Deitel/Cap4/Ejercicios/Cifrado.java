import java.util.Scanner;

public class Cifrado
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el entero a cifrar: ");
    int numero = entrada.nextInt();

    if (numero >= -9999)
    {
      if (numero <= 9999)
      {
        int a =  numero / 1000 % 10;
        int b =  numero / 100 % 10;
        int c =  numero / 10 % 10;
        int d =  numero % 10;

        int numero1 = (a + 7) % 10;
        int numero2 = (b + 7) % 10;
        int numero3 = (c + 7) % 10;
        int numero4 = (d + 7) % 10;

        System.out.printf("El número cifrado es: %d%d%d%d%n", numero3, numero4,
          numero1, numero2);
      }
      else
        System.out.println("Número invalido");
    } 
  }
}