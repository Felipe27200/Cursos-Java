import java.util.Scanner;

public class Volumen
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el radio: ");
    double radio = entrada.nextDouble();

    System.out.printf("El volumen de la esfera es: %f%n",
      volumenEsfera(radio));
  }

  public static double volumenEsfera(double radio)
  {
    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    return volumen;
  }
}