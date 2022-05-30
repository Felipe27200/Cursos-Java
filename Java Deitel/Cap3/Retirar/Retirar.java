import java.util.Scanner;

public class Retirar
{
  public static void main(String[] args)
  {
    Cuenta cuenta = new Cuenta("Felipe Zea", 28000);

    System.out.printf("El saldo de %s es: $%.2f%n%n",
      cuenta.obtenerNombre(), cuenta.obtenerSaldo());

    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el monto a retirar: ");
    double retiro = entrada.nextDouble();
    cuenta.retirar(retiro);
    System.out.println();
 
    System.out.printf("El saldo restante de %s es: $%.2f%n",
      cuenta.obtenerNombre(), cuenta.obtenerSaldo());    
  }     
}