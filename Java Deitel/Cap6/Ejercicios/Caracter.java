public class Caracter
{
  public static void main(String[] args)
  {
    String cadena = "La vida es bella.";
    String caracter = "";

    caracter += cadena.charAt(11);

    System.out.printf("Cadena: %s%nCaracter: %s%n", cadena, caracter);
  }
}