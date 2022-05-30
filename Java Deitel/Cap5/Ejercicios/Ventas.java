import java.util.Scanner;

public class Ventas
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double total = 0;

    System.out.println("Escriba el número de serie");
    System.out.println("    O escriba el IFA para terminar o ver los resultados");    

    while (entrada.hasNext())
    {
      int numero = entrada.nextInt();

      double valor = 0;

      if (numero >= 1 && numero <= 5)
      {
        System.out.print("Número de productos: ");
        int cantidad = entrada.nextInt();

        switch (numero)
        {
          case 1: 
            valor = 2.98;
            break;

          case 2: 
            valor = 4.50;
            break;

          case 3: 
            valor = 9.98;
            break;

          case 4: 
            valor = 4.49;
            break;

          case 5: 
            valor = 6.87;
            break;
        }

        total += (double) cantidad * valor;
      }
      else
       System.out.println("Producto no registrado");
      
      System.out.println("\nEscriba el número de serie");
      System.out.println("    O escriba el IFA para ver los resultados");    
    }

    if (total != 0)
    {
      System.out.println("\n********************************");
      System.out.printf("*El total es: %.2f%n*", total);
      System.out.println("********************************");
    }
    else
    {
      System.out.println("********************************");
      System.out.println("* No se vendio ningún producto *");
      System.out.println("********************************");
    }
  }
}