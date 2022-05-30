public class FrecuenciaCardiaca
{
  private String nombre;
  private String apellido;
  private int dia;
  private int mes;
  private int año;

  public FrecuenciaCardiaca(String nombre, String apellido, 
    int dia, int mes, int año)
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

    if (año >= 1900)
     if (año <= 2019)
      this.año = año; 
  }

  public void mostrarFecha()
  {
    System.out.printf("Fecha de nacimiento: %d/%d/%d%n", dia, mes, año);
  }

  public int obtenerEdad()
  {
    return año = 2019 - año; 
  }

  public double fR()
  {
    int f = 220 - año;

    double fr = f * (0.50);

    double fr2 = f * (0.85);

    double fF = (fr + fr2) / 2;
    return fF;
  }

  public int frecuenciaCardiacaM()
  {
    int f = 220 - año;
    return f;
  }

  public void establecerAño(int año)
  {
    this.año = año;
  }

  public int obtenerAño()
  {
    return año;
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