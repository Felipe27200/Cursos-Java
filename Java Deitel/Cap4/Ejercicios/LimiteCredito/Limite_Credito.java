import java.util.Scanner;

public class Limite_Credito
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int saldo = 0;

    System.out.print("Escriba el número de la cuenta o -1 para terminar: ");
    int numero = entrada.nextInt();
 
    while(numero != -1)
    {
      System.out.print("Escriba el saldo inicial de la cuenta: ");
        int saldoInicial = entrada.nextInt();
      System.out.print("Escriba el total de los articulos cargados en el mes: ");
        int cargos = entrada.nextInt();
      System.out.print("Escriba el total de los creditos aplicados en el mes: ");
        int creditos = entrada.nextInt();
      System.out.print("Introduzca el límite de credito permitido: ");
        int creditoPermitido = entrada.nextInt();

      saldo = saldoInicial + cargos - creditos;

      System.out.printf("El saldo es: %d%n", saldo);

      if (saldo > creditoPermitido)
        System.out.println("Se excedio el límite de crédito");

      System.out.print("Escriba el número de la cuenta o -1 para terminar: ");
      numero = entrada.nextInt();
    }
  }
}