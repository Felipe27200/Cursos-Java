public class PruebaPaqueteDeCartas 
{
  public static void main(String[] args)
  {
	PaqueteDeCartas mano1 = new PaqueteDeCartas();
    PaqueteDeCartas mano2 = new PaqueteDeCartas();
    
    mano1.barajar();
    mano2.barajar();
    
    System.out.printf("%-25s%-20s%n", "Mano1:", "Mano2:");
    
	for (int carta = 1; carta <= 5; carta++)
	{
	  System.out.printf("%-25s%-20s%n", mano1.repartirCarta(), mano2.repartirCarta());
	}
	
	System.out.println();
	
    int valor_mano1 = comprobarMano(mano1.mano());
    int valor_mano2 = comprobarMano(mano2.mano());
    System.out.println();
    
    if (valor_mano1 > valor_mano2)
    	System.out.println("La mejor mano es: Mano1");
    else if (valor_mano2 > valor_mano1)
    	System.out.println("La mejor mano es: Mano2");
    else
    	System.out.println("EMPATE");
  }
  
  public static int comprobarMano(String[] mano)
  {
    String valor_mano = "";
	  
	for (int contador = 0; contador < mano.length; contador++)
    {
      if (mano[contador] != null && mano[contador] != "")
      {
    	  valor_mano = mano[contador];
          break;
      }
    }
	
	System.out.printf("%-25s", valor_mano);

	return determinarValorMano(valor_mano);
  }
  
  public static int determinarValorMano(String mano)
  {
	int valor_mano = 0;
	
	switch (mano)
	{
	  case "Par":
		  valor_mano = 1;
		  break;

	  case "Doble Par":
		  valor_mano = 2;
		  break;

	  case "Tercios":
		  valor_mano = 3;
		  break;

	  case "Escalera":
		  valor_mano = 4;
		  break;

	  case "Corrida":
		  valor_mano = 5;
		  break;

	  case "Full House":
		  valor_mano = 6;
		  break;

	  case "Póker":
		  valor_mano = 7;
		  break;
	}
	
	return valor_mano;
  }
}
