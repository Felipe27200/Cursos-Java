public class Incremento
{
  public static void main(String[] args)
  {
    int c = 5;    

    System.out.printf("c antes del postincremento: %d%n", c);
    System.out.printf("       postincremento de c: %d%n", c++);
    System.out.printf("c despu�s del postincremento: %d%n%n", c);

    c = 5;

    System.out.printf("c antes del preincremento: %d%n", c);
    System.out.printf("       preincremento de c: %d%n", ++c);
    System.out.printf("c despu�s del preincremento: %d%n", c);
  }
}