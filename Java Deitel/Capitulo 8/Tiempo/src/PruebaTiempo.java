public class PruebaTiempo 
{
  public static void main(String[] args)
  {
    Tiempo tiempo = new Tiempo();
    Tiempo tiempo2 = new Tiempo(305);
    
    mostrarTiempo(tiempo);
    mostrarTiempo(tiempo2);
    
    try
    {
      tiempo.establecer_segundosTrasncurridos(47800);
      mostrarTiempo(tiempo);
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }
  }
  
  public static void mostrarTiempo(Tiempo tiempo)
  {
	System.out.printf("%s%n%s%n%n", tiempo, tiempo.aStringUniversal());  
  }
}
