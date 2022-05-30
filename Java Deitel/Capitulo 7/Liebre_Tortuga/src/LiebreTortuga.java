import java.security.SecureRandom;

public class LiebreTortuga 
{
  public static void main(String[] args)
  {
	SecureRandom accion = new SecureRandom();
	char[] pista = new char[70];
	int posicionTortuga = 0;
	int posicionLiebre = 0;
	
	System.out.println("PUM!!!!!\n" + "Y ARRANCAN!!!!!");
	
	while (posicionTortuga < pista.length && posicionLiebre < pista.length)
	{
	  pista[posicionLiebre] = ' ';
	  pista[posicionTortuga] = ' ';

	  try
	  {
		switch(accion.nextInt(10) + 1)
		{
		  case 1: case 2: case 3: case 4: case 5:
			  posicionTortuga += 3;
			  break;
		  case 6: case 7:
			  posicionTortuga -= 6;
			  break;
		  case 8: case 9: case 10:
			  posicionTortuga++;
		}
		
		switch(accion.nextInt(10) + 1)
		{
		  case 3: case 4:
			  posicionLiebre += 9;
		      break;
		  case 5:
			  posicionLiebre -= 12;
			  break;
		  case 6: case 7: case 8:
			  posicionLiebre++;
		  case 9: case 10:
			  posicionLiebre -= 2;
		}
		
		pista[posicionLiebre] = 'L';
		pista[posicionTortuga] = 'T';
	  }
	  catch (ArrayIndexOutOfBoundsException e)
	  {
		if (posicionTortuga < 0)
			posicionTortuga = 0;
	    if (posicionLiebre < 0)
			posicionLiebre = 0;
	    
	    if (posicionTortuga < pista.length && posicionLiebre < pista.length)
	    {
	  	  pista[posicionLiebre] = 'L';
		  pista[posicionTortuga] = 'T';
	    }
	  }
	  
	  if (posicionTortuga < pista.length && posicionLiebre < pista.length)
	      mostrarPista(pista, posicionTortuga, posicionLiebre);
	}

	if (posicionTortuga == posicionLiebre)
		System.out.println("Parece que la liebre es igual de rápida ¿O lenta? que la tortuga.\n" + 
	      "AMBAS LLEGAN AL MISMO TIEMPO");
	else if (posicionTortuga >= pista.length)
		System.out.println("LA TORTUGA GANA!!! YAY!!!");
	else
		System.out.println("La liebre gana. Que mal!");
  }
  
  public static void mostrarPista(char[] pista, int posicionTortuga, int posicionLiebre)
  {
	System.out.print("INICIO");

	for (int contador = 0; contador < pista.length; contador++)
    {
      if (contador == posicionTortuga && posicionTortuga == posicionLiebre)
    	   System.out.print("OUCH!!!");
      else
      {
        System.out.print(pista[contador]);
      }
    }    

	System.out.println("Meta");
  }
}
