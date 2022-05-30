public class Rectangulo 
{
  private double longitud = 1;
  private double anchura = 1;
  
  public void establecerLongitud(double longitud)
  {
	if (longitud <= 0.0 || longitud >= 20.0)
		throw new IllegalArgumentException("Longitud debe ser mayor a 0.0 y menor a 20.0");
	
	this.longitud = longitud;
  }
  
  public double obtenerLongitud()
  {
	return longitud;
  }

  public void establecerAnchura(double anchura)
  {
	if (anchura <= 0.0 || anchura >= 20.0)
		throw new IllegalArgumentException("Anchura debe ser mayor a 0.0 y menor a 20.0");
	
	this.anchura = anchura;
  }
  
  public double obtenerAnchura()
  {
	return anchura;
  }
  
  public double perimetro()
  {
	return (longitud * 2) + (anchura * 2);
  }
  
  public double area()
  {
	return longitud * anchura;  
  }
}
