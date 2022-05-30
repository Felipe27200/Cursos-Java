public class Carta 
{
  private final String cara;
  private final String palo;
  
  public Carta(String caraCarta, String paloCarta)
  {
	cara = caraCarta;
	palo = paloCarta;
  }
  
  public String obtenerCara()
  {
	return cara;  
  }
  
  public String obtenerPalo()
  {
	return palo;
  }
  
  public String toString()
  {
	return cara + " de " + palo;  
  }
}
