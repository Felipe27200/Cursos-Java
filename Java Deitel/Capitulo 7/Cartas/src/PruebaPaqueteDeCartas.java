public class PruebaPaqueteDeCartas 
{
  public static void main(String[] args)
  {
	PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
	miPaqueteDeCartas.barajar();
	
	for (int carta = 1; carta <= 52; carta++)
	{
	  System.out.printf("%-20s", miPaqueteDeCartas.repartirCarta());
	  
	  if (carta % 4 == 0)
		  System.out.println();
	}
  }
}
