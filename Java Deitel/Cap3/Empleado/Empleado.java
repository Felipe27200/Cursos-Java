public class Empleado
{
  private String nombre;
  private String apellido;
  private double salario_mensual;

  public Empleado(String nombre, String apellido, double salario_mensual)
  {
    this.nombre = nombre;
  
    this.apellido = apellido;

    if (salario_mensual > 0.0)
      this.salario_mensual = salario_mensual; 
  }

  public double sAnual()
  {
    return salario_mensual = salario_mensual * 12;
  }

  public double aumento()
  {
    return salario_mensual = (salario_mensual * 0.1) + salario_mensual;
  }

  public void establecerSalario(double salario_mensual)
  {
    if (salario_mensual > 0.0)
      salario_mensual = salario_mensual;
  }

  public double obtenerSalario()
  {
    return salario_mensual;
  }

  public void establecerNombre(String nombre)
  {
    this.nombre = nombre;
  }

  public String obtenerNombre()
  {
    return nombre; 
  }

  public void establecerApellido(String apellido)
  {
    this.apellido = apellido;
  }

  public String obtenerApellido()
  {
    return apellido;
  }
}