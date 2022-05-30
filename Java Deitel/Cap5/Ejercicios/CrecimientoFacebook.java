public class CrecimientoFacebook
{
  public static void main(String[] args)
  {

    int doble = 1, mitad = 1;
    double principio = 1000000000;
    double poblacion;
    System.out.println("*******************");
    System.out.println("*Facebook usuarios*");
    System.out.println("*******************");

    System.out.printf("%3s%15s%n%n", "Mes", "Usuarios");

    for (int mes = 1; mes <= 18; mes++)
    {
      poblacion = principio * Math.pow(1 + 0.04, mes);
       
      System.out.printf("%3d%17.0f%n", mes, poblacion);

      if (poblacion >= 1500000000 && mitad == 1)
      {
        mitad++;
        System.out.println(" Facebook superó los\n 1500 millones de\n usuarios\n");
      }

      if (poblacion >= 2000000000 && doble == 1)
      {
        doble++;
        System.out.println(" Facebook superó los\n 2000 millones de\n usuarios\n");
      }
    }
  }
}