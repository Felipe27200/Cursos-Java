public enum LuzSemaforo 
{
  ROJO("20 SEGUNDOS"),
  VERDE("30 SEGUNDOS"),
  AMARILLO("40 SEGUNDOS");
  private final String duracion;
  
  LuzSemaforo(String duracion)
  {
	this.duracion = duracion;
  }
  
  public String obtenerDuracion()
  {
	return duracion;
  }
}
