public class PFC
{
  public static void main(String[] args)
  {
    FrecuenciaCardiaca frecuencia = new FrecuenciaCardiaca("Juan", "Zea", 27, 07, 2000);
    
    System.out.printf("Nombre: %s%nApellido: %s%n", frecuencia.obtenerNombre(), 
    frecuencia. obtenerApellido());

    frecuencia.mostrarFecha();

    System.out.printf("Edad: %d%n", frecuencia.obtenerEdad());
 
    System.out.printf("Su Frecuencia cardiaca esperada es: %.2f%n", 
      frecuencia.fR());

    System.out.printf("Su Frecuencia cardiaca máxima es: %d", 
      frecuencia.frecuenciaCardiacaM());
  }
}