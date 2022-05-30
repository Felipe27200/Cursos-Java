import java.util.Scanner;

public class Residuo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba el primer numero o -1 para terminar: ");
    int numero1 = entrada.nextInt();
    
    while (numero1 != -1)
    {
      System.out.print("Escriba el segundo numero: ");
      int numero2 = entrada.nextInt();

      int residuo = numero1 % numero2;
      System.out.printf("El residuo es: %d%n", residuo);

      System.out.print("Escriba el primer numero o -1 para terminar: ");
      numero1 = entrada.nextInt();
    }
  }
}