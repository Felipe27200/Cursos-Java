public class VerTiempoSemaforo 
{
  public static void main(String[] args)
  {
	System.out.println("Tiempo De Duraci�n:");
	  
    for (LuzSemaforo luz : LuzSemaforo.values())
    {
      System.out.printf("%s: %s%n", luz, luz.obtenerDuracion()); 	
    }
  }
}
