import java.util.Scanner;

public class BMI
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double peso, altura;

    System.out.print("Introduzca el peso en Kg: ");
    peso = entrada.nextDouble();

    System.out.print("Introduzca la altura en metros: ");
    altura = entrada.nextDouble();

    double bmi = peso / (altura * altura);

    System.out.printf("Su IMC es: %.2f%n%n", bmi);

    System.out.printf("%s%n%s%n%s%n%s%n", "VALORES DE IMC",
      "Bajo peso: menos de 18.5", "Sobrepeso: entre 25 y 29.9",
      "Obeso: 30 o mas");   
  }
}