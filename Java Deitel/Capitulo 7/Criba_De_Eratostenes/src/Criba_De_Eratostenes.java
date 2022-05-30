public class Criba_De_Eratostenes 
{
  public static void main(String[] args)
  {
	boolean[] primos = new boolean[1000];
	
	for (int indice = 2; indice < primos.length; indice++)
		primos[indice] = true;
	
	for (int indice = 2; indice < primos.length; indice++)
	{
		if (primos[indice])
		  multiplos(primos, indice);
		
		if (indice * indice > 999)
		  break;
	}
	
	mostrarArreglo(primos);
  }
  
  public static void multiplos(boolean[] primos, int indice)
  {
	for (int numero = indice; numero < primos.length; numero++)
	{
      if (numero * indice <= 999)
	  primos[numero * indice] = false;	
	}
  }
  
  public static void mostrarArreglo(boolean[] primos)
  {
    int contador = 0;
    
	for (int indice = 1; indice < primos.length; indice++)
	{
	  boolean espacio = false;
	  
	  if (primos[indice])
      {
		System.out.printf("%-4d", indice);
        contador++; espacio = true;
      }
		
	  if (contador != 0 && contador % 17 == 0 && espacio == true)
		 System.out.println("\n");
	}
  }
}
