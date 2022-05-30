public class Tiempo2 
{
  private int hora;
  private int minuto;
  private int segundo;
  
  public Tiempo2()
  {
	this(0, 0 ,0);
  }
  
  public Tiempo2(int hora)
  {
	this(hora, 0, 0);
  }
  
  public Tiempo2(int hora, int minuto)
  {
	this(hora, minuto, 0);
  }
  
  public Tiempo2(int hora, int minuto, int segundo)
  {
	if (hora < 0 || hora >= 24)
		throw new IllegalArgumentException("Hora debe estar entre 0 y 23");
	
	if (minuto < 0 || minuto >= 60)
		throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");

	if (segundo < 0 || segundo >= 60)
		throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
	
	this.hora = hora;
	this.minuto = minuto;
	this.segundo = segundo;
  }
  
  public Tiempo2(Tiempo2 tiempo)
  {
	this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());  
  }
  
  public void establecerTiempo(int hora, int minuto, int segundo)
  {
    try
    {
	  establecerHora(hora);
	  establecerMinuto(minuto);
	  establecerSegundo(segundo);
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }
  }
  
  public void establecerHora(int hora)
  {
	if (hora < 0 || hora >= 24)
		throw new IllegalArgumentException("Hora debe estar entre 0 y 23");
	
	this.hora = hora;
  }
  
  public void establecerMinuto(int minuto)
  {
	if (minuto < 0 || minuto <= 60)
		throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");

	this.minuto = minuto;
  }
  
  public void establecerSegundo(int segundo)
  {
	if (segundo < 0 || segundo <= 60)
		throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

    this.segundo = segundo;
  }
  
  public void incrementarHora()
  {
	switch (hora)
	{
	  case 23:
		  hora = 0;
	      break;
	      
	  default:
		  hora++;
	}
  }
  
  public void incrementarMinuto()
  {
	switch(minuto)
	{
	  case 59:
		  minuto = 0;
		  incrementarHora();
	      break;
	      
	  default:
		  minuto++;
	}
  }
  
  public void incrementarSegundo()
  {
	switch(segundo)
	{
	  case 59:
		  segundo = 0;
		  incrementarMinuto();
		  break;
		  
	  default:
		  segundo++;
	}
  }
  
  public int obtenerHora()
  {
	return hora;
  }
  
  public int obtenerMinuto()
  {
	return minuto;
  }
  
  public int obtenerSegundo()
  {
	return segundo;
  }
  
  public String aStringUniversal()
  {
	return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
  }
  
  public String toString()
  {
	return String.format("%02d:%02d:%02d %s", 
			((obtenerHora() == 12) ? 12 : obtenerHora() % 12),
			obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
  }
}
