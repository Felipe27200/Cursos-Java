public class PerfilMedico
{
  private String nombre;
  private String apellido;
  private String sexo;
  private int dia;
  private int mes;
  private int a�o;
  private double altura;
  private double peso;

  public PerfilMedico(String nombre, String apellido, String sexo, 
    int dia, int mes, int a�o, double altura, double peso)
  {
    this.nombre = nombre;
    
    this.apellido = apellido;

    this.sexo = sexo;

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

    if (altura > 0.0)
      this.altura = altura;

    if (peso > 0.0)
     this.peso = peso; 
  }

  public void mostrarFecha()
  {
    System.out.printf("Fecha de nacimiento: %d/%d/%d%n", dia, mes, a�o);
  }

  public int obtenerEdad()
  {
    return a�o = 2019 - a�o; 
  }

  public double frecuenciaReposo()
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

  public double bmi()
  {
    altura = altura / 100; 

    double bmi = peso / (altura * altura);
    return bmi;
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

  public void establecerAltura(double altura)
  {
    this.altura = altura; 
  }

  public double obtenerAltura()
  {
    return altura;
  }

  public void establecerPeso(double peso)
  {
    this.peso = peso;
  }

  public double obtenerPeso()
  {
    return peso;
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

  public void establecerSexo(String sexo)
  {
    this.sexo = sexo;
  }

  public String obtenerSexo()
  {
    return sexo;
  }
}