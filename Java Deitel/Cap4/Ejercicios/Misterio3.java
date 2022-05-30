public class Misterio3
{
  public static void main(String[] args)
  {
    int fila = 10;

    while (fila >= 1)//2. Después de acabar el while anidado ejecuta este.
    {
      int columna = 1;
      
      while (columna <= 10)//1.Se realiza primero el ciclo de esta instrucción while. 
      {
        System.out.print(fila % 2 == 1 ? "<" : ">");
        ++columna;
      }

      --fila;
      System.out.println();
    }
  }
}