import java.security.SecureRandom;
import java.util.Arrays;

public class PaqueteDeCartas 
{
  private Carta[] paquete;
  private int cartaActual;
  private static final int NUMERO_DE_CARTAS = 52;
  private static final SecureRandom numerosAleatorios = new SecureRandom();
  
  public PaqueteDeCartas()
  {
	String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",  
            "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey"};
	
	String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};
	
	paquete = new Carta[NUMERO_DE_CARTAS];
	cartaActual = 0;
	
	for (int cuenta = 0; cuenta < paquete.length; cuenta++)
		paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
  }
  
  public void barajar()
  {
	cartaActual = 0;
	
	for (int primera = 0; primera < paquete.length; primera++)
	{
	  int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
	  
	  Carta temporal = paquete[primera];
	  paquete[primera] = paquete[segunda];
	  paquete[segunda] = temporal;
	}
  }
  
  public Carta repartirCarta()
  {
	  if (cartaActual < paquete.length)
		  return paquete[cartaActual++];
	  else
		  return null;
  }
  
  public String[] mano()
  {
	String[] manosPoker = new String[3];
	
	manosPoker[0] = valorRepetido();
	manosPoker[1] = corrida();
	manosPoker[2] = escalera();
	
	if (manosPoker[1] == "Corrida" && manosPoker[2] == "Escalera")
		manosPoker[2] = "";
			
	
	return manosPoker;
  }
  
  public String valorRepetido()
  {
    int[] mano = new int[2];
    int segundaMano = 0;
    String[] cara = new String[2];
    String tipoMano = "";
    
    for (int carta = 0; carta < 4; carta++)
    {
      if (paquete[carta].obtenerCara() != cara[0] && paquete[carta].obtenerCara() != cara[1])
      {	  
    	for (int cartaComparar = 0; cartaComparar < 5; cartaComparar++)
        {
          if (carta != cartaComparar && 
            paquete[carta].obtenerCara() == paquete[cartaComparar].obtenerCara())
          {
            mano[segundaMano]++;
            cara[segundaMano] = paquete[carta].obtenerCara();
          }
        }
      }

      if (mano[0] > 0)
      	segundaMano = 1;
    }

    if (mano[1] > 0)
    {
      switch (mano[0] + mano[1])
      {
        case 2:
          tipoMano = "Doble Par";
          break;

        case 3:
          tipoMano = "Full House";
      }
    }
    else
      switch (mano[0])
      {
        case 1:
        	tipoMano = "Par";
        	break;
 
        case 2:
        	tipoMano = "Tercios";
        	break;
        case 3:
        	tipoMano = "Póker";
      }
    
    return tipoMano;
  }
  
  public String corrida()
  {
    int corrida = 0;
	  
	for (int carta = 1; carta < 5; carta++)
	{
	  if (paquete[0].obtenerPalo() == paquete[carta].obtenerPalo())
		  corrida++;
	}
	
	if (corrida == 4)
		return "Corrida";
	else
		return "";
  }
  
  public String escalera()
  {
	  int[] valorDeLaCarta = new int[5];
	  boolean escalera = true;
	  
	  for (int carta = 0; carta < valorDeLaCarta.length; carta++)
	  {
		 switch (paquete[carta].obtenerCara())
		 {
		   case "As":
			 valorDeLaCarta[carta] = 1;
			 break;

		   case "Dos":
			 valorDeLaCarta[carta] = 2;
			 break;

		   case "Tres":
			 valorDeLaCarta[carta] = 3;
			 break;

		   case "Cuatro":
			 valorDeLaCarta[carta] = 4;
			 break;

		   case "Cinco":
			 valorDeLaCarta[carta] = 5;
			 break;

		   case "Seis":
			 valorDeLaCarta[carta] = 6;
			 break;

		   case "Siete":
			 valorDeLaCarta[carta] = 7;
			 break;

		   case "Ocho":
			 valorDeLaCarta[carta] = 8;
			 break;

		   case "Nueve":
			 valorDeLaCarta[carta] = 9;
			 break;

		   case "Diez":
			 valorDeLaCarta[carta] = 10;
			 break;

		   case "Joker":
			 valorDeLaCarta[carta] = 11;
			 break;

		   case "Reina":
			 valorDeLaCarta[carta] = 12;
			 break;

		   case "Rey":
			 valorDeLaCarta[carta] = 13;
		 }
	  }
	  
	  Arrays.sort(valorDeLaCarta);
	  
	  if (valorDeLaCarta[0] == 1 && valorDeLaCarta[4] == 13)
	  {
		  valorDeLaCarta[0] = 14;
		  Arrays.sort(valorDeLaCarta);
	  }
	  
	  for (int carta = 1; carta < valorDeLaCarta.length; carta++)
	  {
		if (valorDeLaCarta[0] + carta != valorDeLaCarta[carta])
		{
		  escalera = false;
		  break;
		}
	  }
	  
	  if (escalera == true)
		  return "Escalera";
	  else
		  return "";	
  }
}
