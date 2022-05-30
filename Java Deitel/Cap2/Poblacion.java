import java.util.Scanner;

public class Poblacion
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double pInicial, crecimiento;

    System.out.print("Introduzca la población inicial: ");
    pInicial = entrada.nextDouble();
 
    System.out.print("Introduzca el crecimiento anual en porcentaje: ");
    crecimiento = entrada.nextDouble();

    double x = 1 + crecimiento;
    double p = pInicial * Math.pow(x, 1);

    System.out.printf("El crecimiento poblacional dentro de 1 año sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 2);

    System.out.printf("El crecimiento poblacional dentro de 2 años sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 3);

    System.out.printf("El crecimiento poblacional dentro de 3 años sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 4);

    System.out.printf("El crecimiento poblacional dentro de 4 años sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 5);

    System.out.printf("El crecimiento poblacional dentro de 5 años sera: %.2f%n", p);

  }
}