public class Tiempo 
{
  private int segundosTranscurridos;
	
  public Tiempo()
  {
	this(0);
  }
  
  public Tiempo(int segundosTranscurridos)
  {
    if (segundosTranscurridos < 0 || segundosTranscurridos >= 86400)
		 throw new IllegalArgumentException("Segundos transcurridos fuera del rango 0-86,400");
	 
	this.segundosTranscurridos = segundosTranscurridos;
  }
  
  public void establecer_segundosTrasncurridos(int segundosTranscurridos)
  {
	if (segundosTranscurridos < 0 || segundosTranscurridos >= 86400)
			 throw new IllegalArgumentException("Segundos transcurridos fuera del rango 0 - 86400");
		 
	this.segundosTranscurridos = segundosTranscurridos;	  
  }
  
  public int obtenerHora()
  {
	return segundosTranscurridos / 3600;  
  }
  
  public int obtenerMinuto()
  {
	return residuoHora() / 60;  
  }
  
  public int obtenerSegundo()
  {
	return residuoHora() % 60; 
  }
  
  public int residuoHora()
  {
	return segundosTranscurridos % 3600;  
  }
  
  public String aStringUniversal()
  {
	return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(),
			obtenerSegundo());
  }
  
  public String toString()
  {
	return String.format("%02d:%02d:%02d %s", 
			((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
			obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));  
  }
}
