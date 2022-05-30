package com.enteroenorme;

public class EnteroEnorme {
	private int[] entero = new int[40];
	private int length;
	
	public void parse(String numero)
	{
		if (numero.length() < 0 || numero.length() > 39)
			throw new IllegalArgumentException("NÚMERO FUERA DE LÍMITES");
		
		if (numero.charAt(0) == '0')
		{
			length = 1;
		}
		else {
			length = numero.length();
			int indiceEntero = numero.length() - 1;
		
			for(int indice = 0; indice < numero.length(); indice++)
			{
				if (indice == 0 && numero.charAt(0) == '-')
					continue;
				else
					entero[indiceEntero - indice] = Integer.parseInt(String.valueOf(numero.charAt(indice)));
			}
		
			if (numero.charAt(0) == '-')
			{
				length--;
				entero[length - 1] *= -1;
			}
		}
	}
	
	public int length()
	{
		if (length <= 0) {
			for(int indice = entero.length - 1; indice >= 0; indice--)
			{
				if (entero[indice] != 0)
				{
					length += indice + 1;
					break;
				}
				
				if (indice == 0)
					length++;
			}
		}
		
		return length;
	}
		
	public boolean esLongitudMayor(int longitud2) {
		if (length > longitud2)
			return true;
		else
			return false;
	}

	public boolean esLongitudMenor(int longitud2) {
		if (length < longitud2)
			return true;
		else
			return false;
	}
	
	public boolean esNegativo()
	{
		if (entero[length() - 1] < 0)
			return true;
		else
			return false;
	}
	
	public void modificarValorRelativo()
	{
		entero[length() - 1] *= -1;
	}
	
	public int getElemento(int indice)
	{
		return entero[indice];
	}
	
	private void setElemento(int indice, int nuevoValor)
	{
		entero[indice] = nuevoValor;
	}
	
	public boolean esMayorQue(EnteroEnorme numero2)
	{
		if (!esNegativo())
		{
			if(numero2.esNegativo())
				return true;
			else if (esLongitudMayor(numero2.length()))
				return true;
			else if (esLongitudMenor(numero2.length()))
				return false;
		}
		else
		{
			if (!numero2.esNegativo())
				return false;
			else if (esLongitudMayor(numero2.length()))
				return false;
			else if (esLongitudMenor(numero2.length()))
				return true;
		}

		boolean esMayor = false;
		int signo = 1;
		
		if (esNegativo())
			signo = -1;
			
		for (int indice = length - 1; indice >= 0; indice--)
		{
			if (indice != length - 1)
			{
				if (entero[indice] * signo > numero2.getElemento(indice) * signo)
				{
					esMayor = true;
					break;
				}
				else if (entero[indice] * signo < numero2.getElemento(indice) * signo)
					break;
			}
			else {
				if (entero[indice] > numero2.getElemento(indice))
				{
					esMayor = true;
					break;
				}
				else if (entero[indice] < numero2.getElemento(indice))
					break;
			}
		}
			
		return esMayor;			
	}
	
	public boolean esMenorQue(EnteroEnorme numero2)
	{
		if (numero2.esMayorQue(this))
			return true;
		else
			return false;
	}
	
	public boolean esIgualA(EnteroEnorme numero2)
	{
		if (!esMenorQue(numero2) && !esMayorQue(numero2))
			return true;
		else
			return false;
	}
	
	public boolean noEsIgualA(EnteroEnorme numero2)
	{
		if (!esIgualA(numero2))
			return true;
		else 
			return false;
	}
	
	public boolean esMayorOIgualA(EnteroEnorme numero2)
	{
		if (esMayorQue(numero2) || esIgualA(numero2))
			return true;
		else
			return false;
	}
	
	public boolean esMenorOIgualA(EnteroEnorme numero2)
	{
		if (esMenorQue(numero2) || esIgualA(numero2))
			return true;
		else
			return false;
	}
	
	public boolean esCero() {
		if (length == 1 && entero[0] == 0)
			return true;
		else
			return false;
	}
	
	public EnteroEnorme sumar(EnteroEnorme numero2)
	{
		EnteroEnorme suma = new EnteroEnorme();
		
		if (esNegativo() && numero2.esNegativo())
		{
			modificarValorRelativo();
			numero2.modificarValorRelativo();
			
			sumarElementos(numero2, suma);
			
			modificarValorRelativo();
			numero2.modificarValorRelativo();
			
			suma.modificarValorRelativo();
		}
		else if(!esNegativo() && !numero2.esNegativo())
		{
			sumarElementos(numero2, suma);
		}
		else
		{
			numero2.modificarValorRelativo();
			suma = restar(numero2);
			numero2.modificarValorRelativo();
		}
		
		return suma;
	}
	
	private void sumarElementos(EnteroEnorme numero2, EnteroEnorme suma)
	{
		int longitud;
		int excedente = 0;
		
		if (esLongitudMayor(numero2.length()))
			longitud = length();
		else
			longitud = numero2.length;
					
		for (int i = 0; i < longitud; i++)
		{
			int sumaElementos = getElemento(i) + numero2.getElemento(i);
			sumaElementos += excedente; 
					
			if ( sumaElementos > 9)
			{
				suma.setElemento(i, sumaElementos % 10);
				excedente = sumaElementos / 10;
			}
			else {
				suma.setElemento(i, sumaElementos);
				excedente = 0;				
			}
			
			if (excedente > 0 && i == longitud - 1)
				longitud++;
		}
	}
	
	public EnteroEnorme restar(EnteroEnorme numero2)
	{
		EnteroEnorme diferencia = new EnteroEnorme();
		
		if (esNegativo() && numero2.esNegativo())
		{
			modificarValorRelativo();
			numero2.modificarValorRelativo();
			
			if (esLongitudMayor(numero2.length()) || esMayorQue(numero2))
			{
				restarElementos(this, numero2, diferencia);

				diferencia.modificarValorRelativo();
			}
			else {
				restarElementos(numero2, this,diferencia);
			}
			
			modificarValorRelativo();
			numero2.modificarValorRelativo();
		}
		else if (!esNegativo() && !numero2.esNegativo())
		{
			if (esLongitudMayor(numero2.length()) || esMayorQue(numero2))
				restarElementos(this, numero2, diferencia);
			else {
				restarElementos(numero2, this, diferencia);
				
				diferencia.modificarValorRelativo();
			}
		}
		else
		{
			numero2.modificarValorRelativo();
			diferencia = sumar(numero2);
			numero2.modificarValorRelativo();
		}

		return diferencia;
	}
	
	private void restarElementos(EnteroEnorme numero1, EnteroEnorme numero2, EnteroEnorme diferencia)
	{
		int suprimir = 0;
		
		for (int i = 0; i < numero1.length(); i++)
		{
			int restaElementos = (numero1.getElemento(i) - suprimir) - numero2.getElemento(i);
			
			if (restaElementos < 0)
			{
				diferencia.setElemento(i, restaElementos * -1);
				suprimir = 1;
			}
			else {
				diferencia.setElemento(i, restaElementos);
				suprimir = 0;
			}
		}
	}
	
	public String toString() {
		String numero = "";
		
		for (int indice = length() - 1; indice >= 0; indice--)
		{
			numero += Integer.toString(entero[indice]);
		}
		
		return numero;
	}
	
}
