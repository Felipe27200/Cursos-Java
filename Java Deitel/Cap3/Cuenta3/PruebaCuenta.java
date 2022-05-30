import java.util.Scanner;

public class PruebaCuenta
{
  public static void main(String[] args)
  {
    Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
    Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

    mostrarCuenta(cuenta1);
    mostrarCuenta(cuenta2);

    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el monto a depositar para cuenta1: ");
    double montoDeposito = entrada.nextDouble();
    System.out.printf("%nSumando %.2f a el saldo de cuenta1%n%n", montoDeposito);
    cuenta1.depositar(montoDeposito);

    mostrarCuenta(cuenta1);
    mostrarCuenta(cuenta2);

    System.out.print("Escriba el monto a depositar para cuenta2: ");
    montoDeposito = entrada.nextDouble();
    System.out.printf("%nSumando %.2f a el saldo de cuenta2%n%n", montoDeposito);
    cuenta2.depositar(montoDeposito);

    mostrarCuenta(cuenta1);
    mostrarCuenta(cuenta2);
  }

  public static void mostrarCuenta(Cuenta cuentaAMostrar)
  {
    System.out.printf("Saldo de %s: $%.2f%n",
      cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
  }
}