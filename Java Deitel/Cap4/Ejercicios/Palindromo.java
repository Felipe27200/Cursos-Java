import java.util.Scanner;

public class Palindromo
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un pal�ndromo de 5 d�gitos o -1 para terminar: ");
    int numero = entrada.nextInt();

    if (numero >= -99999)
    if (numero <= 99999)
      numero = numero;
    else
     {
      System.out.println("El n�mero excede las cinco cifras");
      numero = 123456;
     }

    while (numero != -1)
    {

      int a = numero / 10000 % 10;
      int b = numero / 1000 % 10;
      int c = numero / 100 % 10;
      int d = numero / 10 % 10;
      int e = numero % 10;

      int calculo1 = e * 10 + d;
      int calculo2 = calculo1 * 10 + c;
      int calculo3 = calculo2 * 10 + b;
      int calculo4 = calculo3 * 10 + a; 

      if (numero >= -99999)
      if (numero <= 99999)
      if (a == 0)
      {
        if (a != b)
        if (a != c)
        if (a != d)
        if (a != e)
          System.out.println("El n�mero no alcanza las cinco cifras");
     
        if (a == 0)
        if (a == b)
        if (a != c)
        if (a != d)
        if (a != e)
          System.out.println("El n�mero no alcanza las cinco cifras");

        if (a == 0)
        if (a == b)
        if (a == c)
        if (a != d)
        if (a != e)
          System.out.println("El n�mero no alcanza las cinco cifras");

        if (a == 0)
        if (a == b)
        if (a == c)
        if (a == d)
        if (a != e)
          System.out.println("El n�mero no alcanza las cinco cifras");

        if (a == 0)
        if (a == b)
        if (a == c)
        if (a == d)
        if (a == e)
          System.out.println("El n�mero no alcanza las cinco cifras");
      }
      else if (calculo4 == numero)
        System.out.println("El n�mero es pal�ndromo");
      else if (calculo4 != numero)
        System.out.println("El n�mero no es pal�ndromo");
        
      System.out.print("Escriba un pal�ndromo de 5 d�gitos o -1 para terminar: ");
      numero = entrada.nextInt();

      if (numero >= -99999)
      if (numero <= 99999)
        numero = numero;
      else
      {
        System.out.println("El n�mero excede las cinco cifras");
        numero *= 10;
      }
    }
  }
}