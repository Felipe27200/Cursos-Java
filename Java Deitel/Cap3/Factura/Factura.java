public class Factura
{
  private String nPieza;
  private String dPieza;
  private int articulo;
  private double precio;

  public Factura(String nPieza, String dPieza,
    int articulo, double precio)
  {
    this.nPieza = nPieza;

    this.dPieza = dPieza;

    if (articulo > 0)
       this.articulo = articulo;
    if (articulo < 0)
      articulo = 0;
      this.articulo = articulo;
 
    if (precio > 0.0)
      this.precio = precio;

    if (precio < 0.0)
       precio = 0.0;
       this.precio = precio;

    if (articulo <= 0)
       precio = 0.0;
       this.precio = precio; 
  }

  public double montoFactura()
  {
    return precio = precio * articulo;
  }

  public void establecerArticulo(int articulo)
  {
    this.articulo = articulo;
  }

  public int obtenerArticulo()
  {
    return articulo;
  }

  public void establecerPrecio(double precio)
  {
    this.precio = precio;
  }

  public double obtenerPrecio()
  {
    return precio;
  }

  public void establecernPieza(String nPieza)
  {
    this.nPieza = nPieza;
  }

  public String obtenernPieza()
  {
    return nPieza;
  }

  public void establecerdPieza(String dPieza)
  {
    this.dPieza = dPieza;
  }

  public String obtenerdPieza()
  {
    return dPieza;
  }
}