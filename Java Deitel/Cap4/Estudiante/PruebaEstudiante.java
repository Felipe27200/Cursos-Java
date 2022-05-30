public class PruebaEstudiante
{
  public static void main(String[] args)
  {
   // Creación de Instancia
   Estudiante estudiante1 = new Estudiante("Jane Green", 93.5);
   Estudiante estudiante2 = new Estudiante("John Blue", 72.75);

   System.out.printf("La calificación en letra de %s es: %s%n",
     estudiante1.obtenerNombre(), estudiante1.obtenerCalificacionEstudiante());
   System.out.printf("La calificación en letra de %s es: %s%n",
     estudiante2.obtenerNombre(), estudiante2.obtenerCalificacionEstudiante());
  }
}