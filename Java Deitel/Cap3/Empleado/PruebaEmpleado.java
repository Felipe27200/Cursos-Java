public class PruebaEmpleado
{
  public static void main(String[] args)
  {
    Empleado empleado1 = new Empleado("Felipe", "Zea", 828116.2);
    Empleado empleado2 = new Empleado("Daniel", "Zea", 3000000.04);

    ense�ar(empleado1);
    System.out.println();
    ense�ar(empleado2);
  }

  public static void ense�ar(Empleado mostrar)
  {
    
    System.out.printf("El salario mensual de %s %s es: $%.2f%n", mostrar.obtenerNombre(),
      mostrar.obtenerApellido(),  mostrar.obtenerSalario());
    System.out.printf("El salario anual de %s %s es: $%.2f%n", mostrar.obtenerNombre(),
     mostrar.obtenerApellido(), mostrar.sAnual());
    System.out.printf("El salario anual m�s 10 por ciento de %s %s es: $%.2f%n",
      mostrar.obtenerNombre(), mostrar.obtenerApellido(), mostrar.aumento());
  }
}