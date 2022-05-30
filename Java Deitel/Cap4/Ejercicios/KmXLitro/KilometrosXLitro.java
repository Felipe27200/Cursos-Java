import java.util.Scanner;

public class KilometrosXLitro
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    double kmXLitros = 0;
    double total = 0;
    int contador = 0;

    System.out.print("Escribe los Km recorridos o -1 para terminar: ");
    int kmRecorridos = entrada.nextInt();

    while (kmRecorridos != -1)
    {
      System.out.print("Escribe los litros consumidos: ");
      int litrosConsumidos = entrada.nextInt();

      kmXLitros = (double) kmRecorridos / litrosConsumidos;
      total += kmXLitros;
      contador++;

      System.out.printf("Los Km recorridos por litro son: %.2fKm%n%n", kmXLitros);

      System.out.print("Escribe los Km recorridos o -1 para terminar: ");
        kmRecorridos = entrada.nextInt();     
    }

    if (contador != 0)
    {
     System.out.printf("%nEl total de Km recorridos por litro es: %.2fKm%n", total);
    }
    else
      System.out.println("No se introdujeron valores.");
  }
}