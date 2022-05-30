public class Cuenta
{
  private String nombre;
  private double saldo;

  public Cuenta(String nombre, double saldo)
  {
    this.nombre = nombre;

    if (saldo > 0.0)
      this.saldo = saldo;
  }

  public void retirar(double retirar)
  {
    if (retirar <= saldo)
      saldo = saldo - retirar;

    if (retirar > saldo)
      System.out.print("El monto a retirar excede el saldo de la cuenta\n");
  }

  public double obtenerSaldo()
  {
    return saldo;
  }

  public void establecerNombre(String nombre)
  {
    this.nombre = nombre;
  }

  public String obtenerNombre()
  {
    return nombre;
  }  
}