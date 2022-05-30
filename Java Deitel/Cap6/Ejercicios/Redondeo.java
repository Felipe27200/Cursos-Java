import java.util.Scanner;

public class Redondeo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el número: ");
    double x = entrada.nextDouble();

    redondearAInteger(x);
    redondearADecimas(x);
    redondearACentesimas(x);
    redondearAMilesimas(x);
  }

  public static void redondearAInteger(double numero)
  {
    System.out.println("Original: " + numero); 
    System.out.println("Redondeo: " + Math.floor(numero));
  }

  public static void redondearADecimas(double numero)
  {
    double y = Math.floor(numero * 10 + 0.5) / 10;

    System.out.println("\nOriginal: " + numero); 
    System.out.println("Redondeo: " + y); 
  }

  public static void redondearACentesimas(double numero)
  {
    double y = Math.floor(numero * 100 + 0.5) / 100;

    System.out.println("\nOriginal: " + numero); 
    System.out.println("Redondeo: " + y); 
  }

  public static void redondearAMilesimas(double numero)
  {
    double y = Math.floor(numero * 1000 + 0.5) / 1000;

    System.out.println("\nOriginal: " + numero); 
    System.out.println("Redondeo: " + y); 
  }

}