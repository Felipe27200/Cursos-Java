/*Escribir expresiones lógicamente equivalentes para las siguientes
expresiones:
a) !(x < 5) && !(y >= 7)  equivalente !((x < 5) || (y >= 7))
b) !(a == b) || !(g != 5) equivalente !((a == b) && (g != 5))
c) !((x <= 8) && (y > 4)) equivalente !(x <= 8) || !(y > 4)
d) !((i > 4) || (j <= 6)) equivalente !(i > 4) && !(j <= 6)
*/

public class Morgan
{
  public static void main(String[] args)
  {
    int x = 4, y = 7;
    int a = 5, b = 4, g = 6, i = 4, j = 6;

    System.out.printf("%s: %b%n%s: %b%n%n%s: %b%n%s: %b%n%n",
        "!(x < 5) && !(y >= 7)", !(x < 5) && !(y >= 7),
        "!((x < 5) || (y >= 7))", !((x < 5) || (y >= 7)),
        "!(a == b) || !(g != 5)", !(a == b) || !(g != 5),
        "!((a == b) && (g != 5))", !((a == b) && (g != 5)));

    System.out.printf("%s: %b%n%s: %b%n%n%s: %b%n%s: %b%n%n",
        "!((x <= 8) && (y > 4))", !((x <= 8) && (y > 4)),
        "!(x <= 8) || !(y > 4)", !(x <= 8) || !(y > 4),
        "!((i > 4) || (j <= 6))", !((i > 4) || (j <= 6)),
        "!(i > 4) && !(j <= 6)", !(i > 4) && !(j <= 6));
  }
}