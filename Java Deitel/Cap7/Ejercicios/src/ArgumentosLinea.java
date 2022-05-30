public class ArgumentosLinea
{
  public static void main(String[] args)
  {
    int[] arreglo;

    if (args.length != 1)
    {
      arreglo = new int[10];
    }
    else
    {
      arreglo = new int[Integer.parseInt(args[0])];
    }

    System.out.printf("%s%8s%n", "Índice", "Valor");

    for (int indice = 0; indice < arreglo.length; indice++)
      System.out.printf("%5d%8d%n", indice, arreglo[indice]);
  }
}