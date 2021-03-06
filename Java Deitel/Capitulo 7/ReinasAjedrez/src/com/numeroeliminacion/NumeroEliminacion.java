package com.numeroeliminacion;



public class NumeroEliminacion
{
  private static int filaActual;
  private static int columnaActual;
  private static int[][] tablero = new int[8][8];
  private static int[][] posicionReinas = new int[8][2];
	
  public static void main(String[] args)
  {
    int contador = 0;
	  
	for (int fila = 0; fila < tablero.length; fila++)
    {
      for (int columna = 0; columna < tablero.length; columna++)
      {
        filaActual = fila; columnaActual = columna;
        
    	for (int filaReina = 0; filaReina < posicionReinas.length; filaReina++)
        {	
	      posicionReinas[filaReina][0] = 16;
	      posicionReinas[filaReina][1] = 46;
  	    }
    	
    	for (int x = 0; x < tablero.length; x++)
    	    for (int y = 0; y < tablero.length; y++)
    	    	tablero[x][y] = 0;
	  
        inicializarTablero();
	  
	    posicionarReinas();
	    if (tablero[filaActual][columnaActual] == -8)
	    {
	      mostrarTablero();
	      System.out.println("\n\n");
	      contador++;
	    }
      }
    }
	
	System.out.println("Tablero con 8 reinas: " + contador);
  }
  
  public static void inicializarTablero()
  {
	for (int fila = 0; fila < tablero.length; fila++)
	  for (int columna = 0; columna < tablero.length; columna++)
	  {
		if (tablero[fila][columna] >= 0 && esPosicionLibre(fila, columna))
			numeroEliminacionCasilla(fila, columna);
		else if(tablero[fila][columna] >= 0)
			tablero[fila][columna] = 0;
	  }
  }
  
  public static void numeroEliminacionCasilla(int fila, int columna)
  {
	int numeroEliminacion = 0;
	
	for (int mover = 1; mover <= 8; mover++)
	{
      // MOVIMIENTOS EN LINEA RECTA
		
	  // Movimiento en Columnas únicamente.
	  if (avanza(columna, mover) && esPosicionLibre(fila, columna + mover))
		  numeroEliminacion++;
	  if (retroceder(columna, mover) && esPosicionLibre(fila, columna - mover))
		  numeroEliminacion++;
	  
      // Movimiento en fila únicamente.
	  if (avanza(fila, mover) && esPosicionLibre(fila + mover, columna))
		  numeroEliminacion++;
	  if (retroceder(fila, mover) && esPosicionLibre(fila - mover, columna))
		  numeroEliminacion++;
	  
	  // MOVIMIENTOS DIAGONALES
	  
	  // Diagonal descendente
	  if ((avanza(fila, mover) && avanza(columna, mover)) &&
		   esPosicionLibre(fila + mover, columna + mover))
		  numeroEliminacion++;
	  if ((retroceder(fila, mover) && retroceder(columna, mover)) &&
		   esPosicionLibre(fila - mover, columna - mover))
		  numeroEliminacion++;

	  // Diagonal ascendente
	  if ((retroceder(fila, mover) && avanza(columna, mover)) &&
			esPosicionLibre(fila - mover, columna + mover))
		  numeroEliminacion++;
	  if ((avanza(fila, mover) == true && retroceder(columna, mover)) &&
		esPosicionLibre(fila + mover, columna - mover))
		  numeroEliminacion++;
	  }
		
	tablero[fila][columna] = numeroEliminacion + 1;
  }

  public static void posicionarReinas()
  {	  
	for (int contador = 0; contador < posicionReinas.length; contador++)
	{
       posicionReinas[contador][0] = filaActual;
       posicionReinas[contador][1] = columnaActual;

       if (tablero[filaActual][columnaActual] >= 0)
	     tablero[filaActual][columnaActual] = (contador + 1) * -1;

       inicializarTablero();
       establecerPosicion();
	}
  }
  
  public static void establecerPosicion()
  {
	for (int fila = 0; fila < tablero.length; fila++)
	{
	  for (int columna = 0; columna < tablero.length; columna++)
	  {
		 if (esPosicionLibre(fila, columna))
		 {
		   casillaMenorEliminacion(fila, columna);
		   fila = 8;
		   break;
		 }
	  }
	}
  }
  
  public static void casillaMenorEliminacion(int filaParametro, int columnaParametro)
  {
    int fila_comparar = filaParametro, columna_comparar = columnaParametro;

    for (int fila = 0; fila < tablero.length; fila++)
    {
      for (int columna = 0; columna < tablero.length; columna++)
      {
    	if ((esPosicionLibre(fila, columna) && tablero[fila][columna] >= 0) &&
    	    tablero[fila][columna] < tablero[fila_comparar][columna_comparar])
    	{
    	  fila_comparar = fila; columna_comparar = columna;
    	}
      }
    }
    
    filaActual = fila_comparar; columnaActual = columna_comparar;
  }
  
  public static boolean esPosicionLibre(int fila, int columna)
  {
	boolean posicionLibre = true;
	
	for (int reina = 0; reina < posicionReinas.length; reina++)
	{
	  if (fila == posicionReinas[reina][0] || columna == posicionReinas[reina][1] ||
		  (fila + columna == posicionReinas[reina][0] + posicionReinas[reina][1]) ||
		  (fila - columna == posicionReinas[reina][0] - posicionReinas[reina][1]))
	  {
		posicionLibre = false;
		break;
	  }
	}
	
	return posicionLibre;
  }
  
  public static boolean avanza(int sentido, int mover)
  {
    if (esMovimientoValido(sentido + mover) == true)
    	return true;
    else
    	return false;
  }
  
  public static boolean retroceder(int sentido, int mover)
  {
	 if (esMovimientoValido(sentido - mover) == true)
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
    for (int fila = 0; fila < tablero.length; fila++)
    {
      for (int columna = 0; columna < tablero[fila].length; columna++)
      {
        if (tablero[fila][columna] < 0)
    	  System.out.printf("%3d ", tablero[fila][columna] * -1);
        else
          System.out.printf("%3s ", "°");
      }

      if (fila < 7)
      System.out.println("\n");
    }
  } 
}
