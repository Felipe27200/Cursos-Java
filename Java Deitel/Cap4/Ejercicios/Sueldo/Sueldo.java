import java.util.Scanner;

public class Sueldo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int contador = 1;

    while (contador <= 3)
    {
      System.out.print("Escriba el primer nombre del empleado: ");
      String nombre = entrada.next();

      System.out.print("Escriba el número de horas que trabajo la semana pasada: ");
      int horas = entrada.nextInt();

      System.out.print("Escriba la tarifa por hora del empleado: ");
      double tarifa = entrada.nextDouble();

      if (horas <= 40)
      {
        double sueldoBruto = horas * tarifa;
        System.out.printf("El sueldo bruto del empleado es: %.2f$%n%n", 
        sueldoBruto);
      }
      else if (horas > 40)
      {
        double exceso = (horas - 40) * tarifa;
        double aumento = (exceso * 0.5) + exceso;
        double sueldoBruto = aumento + (tarifa * 40); 
      
        System.out.printf("El sueldo bruto del empleado es: %.2f$%n%n", sueldoBruto);
      } 

      contador++;
    }
  }
}