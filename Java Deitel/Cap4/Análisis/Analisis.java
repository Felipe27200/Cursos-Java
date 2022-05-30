import java.util.Scanner;

public class Analisis
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int aprobados = 0,
        reprobados = 0,
        contadorEstudiantes = 1;

    while (contadorEstudiantes <= 10)
    {
      System.out.print("Escriba el resultado (aprobados = 1, reprobados = 2): ");
      int resultado = entrada.nextInt();

      if(resultado == 1)
        aprobados = aprobados + 1;
      else
        reprobados = reprobados + 1;

      contadorEstudiantes = contadorEstudiantes + 1;
    }

    System.out.printf("%nAprobado: %d%nReprobados: %d%n", aprobados, reprobados);

    if (aprobados > 8)
       System.out.println("Bono para el instructor!");
  }
}