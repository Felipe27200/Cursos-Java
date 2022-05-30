import java.util.Scanner;

public class Comision
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double total = 0;
    double articulosVendidos = 0;
    double valor = 0;
    
    System.out.print("Escriba el número del artículo o 0 para terminar: ");
    int articulo = entrada.nextInt();

    if (articulo >= 1)
    if (articulo <= 4)
       articulo = articulo;
    else
    {
      articulo = 0;
      System.out.println("Artículo no existe");
    }

    while(articulo != 0)
    {

      if (articulo == 1)
         valor = 239.99;
      else if (articulo == 2)
         valor = 129.75;
      else if (articulo == 3)
         valor = 99.95;
      else if (articulo == 4)
         valor = 350.89;

      articulosVendidos += valor; 

      System.out.print("Escriba el número del artículo o 0 para terminar: ");
       articulo = entrada.nextInt();

      if (articulo >= 1)
      if (articulo <= 4)
       articulo = articulo;
      else
      {
        articulo = 0;
        System.out.println("Artículo no existe");
      }
    }

    total = articulosVendidos + (articulosVendidos * 0.09) + 200;
    
    System.out.printf("%nLos ingresos del vendedor en la última semana son: %.2f%n", total);
  }
}