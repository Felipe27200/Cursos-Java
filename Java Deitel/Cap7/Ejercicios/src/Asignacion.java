public class Asignacion
{
  public static void main(String[] args)
  {
    int[][] ventas = new int[3][5];

    for (int fila = 0; fila < ventas.length; fila++)
    {
      for (int col = 0; col < ventas[fila].length; col++)
        System.out.printf("[%d][%d]  ", fila, col);

      System.out.println();
    }
  }
}