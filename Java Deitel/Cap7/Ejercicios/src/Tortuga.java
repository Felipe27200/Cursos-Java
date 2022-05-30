import java.util.Scanner;

public class Tortuga
{
  private static boolean avanza = true;
  private static boolean fila = true;
  private static boolean error;
  private static int[][] piso = new int[20][20];
  private static int fil;
  private static int col;
  private static int caracter = 1;

  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Comandos: (área 20x20)");
    System.out.printf("%15s%15s%32s%n%s%24s%24s%n%s", 
        "1: espacio en blanco.", "2: carácter.", "3: giro a la derecha.",
        "4: giro a la izquierda", "5,n: mover n espacios.",
        "6: Mostrar en pantalla.", "9: Fin del programa: ");
    double comando = entrada.nextDouble();

    while (comando != 9 && error == false)
    {
      if (comando == 1)
         caracter = 1;
      else if (comando == 2)
         caracter = 2;

      if (comando == 3)
      {
        girarDerecha();
      }
      else if (comando == 4)
      {
        girarIzquierda();
      }

      if (comando >= 5.00 && comando <= 5.20)
      {
        int mover;

        if (comando == 5.02)
           mover = 2;
        else if (comando == 5.06)
           mover = 6;
        else if(comando == 5.10)
           mover = 10;
        else
          mover = (int)(comando * 100) - 500;

        if (avanza == true)
        {
          if (fila == true && col + mover <= 20)
             desplazar(mover);
          else if (fila == false && fil + mover <= 20)
             desplazar(mover);
          else
            System.out.println("\t\tCOORDENADA FUERA DE RANGO");
        }         
        else
        {
          if (fila == true && col - mover >= 0)
             desplazar(mover);
          else if (fila == false && fil - mover >= 0)
             desplazar(mover);
          else
            System.out.println("\t\tCOORDENADA FUERA DE RANGO");
        }         
      }

      if (comando == 6)
        imprimirArreglo(piso);

      System.out.println("\nComandos: (área 20x20)");
      System.out.printf("%15s%15s%32s%n%s%24s%24s%n%s", 
          "1: espacio en blanco.", "2: carácter.", "3: giro a la derecha.",
          "4: giro a la izquierda", "5,n: mover n espacios.",
          "6: Mostrar en pantalla.", "9: Fin del programa: ");
      comando = entrada.nextDouble();
    }
  }

  public static void girarDerecha()
  {
    if (fila == true)
    {
      fila = false;
    }
    else
    {
      fila = true;

      if (avanza == true)
      {
        avanza = false;
      }
      else
      {
        avanza = true;
      }
    }
  }

  public static void girarIzquierda()
  {
    if (fila == true)
    {
      fila = false;

      if (avanza == true)
      {
        avanza = false;
      }
      else
      {
        avanza = true;
      }
    }
    else
    {
      fila = true;
    }
  }

  public static void desplazar(int mover)
  {
    try
    {
      int m = 1;
      int desplazamiento = 0;

      if (col > 0 && fil >= 0)
         desplazamiento = 1;

      if (fila == true)
      {
        if (avanza == true)
        {
          for (int c = col; m <= mover + desplazamiento; c++, m++)
          {
            if (c == col && piso[fil][col] != caracter &&
                (col > 0 && fil >= 0))
               piso[fil][c + 1] = caracter;
            else
               piso[fil][c] = caracter;

            if (m == mover + desplazamiento)
              col = c;
          }
        }
        else
        {
          for (int c = col; m <= mover + 1; c--, m++)
          {
            if (c == col && piso[fil][col] != caracter &&
                (col > 0 && fil >= 0))
                piso[fil][c - 2] = caracter;
            else
                piso[fil][c] = caracter;
          
            col = c;
          }
        }
        
      }
      else
      {
        if (avanza == true)
        {
          for (int f = fil; m <= mover + desplazamiento; f++, m++)
          {
            if (f == fil && piso[fil][col] != caracter && 
                (col > 0 && fil >= 0))
                piso[f + 1][col] = caracter;
            else
                piso[f][col] = caracter;

            fil = f;
          }
        }
        else
        {
          for (int f = fil; m <= mover + 1; f--, m++)
          {
            if (f == fil && piso[fil][col] != caracter && 
                (col > 0 && fil >= 0))
                piso[f - 2][col] = caracter;
            else
                piso[f][col] = caracter;
          
            fil = f;
          }
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("\tCOORDENADAS FUERA DE RANGO");
    }
  }

  public static void imprimirArreglo(int[][] piso)
  {    
    System.out.print(" ");    

    for (int elemento = 0; elemento < piso.length; elemento++)
        System.out.printf("%2s", (elemento == col ? "|" : " "));

    System.out.printf("   Coordenadas: (%d, %d)%n", fil + 1, col + 1);

    for (int fila = 0; fila < piso.length; fila++)
    {
      System.out.printf("%2s", (fila == fil ? "-" : " "));

      for (int columnas = 0; columnas < piso[fila].length; columnas++)
      {
        if (piso[fila][columnas] == 2.00)
        {
          System.out.print("* ");
        }
        else if (piso[fila][columnas] == 1.00 || piso[fila][columnas] == 0)
        {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }
}