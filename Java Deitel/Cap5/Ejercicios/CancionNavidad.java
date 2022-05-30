import java.util.Scanner;

public clas CancionNavidad
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un número entre 1 y 12 o -1 para terminar:");
    int estrofa = entrada.nextInt();

    while (estrofa != -1)
    {
      if (estrofa >= 1 && estrofa <= 12)
      {
        switch (estrofa)
        {
          case 1:
            System.out.print();  
        }
      }
    }
  }
}