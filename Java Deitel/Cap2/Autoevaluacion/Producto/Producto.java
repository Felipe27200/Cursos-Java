import java.util.Scanner;

public class Producto
{
  public static void main(String args [])
  {
    Scanner entrada = new Scanner(System.in);

    int x, y, z, resultado;
 
    System.out.print("Escriba el primer número: ");
    x = entrada.nextInt();

    System.out.print("Escriba el segundo número: ");
    y = entrada.nextInt();

    System.out.print("Escriba el tercer número: ");
    z = entrada.nextInt();

    resultado = x * y * z;

    System.out.printf("El resultado es: %d", resultado);
  }
}