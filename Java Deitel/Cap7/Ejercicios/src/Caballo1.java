public class Caballo1
{
  private static int[][] tablero = new int[8][8];
  private static int filaActual = 0;
  private static int columnaActual = 0;
  private static int posicion = 1;
  private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
  private static int[] vertical =   {-1, -2, -2, -1, 1, 2, 2, 1};
  private static int numeroMovimiento = 7;

  public static void main(String[] args)
  {
    for (int contador = 1; contador <= 64; contador++)
    {
      movimiento();

      numeroMovimiento++;

      if (numeroMovimiento > 7)
        numeroMovimiento = 0;
    }
 
     mostrarTablero();
  }

  // Realiza el movimiento.
  public static void movimiento()
  {
      tablero[filaActual][columnaActual] = posicion;

      if ((filaActual + vertical[numeroMovimiento ] >= 0 &&
           filaActual + vertical[numeroMovimiento ] <= 7) &&
          (columnaActual + horizontal[numeroMovimiento] >= 0 &&
           columnaActual + horizontal[numeroMovimiento] <= 7))
      {
        if (esValidar() == true)
        {
          filaActual += vertical[numeroMovimiento];
          columnaActual += horizontal[numeroMovimiento];
          posicion++;
        }
      }
  }

  // Verifica que la posición no se ha ocupado antes.
  public static boolean esValidar()
  {
    int fila = filaActual + vertical[numeroMovimiento];
    int columna = columnaActual + horizontal[numeroMovimiento];

    if (tablero[fila][columna] == 0)
        return true;
    else 
        return false;
  }

  public static void mostrarTablero()
  {
    for (int fila = 0; fila < tablero.length; fila++)
    {
      for (int columna = 0; columna < tablero[fila].length; columna ++)
          System.out.printf("%3d", tablero[fila][columna]);

      System.out.println("\n");
    }
  }
}