import java.util.Scanner;

public class Comisiones
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    int[] salario = new int[10];
    int[] frecuencia = new int [11];

    for (int contador = 0; contador < salario.length; contador++)
    {
      System.out.print("Introduzca el salario: ");
      int sueldo = entrada.nextInt();

      if (sueldo >= 200 && sueldo <= 1000)
         salario[contador] = sueldo;
      else
        System.out.println("Valor no valido");
    }

    for (int contador = 0; contador < salario.length; contador++)
      frecuencia[salario[contador] / 100]++;

    System.out.println();

    System.out.println("**********");
    System.out.println("*Salarios*");
    System.out.println("**********");

    for (int encabezado = 2; encabezado <= 10; encabezado++)
    {
      if (encabezado < 10)
         System.out.printf("%d-%d	", encabezado * 100, 
           encabezado * 100 + 99);
      else if (encabezado == 10)
        System.out.println("1000");
    }

    for (int indice = 2; indice < frecuencia.length; indice++)
    {
      System.out.printf("%d	", frecuencia[indice]);
    }

    System.out.println();
  }
}