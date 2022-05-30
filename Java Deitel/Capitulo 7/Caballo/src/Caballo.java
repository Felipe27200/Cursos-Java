public class Caballo
{
  private int filaActual = 0;
  private int columnaActual = 0;
  
  public Caballo(int filaActual, int columnaActual)
  {
	this.filaActual = filaActual;
	this.columnaActual = columnaActual;
  }
  
  public void establecerFila(int fila)
  {
	filaActual = fila;  
  }
  
  public int obtenerFila()
  {
    return filaActual;
  }
  
  public void establecerColumna(int columna)
  {
	columnaActual = columna;  
  }
  
  public int obtenerColumna()
  {
	return columnaActual;  
  }
  
  public String toString()
  {
	 return filaActual + "*" + columnaActual;
  }
}