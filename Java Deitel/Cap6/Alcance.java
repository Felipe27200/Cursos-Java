public class Alcance 
{
  private static int x = 1;

  public static void main(String[] args)
  {
    int x = 5;

    System.out.printf("La x local en main es %d%n", x);

    usarVariableLocal();
    usarCampo();
    usarVariableLocal();
    usarCampo();

    System.out.printf("%nLa x local en main es %d%n", x);
  }

  public static void usarVariableLocal()
  {
    int x = 25;

    System.out.printf(
      "%nLa x local al entrar al método usarVariable es %d%n", x++);
    System.out.printf(
      "La x local antes de salir del método usarVariableLocal es %d%n", x);
  }

  public static void usarCampo()
  {
    System.out.printf(
      "%nel campo x al entrar al método usarCampo es %d%n", x);
    x *= 10;
    System.out.printf(
      "el campo x antes de salir del método usarCampo es %d%n", x);
  }
}