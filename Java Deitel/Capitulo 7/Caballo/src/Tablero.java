public class Tablero
{
  private static int posicion = -1;
  private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1}; 
  private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
  private static int[][] accesibilidad = new int [8][8];
  private static int fila;
  private static int columna;
  
  public static void main(String[] args)
  {
	int contador = 0;  
	
    for (int fila = 0; fila < accesibilidad.length; fila++)
    { 	
      for (int columna = 0; columna < accesibilidad.length; columna++)
      {
        Caballo caballo = new Caballo(fila, columna);        
    	inicializarAccesibilidad();

        for (int paseo = 1; paseo <= 64; paseo++)
          empezarMovimiento(caballo);

          mostrarTablero();
          System.out.println();
          contador++;
        
        posicion = -1;
      }
    }
    
    System.out.println("Paseos completado: " + contador);
  }
  
  public static void inicializarAccesibilidad()
  {
    int[][] establecerValores = {{2, 3, 4, 4, 4, 4, 3, 2},
                                 {3, 4, 6, 6, 6, 6, 4, 3},
                                 {4, 6, 8, 8, 8, 8, 6, 4},
                                 {4, 6, 8, 8, 8, 8, 6, 4},
                                 {4, 6, 8, 8, 8, 8, 6, 4},
                                 {4, 6, 8, 8, 8, 8, 6, 4},
                                 {3, 4, 6, 6, 6, 6, 4, 3},
                                 {2, 3, 4, 4, 4, 4, 3, 2}};

    accesibilidad = establecerValores;
  }
 
   public static void empezarMovimiento(Caballo caballo)
  {
	accesibilidad[caballo.obtenerFila()][caballo.obtenerColumna()] = posicion;

	if (accesibilidad[caballo.obtenerFila()][caballo.obtenerColumna()] == -1)
	{
	  fila = caballo.obtenerFila(); columna = caballo.obtenerColumna();
	}
	
	Caballo caballo2 = null;
	  
	for (int numeroMovimiento = 0; numeroMovimiento < 8; numeroMovimiento++)
    {
      if (movimiento(caballo, numeroMovimiento) == true)
      {
        int fila = caballo.obtenerFila() + vertical[numeroMovimiento];
        int columna = caballo.obtenerColumna() + horizontal[numeroMovimiento];
          
        if (caballo2 == null)
    	    caballo2 = new Caballo(fila, columna);
 
        if (caballo2 != null)
        {
          switch (comparar(caballo2, fila, columna))
          {
            case 1:
              caballo2.establecerFila(fila);
              caballo2.establecerColumna(columna);
              break;
            
            case 2:
              Caballo caballo3 = new Caballo(fila, columna);
              
              if (desempate(caballo3) < desempate(caballo2))
              {
            	caballo2.establecerFila(caballo3.obtenerFila());
                caballo2.establecerColumna(caballo3.obtenerColumna());
              }
          }
        }
      }
    }
	
	if (caballo2 != null)
	{
      actualizarAccesibilidad(caballo);

      caballo.establecerFila(caballo2.obtenerFila());
	  caballo.establecerColumna(caballo2.obtenerColumna());
	}
	
	if (accesibilidad[caballo.obtenerFila()][caballo.obtenerColumna()] > posicion)
		posicion--;
		
  }
   
  public static void actualizarAccesibilidad(Caballo caballo)
  {
    for (int numeroMovimiento = 0; numeroMovimiento < 8; numeroMovimiento++)
    {
      if (movimiento(caballo, numeroMovimiento) == true)
      {
        int fila = caballo.obtenerFila() + vertical[numeroMovimiento];
        int columna = caballo.obtenerColumna() + horizontal[numeroMovimiento];

        accesibilidad[fila][columna] -= 1;
      }
    }
  }
  
  public static int desempate(Caballo caballo)
  {
	int acceso = -1;
	  
	for (int numeroMovimiento = 0; numeroMovimiento < 8; numeroMovimiento++)
    {
      if (movimiento(caballo, numeroMovimiento) == true)
      {
        int fila = caballo.obtenerFila() + vertical[numeroMovimiento];
        int columna = caballo.obtenerColumna() + horizontal[numeroMovimiento];
          
        if (acceso == -1)
    	    acceso = accesibilidad[fila][columna];

        if(acceso != -1)
        {
          if (accesibilidad[fila][columna] < acceso)
        	  acceso = accesibilidad[fila][columna];
        }
      }  
    }
		
	return acceso;
  }	
  
  public static int comparar(Caballo caballo, int fila, int columna)
  {
    if (accesibilidad[fila][columna] < accesibilidad[caballo.obtenerFila()][caballo.obtenerColumna()])
    	return 1;
    else if (!(fila == caballo.obtenerFila() && columna == caballo.obtenerColumna()) &&
    		  accesibilidad[fila][columna] == accesibilidad[caballo.obtenerFila()][caballo.obtenerColumna()])
    	return 2;
    else
    	return 3;
  }

  public static boolean movimiento(Caballo caballo, int numeroMovimiento)
  {
    boolean desplazar = false;    
	  
	if (esMovimientoValido(caballo.obtenerFila() + vertical[numeroMovimiento]) == true &&
        esMovimientoValido(caballo.obtenerColumna() + horizontal[numeroMovimiento]) == true)
    {
      if (esPosicionLibre(caballo, numeroMovimiento) == true)
    	  desplazar = true;
    }
	
	return desplazar;
  }

  // Verifica que la posición no se ha ocupado antes.
  public static boolean esPosicionLibre(Caballo caballo, int numeroMovimiento)
  {
    int fila = caballo.obtenerFila() + vertical[numeroMovimiento];
    int columna = caballo.obtenerColumna() + horizontal[numeroMovimiento];

    if (accesibilidad[fila][columna] >= 0)
      return true;
    else 
      return false;
  }
  
  public static boolean esMovimientoValido(int traslacion)
  {
    boolean traslacionValida = false;

    switch (traslacion)
    {
      case 0: case 1: case 2: case 3:
      case 4: case 5: case 6: case 7:
        traslacionValida = true;
    }
    
    return traslacionValida;
  }

  public static void mostrarTablero()
  {
    for (int fila = 0; fila < accesibilidad.length; fila++)
    {
      for (int columna = 0; columna < accesibilidad[fila].length; columna++)
      {
          System.out.printf("%3d ", accesibilidad[fila][columna] * -1);
      }

      System.out.println("\n");
    }
  }
  
  public static boolean paseoCerrado()
  {
    if (esMovimientoValido(fila + 1) && accesibilidad[fila + 1][columna] == -64)
     return true;
    else if (esMovimientoValido(fila - 1) && accesibilidad[fila - 1][columna] == -64)
        return true;
    else if (esMovimientoValido(columna + 1) && accesibilidad[fila][columna + 1] == -64)
        return true;
    else if (esMovimientoValido(columna - 1) && accesibilidad[fila][columna - 1] == -64)
        return true;
    else
    	return false;
  }
}
