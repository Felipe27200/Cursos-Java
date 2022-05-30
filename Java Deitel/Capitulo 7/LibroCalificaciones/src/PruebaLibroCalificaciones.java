import java.util.Scanner;

public class PruebaLibroCalificaciones 
{
  public static void main(String[] args)
  {
	Scanner entrada = new Scanner(System.in);
	
    System.out.print("Establecer la cantidad de estudiantes y examenes, dejando un espacio entre los n�meros: ");
    int estudiantes = entrada.nextInt();
    int examenes = entrada.nextInt();
    
    int[][] calificaciones = new int[estudiantes][examenes];
    
    for (int fila = 0; fila < calificaciones.length; fila++)
    	for (int columna = 0; columna < calificaciones[fila].length; columna++)
    		calificaciones[fila][columna] = -1;
	
	LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("CS101 Introducci�n a la programaci�n en Java", calificaciones);
	
	System.out.println("\nEscoja una de las siguentes opciones:");
	System.out.print("1: ingresar una calificaci�n | 2: ver calificaciones | (Ctrl + z) para terminar: ");

	while (entrada.hasNext())
	{
	  int opcion = entrada.nextInt();

	  switch (opcion)
	  {
	    case 1:
	      System.out.print("\nN�mero entre 1 y " + estudiantes + 
	        " para escoger un estudiante.\n" + "N�mero entre 1 y " + examenes +
	    	" para establecer el examen a calificar: ");
	         int numeroEstudiante = entrada.nextInt();
	         int numeroExamen = entrada.nextInt();
	      System.out.print("Escriba la calificacion: ");
	      int calificacion = entrada.nextInt();

	      miLibroCalificaciones.establecerCalificacion(numeroEstudiante, numeroExamen, calificacion);
		  break;
		  
	    case 2:
	    	System.out.println();
	    	miLibroCalificaciones.imprimirCalificaciones();
	        break;
	        
	    default:
	    	System.out.println("Opci�n no valida. Intente de nuevo.");
	  }

	  System.out.println("\n\nEscoja una de las siguentes opciones:");
	  System.out.print("1: ingresar una calificaci�n | 2: ver calificaciones | (Ctrl + z) para terminar: ");
	}
	
	System.out.printf("%n%nBienvenido al libro de calificaciones para%n%s%n%n", 
			miLibroCalificaciones.obtenerNombreDelCurso());
	miLibroCalificaciones.procesarCalificaciones();
  }
}
