public class FrecuenciaCardiaca
{
  private String nombre;
  private String apellido;
  private int dia;
  private int mes;
  private int a�o;

  public FrecuenciaCardiaca(String nombre, String apellido, 
    int dia, int mes, int a�o)
  {
    this.nombre = nombre;
    
    this.apellido = apellido;

    if (dia > 0)
     if (dia < 32)
      this.dia = dia;

    if (mes == 1)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 2)
     if (dia < 28)
      if (dia > 0)
      this.mes = mes;

    if (mes == 3)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 4)
     if (dia < 31)
      if (dia > 0)
      this.mes = mes;

    if (mes == 5)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 6)
     if (dia < 31)
      if (dia > 0)
      this.mes = mes;

    if (mes == 7)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 8)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 9)
     if (dia < 31)
      if (dia > 0)
      this.mes = mes;

    if (mes == 10)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (mes == 11)
     if (dia < 31)
      if (dia > 0)
      this.mes = mes;

    if (mes == 12)
     if (dia < 32)
      if (dia > 0)
      this.mes = mes;

    if (a�o >= 1900)
     if (a�o <= 2019)
      this.a�o = a�o; 
  }

  public void mostrarFecha()
  {
    System.out.printf("Fecha de nacimiento: %d/%d/%d%n", dia, mes, a�o);
  }

  public int obtenerEdad()
  {
    return a�o = 2019 - a�o; 
  }

  public double fR()
  {
    int f = 220 - a�o;

    double fr = f * (0.50);

    double fr2 = f * (0.85);

    double fF = (fr + fr2) / 2;
    return fF;
  }

  public int frecuenciaCardiacaM()
  {
    int f = 220 - a�o;
    return f;
  }

  public void establecerA�o(int a�o)
  {
    this.a�o = a�o;
  }

  public int obtenerA�o()
  {
    return a�o;
  }

  public void establecerDia(int dia)
  {
    this.dia = dia;
  }

  public int obtenerDia()
  {
    return dia;
  }

  public void establecerMes(int mes)
  {
    this.mes = mes;
  }     

  public int obtenerMes()
  {
    return mes;
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