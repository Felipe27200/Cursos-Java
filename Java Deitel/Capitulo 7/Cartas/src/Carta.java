public class Carta 
{
  private final String cara;
  private final String palo;
  
  public Carta(String caraCarta, String paloCarta)
  {
	cara = caraCarta;
	palo = paloCarta;
  }
  
  public String toString()
  {
	return cara + " de " + palo;  
  }
}
