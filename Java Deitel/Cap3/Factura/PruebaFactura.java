public class PruebaFactura
{
  public static void main(String[] args)
  {
    Factura factura = new Factura("adfsdf", "Martillo rojo", 48, 10500.02);

    System.out.printf("El n�mero de pieza es: %s%n", factura.obtenernPieza());
    System.out.printf("El descripci�n de pieza es: %s%n", factura.obtenerdPieza());
    System.out.printf("Cantidad de art�culo: %d%n", factura.obtenerArticulo());
    System.out.printf("El precio de art�culo: $%.2f%n%n", factura.obtenerPrecio());

    System.out.printf("El valor es: $%.2f%n", factura.montoFactura());
  }
}