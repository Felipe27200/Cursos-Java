import java.util.Scanner;

public class Analisis
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int aprobados = 0;
    int reprobados = 0;
    int contador = 1;

    while (contador <= 10)
    {
      System.out.print("Escriba el resultado(aprobados = 1, reprobados = 2): ");
      int resultado = entrada.nextInt();

      if (resultado != 1)
      if (resultado != 2)
         System.out.println("Escriba un valor valido (aprobados = 1, reprobados = 2)");

      if (resultado == 1)
       aprobados++;
      else if (resultado == 2)
       reprobados++;

      if (resultado >= 1)
      if (resultado <= 2)
         ++contador;
    }

    System.out.printf("%naprobados %d%nreprobados %d%n%n",
      aprobados, reprobados);

    if (aprobados > 8)
       System.out.println("Bono para el instructor");
  }
}