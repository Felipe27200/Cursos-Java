public class PruebaFactura
{
  public static void main(String[] args)
  {
    Factura factura = new Factura("adfsdf", "Martillo rojo", 48, 10500.02);

    System.out.printf("El número de pieza es: %s%n", factura.obtenernPieza());
    System.out.printf("El descripción de pieza es: %s%n", factura.obtenerdPieza());
    System.out.printf("Cantidad de artículo: %d%n", factura.obtenerArticulo());
    System.out.printf("El precio de artículo: $%.2f%n%n", factura.obtenerPrecio());

    System.out.printf("El valor es: $%.2f%n", factura.montoFactura());
  }
}