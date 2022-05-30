import java.util.Scanner;

public class Aritmetica
{
  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);

    int numero1, numero2, suma, producto, diferencia, cociente;

    System.out.print("Ingrese el primer número: ");
    numero1 = entrada.nextInt();

    System.out.print("Ingrese el segundo número: ");
    numero2 = entrada.nextInt();

    suma = numero1 + numero2;    

    producto = numero1 * numero2;

    diferencia = numero1 - numero2;

    cociente = numero1 / numero2;

    System.out.printf("La suma es: %d%n", suma);
    System.out.printf("El producto es: %d%n", producto);
    System.out.printf("La diferencia es: %d%n", diferencia);
    System.out.printf("El cociente es: %d%n", cociente);
  }
}