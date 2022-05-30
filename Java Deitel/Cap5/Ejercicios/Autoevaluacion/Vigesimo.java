public class Vigesimo
{
  public static void main(String[] args)
  {
    System.out.println("*************");
    System.out.println("*Ciclo while*");
    System.out.println("*************");

    int i = 1;

    while (i <= 20)
    {
      if (i % 5 != 0)
      {
        System.out.printf("%d", i);
        System.out.print('\t'); 
      }
      else
      {
        System.out.printf("%d", i);
        System.out.println();
      }

      i++;
    }

    System.out.println("\n***********");
    System.out.println("*Ciclo for*");
    System.out.println("***********");

    for (i = 1; i <= 20; i++)
    {
       if (i % 5 == 0)
       {
         System.out.printf("%d", i);
         System.out.println();
       }
       else
       {
         System.out.printf("%d", i);
         System.out.print('\t');
       }
    }   
  }
}