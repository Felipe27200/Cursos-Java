public class TernasPitagoricas
{
  private static int nueva_linea;

  public static void main(String[] args)
  {
    for (int c = 2; c <= 500; ++c)
    {
      int prueba = (int) (Math.pow(c, 2));

      for (int a = 2; a <= 500; ++a)
      {    
        for (int b = 2; b <= 500; ++b)
        {
          int x = a, y = b;

          int hipotenusa = (int) (Math.pow(a, 2) + Math.pow(b, 2));

          if (hipotenusa == prueba)
          {
            System.out.printf("(%d, %d, %d);	", a, b, c);
            nueva_linea++;
 
            if (nueva_linea % 3 == 0)
               System.out.println();
          }
        }
      }
    }
  }
}