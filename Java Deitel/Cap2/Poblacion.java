import java.util.Scanner;

public class Poblacion
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double pInicial, crecimiento;

    System.out.print("Introduzca la poblaci�n inicial: ");
    pInicial = entrada.nextDouble();
 
    System.out.print("Introduzca el crecimiento anual en porcentaje: ");
    crecimiento = entrada.nextDouble();

    double x = 1 + crecimiento;
    double p = pInicial * Math.pow(x, 1);

    System.out.printf("El crecimiento poblacional dentro de 1 a�o sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 2);

    System.out.printf("El crecimiento poblacional dentro de 2 a�os sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 3);

    System.out.printf("El crecimiento poblacional dentro de 3 a�os sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 4);

    System.out.printf("El crecimiento poblacional dentro de 4 a�os sera: %.2f%n", p);

    x = 1 + crecimiento;
    p = pInicial * Math.pow(x, 5);

    System.out.printf("El crecimiento poblacional dentro de 5 a�os sera: %.2f%n", p);

  }
}