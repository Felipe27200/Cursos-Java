import java.util.Scanner;

public class PromedioClase
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int total = 0;
    int contadorCalificaciones = 1;

    //Declaración while.
    while(contadorCalificaciones <= 10)
    {
      System.out.print("Introduzca la calificación: ");
      int calificacion = entrada.nextInt();

      if (calificacion > 0)
       {
         if (calificacion <= 100)
         {
           total = total + calificacion;
           contadorCalificaciones = contadorCalificaciones + 1;
         }
         else if (calificacion > 100)
           System.out.println("El número es invalido");
       }
       else if (calificacion <= 0)
         System.out.println("El número es invalido");  
    }  

    int promedio = total / 10;

    System.out.printf("El total de las calificaciones es: %d%n", total);
    System.out.printf("El promedio de las calificaciones es: %d%n", promedio);
 
  }
}