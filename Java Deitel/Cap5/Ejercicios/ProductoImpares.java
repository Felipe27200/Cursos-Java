public class ProductoImpares
{
  public static void main(String[] args)
  {
    int producto = 1;

    for (int entero = 1; entero <= 15; entero++)
    {
      if (entero % 2 != 0)
      producto *= entero;
    }

    System.out.printf("El producto de los enteros impares del 1 al 15 es: %d%n",
       producto);
  }
}