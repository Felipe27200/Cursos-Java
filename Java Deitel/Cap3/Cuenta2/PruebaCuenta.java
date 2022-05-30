public class PruebaCuenta
{
  public static void main(String[] args)
  {
    Cuenta Cuenta1 = new Cuenta("Ana Lisa Melano");
    Cuenta Cuenta2 = new Cuenta("Elkin Topiso");

    System.out.printf("El nombre de cuenta 1 es: %s%n", Cuenta1.obtenerNombre());
    System.out.printf("El nombre de cuenta 2 es: %s%n", Cuenta2.obtenerNombre());
  }
}