public class Navidad
{
  public static void main(String[] args)
  {
    String cancion = "";

    for (int contador = 1; contador <= 12; contador++)
    {
      switch (contador)
      {
        case 1:
          cancion += "On the first day of Christmas,\n";
          break;

        case 2:
          cancion += "On the second day of Christmas,\n";
          break;

        case 3:
          cancion += "On the third day of Christmas,\n";
          break;

        case 4:
          cancion += "On the fourth day of Christmas,\n";
          break;
 
       case 5:
          cancion += "On the fifth day of Christmas,\n";
          break;

        case 6:
          cancion += "On the sixth day of Christmas,\n";
          break;

        case 7:
          cancion += "On the seventh day of Christmas,\n";
          break;

        case 8:
          cancion += "On the eighth day of Christmas,\n";
          break;

        case 9:
          cancion += "On the ninth day of Christmas,\n";
          break;

        case 10:
          cancion += "On the tenth day of Christmas,\n";
          break;

        case 11:
          cancion += "On the eleventh day of Christmas,\n";
          break;

        case 12:
          cancion += "On the twelfth day of Christmas,\n";
          break;
      }

      cancion += "    my true love sent to me\n";

      switch (contador)
      {
        case 12: 
          cancion += " Twelve drummers drumming,\n";

        case 11: 
          cancion += "     Eleven pipers piping,\n";

        case 10:
          cancion += "      Ten lords a-leaping,\n";

        case 9: 
          cancion += "      Nine ladis dancing,\n";

        case 8: 
          cancion += "     Eight maids a-milking,\n";

        case 7: 
          cancion += "   Seven swans a-swimming,\n";

        case 6: 
          cancion += "      Six geese a-laying,\n";

        case 5: 
          cancion += "       Five golden rings,\n";

        case 4: 
          cancion += "       Four calling birds,\n";

        case 3: 
          cancion += "      Three French hens,\n";

        case 2: 
          cancion += "       Two turtle doves\n";

        case 1: 
          cancion += " And a partridge in a pear tree.\n\n";
      }
    }

    System.out.printf("%s", cancion);
  }
}