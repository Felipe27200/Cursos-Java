import java.util.Scanner;

public class UsarTiempo2 
{
  public static void main(String[] args)
  {
	Scanner entrada = new Scanner(System.in);
	Tiempo2 tiempo = new Tiempo2(13, 59, 59);
	
	mostrarTiempo(tiempo);
	System.out.println();
	
	System.out.print("Escriba h para incrementar hora, m para minuto y s para segundo." +
	    "\no <Ctrl> z para terminar: ");
	
	while (entrada.hasNext())
	{
	  String eleccion = entrada.next();
	  
	  switch(eleccion)
	  {
	    case "h":
	    	tiempo.incrementarHora();
	    	break;
	    
	    case "m":
	    	tiempo.incrementarMinuto();
	    	break;
	    
	    case "s":
	    	tiempo.incrementarSegundo();
	    	break;
	    	
	    default:
	    	System.out.println("Instrucción no reconocida");
	  }
	  
	  System.out.println();
	  mostrarTiempo(tiempo);
	  System.out.println();

	  System.out.print("Escriba h para incrementar hora, m para minuto y s para segundo." +
		    "\no <Ctrl> z para terminar: ");
	}
  }
  
  public static void mostrarTiempo(Tiempo2 tiempo)
  {
	System.out.printf("Formato universal: %s%nFormato estandar: %s%n",
			tiempo.aStringUniversal(), tiempo);
  }
}
