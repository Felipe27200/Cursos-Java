public class Fecha
{
  private int mes;
  private int dia;
  private int año;

  public Fecha(int mes, int dia, int año)
  {
    if (dia < 32)
     if (dia > 0)
     this.dia = dia;

    this.año = año;

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
  }

  public void mostrarFecha()
  {
    System.out.printf("%d / %d / %d", obtenerDia(), obtenerMes(), obtenerAño()); 
  }

  public void establecerMes(int mes)
  {
    this.mes = mes;
  }

  public int obtenerMes()
  {
    return mes;
  }

  public void establecerDia(int dia)
  {
    this.dia = dia;
  }

  public int obtenerDia()
  {
    return dia;
  }

  public void establecerAño(int año)
  {
    this.mes = año;
  }

  public int obtenerAño()
  {
    return año;
  }
}