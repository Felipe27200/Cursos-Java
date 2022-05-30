public class Bases
{
  public static void main(String[] args)
  {
    System.out.printf("%s%12s%13s%s13%n", "Decimal", "Binario", "octal",
      "Hexadecimal");

    for (int contador = 1; contador <= 256; contador++)
    {
      System.out.printf("%-12d%-15d%-15d%-15s%n", contador, binario(contador),
        octal(contador), hexadecimal(contador));
    }
  }

  public static int binario(int decimal)
  {
    int dividendo = decimal;
    int divisor = 1;
    int resultado = 0;
    String conversion = "";

    while (dividendo >= 2)
    {
      conversion += Integer.toString(dividendo % 2);
      dividendo /= 2;
      divisor *= 10;
    }

    if (dividendo < 2)
      conversion += Integer.toString(dividendo);

    for (int contador = 1; contador <= divisor; contador *= 10)
    {
      int digito = (Integer.parseInt(conversion) / contador) % 10;
      resultado = resultado * 10 + digito;
    }

    return resultado;
  }

  public static int octal(int decimal)
  {
    int dividendo = decimal;
    int divisor = 1;
    int resultado = 0;
    String conversion = "";

    while (dividendo >= 8)
    {
      conversion += Integer.toString(dividendo % 8);
      dividendo /= 8;
      divisor *= 10;
    }

    if (dividendo < 8)
      conversion += Integer.toString(dividendo);

    for (int contador = 1; contador <= divisor; contador *= 10)
    {
      int digito = (Integer.parseInt(conversion) / contador) % 10;
      resultado = resultado * 10 + digito;
    }

    return resultado;
  }

  public static String hexadecimal(int decimal)
  {
    int dividendo = decimal;
    String conversion = "";
    String resultado = "";

    while (dividendo >= 16)
    {
      if (dividendo % 16 <= 9)
         conversion += Integer.toString(dividendo % 16);    

      switch (dividendo % 16)
      {
          case 10:
          conversion += "A";
          break;

        case 11:
          conversion += "B";
          break;

        case 12:
          conversion += "C";
          break;

        case 13:
          conversion += "D";
          break;

        case 14:
          conversion += "E";
          break;

        case 15:
          conversion += "F";
          break;
      }

      dividendo /= 16;
    }

    if (dividendo < 16)
    {
      if (dividendo >= 0 && dividendo <= 9)
        conversion += Integer.toString(dividendo);

      switch (dividendo)
      {
        case 10:
          conversion += "A";
          break;

        case 11:
          conversion += "B";
          break;

        case 12:
          conversion += "C";
          break;

        case 13:
          conversion += "D";
          break;

        case 14:
          conversion += "E";
          break;

        case 15:
          conversion += "F";
          break;
      }     
    }

// Invertir una cadena de Texto con StringBuilder

   for (int contador = conversion.length() - 1; contador >= 0; contador--)
   {
     resultado += conversion.charAt(contador);
   }

    return resultado;
  }
}