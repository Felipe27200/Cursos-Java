public class Caballo2
{
  private static int[][] accesibilidad;
  private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
  private static int[] vertical =   {-1, -2, -2, -1, 1, 2, 2, 1};
  private static int filaActual = 0;
  private static int columnaActual;
  private static int posicion = -1;

  public static void main(String[] args)
  {
    inicializar();

    for (int fila = 0; fila < accesibilidad.length; fila++)
    {
      for (int columna = 0; columna < accesibilidad[fila].length; columna++)
      {
        columnaActual = columna;
        filaActual = fila;
      
        for (int contador = 1; contador <= 64; contador++)
            movimiento();

        if (posicion * -1 >= 64)
        {
          mostrarTablero();
          System.out.println();
        }

        posicion = -1;
        inicializar();
      }
    }
  }

  public static void inicializar()
  {
    int[][] inicio = {{2,3,4,4,4,4,3,2},
                      {3,4,6,6,6,6,4,3},
                      {4,6,8,8,8,8,6,4},
                      {4,6,8,8,8,8,6,4},
                      {4,6,8,8,8,8,6,4},
                      {4,6,8,8,8,8,6,4},
                      {3,4,6,6,6,6,4,3},
                      {2,3,4,4,4,4,3,2}};

    accesibilidad = inicio;
  }

  // Realiza el movimiento.
  public static void movimiento()
  {
    accesibilidad[filaActual][columnaActual] = posicion;
    int x = columnaActual, y = filaActual;

    // Valida la posición con la que se empezara a determinar la posición
    // con menor accesibilidad.
    for (int numeroMovimiento = 0; numeroMovimiento < accesibilidad.length; numeroMovimiento++)
    {
      if ((filaActual + vertical[numeroMovimiento] >= 0 &&
           filaActual + vertical[numeroMovimiento] <= 7) &&
          (columnaActual + horizontal[numeroMovimiento] >= 0 &&
           columnaActual + horizontal[numeroMovimiento] <= 7))
      {
        if (esValidar(numeroMovimiento) == true)
        {
          x += horizontal[numeroMovimiento];
          y += vertical[numeroMovimiento];
          break;
        }
      }
    }

    // Halla la posición con menor accesibilidad.
    for (int numeroMovimiento = 0; numeroMovimiento < 8; numeroMovimiento++)
    {
      if ((filaActual + vertical[numeroMovimiento] >= 0 &&
           filaActual + vertical[numeroMovimiento] <= 7) &&
          (columnaActual + horizontal[numeroMovimiento] >= 0 &&
           columnaActual + horizontal[numeroMovimiento] <= 7))
      {
        if (esValidar(numeroMovimiento) == true)
        {
          int fila = filaActual + vertical[numeroMovimiento];
          int columna = columnaActual + horizontal[numeroMovimiento];

          if (accesibilidad[fila][columna] < accesibilidad[x][y])
          {
            x = columna;
            y = fila;
          }

          accesibilidad[fila][columna] -= 1;
        }
      }
    }

    filaActual = y;
    columnaActual = x;

    if (accesibilidad[y][x] > posicion)
      posicion--;
  }

  // Verifica que la posición no se ha ocupado antes.
  public static boolean esValidar(int numeroMovimiento)
  {
    int fila = filaActual + vertical[numeroMovimiento];
    int columna = columnaActual + horizontal[numeroMovimiento];

    if (accesibilidad[fila][columna] >= 0)
      return true;
    else 
        return false;
  }

  public static void mostrarTablero()
  {
    for (int fila = 0; fila < accesibilidad.length; fila++)
    {
      for (int columna = 0; columna < accesibilidad[fila].length; columna++)
      {
          System.out.printf("%3d", accesibilidad[fila][columna] * -1);
      }

      System.out.println("\n");
    }
  }
}