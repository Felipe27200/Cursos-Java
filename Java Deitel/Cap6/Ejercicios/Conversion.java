import java.util.Scanner;

public class Conversion
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Escriba \"c\" si va a hacer la conversión a °C");
    System.out.print("O \"f\" si es a °F o el IFA para terminar: ");

    while (entrada.hasNext())
    {
      char sistema = entrada.next().charAt(0);

      if (sistema == 'c' || sistema == 'f')
      {
        System.out.print("Escriba la temperatura: ");
        double temperatura = entrada.nextDouble();

        conversor(sistema, temperatura);
      }
      else 
        System.out.println("**NO ELIGIÓ NINGUNA OPCIÓN**");

      System.out.println("Escriba \"c\" si va a hacer la conversión a °C");
      System.out.print("O \"f\" si es a °F o el IFA para terminar: ");
    }
  }

  public static void conversor(char conversion,double temperatura)
  {
    switch (conversion)
    {
      case 'c':
        System.out.printf("%nLa temperatura en grados °C es: %.2f%n%n", 
          centigrados(temperatura));
        break;

      case 'f':
        System.out.printf("%nLa temperatura en grados °F es: %.2f%n%n", 
          fahrenheit(temperatura));
    }
  }

  public static double centigrados(double fahrenheit)
  {
    double centigrados = 5.0 / 9.0 * (fahrenheit - 32);

    return centigrados;
  }

  public static double fahrenheit(double centigrados)
  {
    double fahrenheit = 9.0 / 5.0 * centigrados + 32;

    return fahrenheit;
  }
}