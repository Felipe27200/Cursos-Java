import java.util.Scanner;

public class Circulo
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el radio del círculo: ");
    int r = entrada.nextInt();

    System.out.printf("El diámetro es: %d%n", 2 * r);
    System.out.printf("La circunferencia es: %f%n", 2 * Math.PI * r);
    System.out.printf("El área es: %f%n", Math.PI * (r * r));
 
   }
}