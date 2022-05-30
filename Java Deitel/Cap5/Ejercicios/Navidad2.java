public class Navidad2
{
  public static void main(String[] args)
  {
    String uno = "  my true love sent to me";
    String dos = "Twelve drummers drumming,";
    String tres = "Eleven pipers piping,";
    String cuatro = "Ten lords a-leaping,";
    String cinco = "Nine ladies dancing,";
    String seis = "Eight maids a-milking,";
    String siete = "Seven swans a-swimming,";
    String ocho = "six geese a-laying,";
    String nueve = "Five golden rings,";
    String diez = "Four calling birds,";
    String once = "Three French hens,";
    String doce = "Two turtle doves";
    String trece = "And a partridge in a pear tree.";

    switch (1)
    {
      case 1:
        System.out.println("On the first day of Christmas,");

      case 2:
        System.out.printf("%s%n%s%n%n", uno, trece);

      case 3:
        System.out.println("On the second day of Christmas,");

      case 4:
        System.out.printf("%s%n%s%n%s%n%n", uno, doce, trece);

      case 5: 
        System.out.println("On the third day of Christmas,");
   
      case 6:
        System.out.printf("%s%n%s%n%s%n%s%n%n", uno, once, doce, trece);
    }
  }
}