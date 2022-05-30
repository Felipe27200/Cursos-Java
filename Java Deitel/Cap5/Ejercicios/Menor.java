import java.util.Scanner;

public class Menor
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int menor = 0, cantidad = 1;

    while (cantidad <= 1)
    {
      System.out.printf("%n%s%s%n%n", "El n�mero que escriba ",
      "sera la cantidad de veces que debe introducir n�meros");

      System.out.print("Escriba un entero: ");
      int numero = entrada.nextInt();

      if (numero < 0)
      {
        cantidad = numero;
        cantidad *= -1;
      }
      else 
        cantidad = numero;

      menor = numero;

      while (cantidad > 1)
      {
        System.out.print("Escriba un entero: ");
        numero = entrada.nextInt();

        if (numero < menor)
          menor = numero;

        --cantidad;
      }

      break;
    }

    if (cantidad != 0)
    {
      System.out.printf("%nEl n�mero menor es %d%n", menor);
    }
    else 
      System.out.println("\nNo se introdujo ning�n n�mero");
  }
}