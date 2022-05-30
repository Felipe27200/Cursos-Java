public class For
{
  public static void main(String[] args)
  {
     for (int contador = 10; contador >= 1; --contador)
     {
       System.out.printf("%n%s%n%s%d%s%n%s%n", "*******************", 
           "*Valor contador: ", contador, "*", "*******************");

       for (int espacio = 10; espacio >= contador; --espacio)
       {
         System.out.printf("Valor espacio: %d%n", espacio);
       } 
     }
  }
}