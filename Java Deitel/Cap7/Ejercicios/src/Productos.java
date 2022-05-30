public class Productos
{
  public static void main(String[] args)
  {
    producto(14, 15);
    producto(12, 1, 89, 100);
    producto(14, 13, 32, 42, 532);
    producto(14, 15);
  }

  public static void producto(int... numero)
  {
    int resultado = 1;

    for (int elemento : numero)
       resultado *= elemento;

    System.out.println("El producto es: " + resultado);
  }
}