public class PruebaEstudiante
{
  public static void main(String[] args)
  {
   // Creaci�n de Instancia
   Estudiante estudiante1 = new Estudiante("Jane Green", 93.5);
   Estudiante estudiante2 = new Estudiante("John Blue", 72.75);

   System.out.printf("La calificaci�n en letra de %s es: %s%n",
     estudiante1.obtenerNombre(), estudiante1.obtenerCalificacionEstudiante());
   System.out.printf("La calificaci�n en letra de %s es: %s%n",
     estudiante2.obtenerNombre(), estudiante2.obtenerCalificacionEstudiante());
  }
}