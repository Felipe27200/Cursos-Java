public class PruebaEmpleado
{
  public static void main(String[] args)
  {
    Empleado empleado1 = new Empleado("Felipe", "Zea", 828116.2);
    Empleado empleado2 = new Empleado("Daniel", "Zea", 3000000.04);

    enseñar(empleado1);
    System.out.println();
    enseñar(empleado2);
  }

  public static void enseñar(Empleado mostrar)
  {
    
    System.out.printf("El salario mensual de %s %s es: $%.2f%n", mostrar.obtenerNombre(),
      mostrar.obtenerApellido(),  mostrar.obtenerSalario());
    System.out.printf("El salario anual de %s %s es: $%.2f%n", mostrar.obtenerNombre(),
     mostrar.obtenerApellido(), mostrar.sAnual());
    System.out.printf("El salario anual más 10 por ciento de %s %s es: $%.2f%n",
      mostrar.obtenerNombre(), mostrar.obtenerApellido(), mostrar.aumento());
  }
}