package com.conjunto;

public class ConjuntoEnteros {
	
	private boolean enteros[] = new boolean[101];
	
	public boolean getElemento(int indice)
	{
		return enteros[indice];
	}
	
	public void insertarElemento(int numero)
	{
		if (numero < 0 || numero >= enteros.length)
			throw new IllegalArgumentException("NÚMERO FUERA DE RANGO");
		
		if (enteros[numero])
		{
			System.out.println("El número ya está en el conjunto");
		}
		else
			enteros[numero] = true;
	}
	
	public void eliminarElemento(int numero)
	{
		if (numero < 0 || numero >= enteros.length)
			throw new IllegalArgumentException("NÚMERO FUERA DE RANGO");

		enteros[numero] = false;
	}
	
	public static ConjuntoEnteros union(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2)
	{
		ConjuntoEnteros nuevoConjunto = new ConjuntoEnteros();
		
		for(int indice = 0; indice < nuevoConjunto.length(); indice++)
		{
			if (conjunto1.getElemento(indice) || conjunto2.getElemento(indice))
			{
				nuevoConjunto.insertarElemento(indice);
			}
		}
		
		return nuevoConjunto;
	}
	
	public static ConjuntoEnteros interseccion(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2)
	{
		ConjuntoEnteros nuevoConjunto = new ConjuntoEnteros();
		
		for(int indice = 0; indice < nuevoConjunto.length(); indice++)
		{
			if (conjunto1.getElemento(indice) &&  conjunto2.getElemento(indice))
			{
				nuevoConjunto.insertarElemento(indice);
			}
		}
		
		return nuevoConjunto;
	}
	
	public void esIgualA(ConjuntoEnteros conjunto2)
	{
		boolean igualdad = true;
		
		for (int i = 0; i < enteros.length; i++) {
			if(getElemento(i) != conjunto2.getElemento(i))
			{
				igualdad = false;
				break;
			}	
		}
		
		System.out.printf("Los conjuntos %sson iguales%n", 
				(igualdad) ? "" : "no ");
	}
	
	public int length()
	{
		return enteros.length;
	}
	
	public String toString()
	{
		String conjunto = "";
		
		for (int indice = 0; indice < enteros.length; indice++)
		{
			if (enteros[indice])
				conjunto += indice + " "; 
		}
		
		if (conjunto == "")
			return "---";
		else
			return conjunto;
	}
}
