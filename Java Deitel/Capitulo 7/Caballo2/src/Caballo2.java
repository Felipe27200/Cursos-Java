public class Caballo2
{
  private static int[][] accesibilidad = new int [8][8];
  private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
  private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
  private static int filaActual = 0;
  private static int columnaActual = 0;
  private static int posicion = -1;

  public static void main(String[] args)
  {
	int contador = 0;  
	
    for (int fila = 0; fila < accesibilidad.length; fila++)
    { 	
      for (int columna = 0; columna < accesibilidad.length; columna++)
      {
        filaActual = fila;
        columnaActual = columna;
        
    	inicializarAccesibilidad();

        for (int paseo = 1; paseo <= 64; paseo++)
          movimiento();

        if (posicion * -1 == 64)
        {
          mostrarTablero();
          System.out.println();
          contador++;
        }
        
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

  // Realiza el movimiento.
  public static void movimiento()
  {
    accesibilidad[filaActual][columnaActual] = posicion;
        
    int numeroMovimiento = coordenada();

	if (numeroMovimiento >= 0)    
	{
	  filaActual += vertical[numeroMovimiento];
      columnaActual += horizontal[numeroMovimiento];
	}

	if (accesibilidad[filaActual][columnaActual] > posicion)
        posicion--;
  }

  public static int coordenada()
  {
    int movimientoCorrecto = -1;

    for (int numeroMovimiento = 0; numeroMovimiento < accesibilidad.length; numeroMovimiento++)
    {
  	  if (esTraslacion(filaActual + vertical[numeroMovimiento]) == true &&
  	      esTraslacion(columnaActual + horizontal[numeroMovimiento]) == true)
      {
        if (esPosicionLibre(numeroMovimiento) == true)
        {
          movimientoCorrecto = menorAccesibilidad(numeroMovimiento);
          break;
        }                   
      }
    }

    return movimientoCorrecto;
  }

  public static int menorAccesibilidad(int movimientoValido)
  {
	int movimientoCorrecto = movimientoValido;

	 // Halla la posición con menor accesibilidad.
	for (int numeroMovimiento = 0; numeroMovimiento < 8; numeroMovimiento++)
    {
	  if (esTraslacion(filaActual + vertical[numeroMovimiento]) == true &&
		  esTraslacion(columnaActual + horizontal[numeroMovimiento]) == true)
      {
        int filaPosible = filaActual + vertical[movimientoCorrecto];
        int columnaPosible = columnaActual + horizontal[movimientoCorrecto];
		  
		if (esPosicionLibre(numeroMovimiento) == true)
        {
          int fila = filaActual + vertical[numeroMovimiento];
          int columna = columnaActual + horizontal[numeroMovimiento];

          if (accesibilidad[fila][columna] < accesibilidad[filaPosible][columnaPosible] + 1)
          {
         	movimientoCorrecto = numeroMovimiento;
          }

          accesibilidad[fila][columna] -= 1;
        }
      }	  
    }

    return movimientoCorrecto;
  }
  
  // Verifica que la posición no se ha ocupado antes.
  public static boolean esPosicionLibre(int numeroMovimiento)
  {
    int fila = filaActual + vertical[numeroMovimiento];
    int columna = columnaActual + horizontal[numeroMovimiento];

    if (accesibilidad[fila][columna] >= 0)
      return true;
    else 
      return false;
  }
  
  public static boolean esTraslacion(int traslacion)
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
}