package com.numero;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional()
	{
		denominador = 0;
		numerador = 0;
	}
	
	public Racional(int numerador, int denominador)
	{
		int dividendo, divisor;
		int residuo = 1;
		
		if (numerador >= denominador)
		{
			dividendo = numerador;
			divisor = denominador;
		}
		else {
			dividendo = denominador;
			divisor = numerador;			
		}

	    if (dividendo != 0 && divisor != 0)
	    {
	      while (residuo != 0)
	      {
	        residuo = dividendo % divisor;

	        dividendo = divisor;
	        divisor = residuo;
	      }
	    }
	    else {
	    	dividendo = 1;
	    }
	    
	    this.numerador = numerador / dividendo;
	    this.denominador = denominador / dividendo;
	}
	
	public void setNumerador(int numerador)
	{
		this.numerador = numerador;
	}
	
	public int getNumerador()
	{
		return numerador;
	}
	
	public void setDenominador(int denominador)
	{
		this.denominador = denominador;
	}
	
	public int getDenominador()
	{
		return denominador;
	}
	
	public static void simplificar(Racional racional)
	{
		int dividendo, divisor;
		int residuo = 1;
		
		// Se determina cual será el dividendo y el divisor
		if (racional.getNumerador() >= racional.getDenominador())
		{
			dividendo = racional.getNumerador();
			divisor = racional.getDenominador();
		}
		else {
			dividendo = racional.getDenominador();
			divisor = racional.getNumerador();			
		}
		
		// Se busca el MCD del numerador y el denominador
	    if (dividendo != 0 && divisor != 0)
	    {
	      while (residuo != 0)
	      {
	        residuo = dividendo % divisor;

	        dividendo = divisor;
	        divisor = residuo;
	      }
	    }
	    else {
	    	dividendo = 1;
	    }
	    
	    if (dividendo < 0)
	    	dividendo *= -1;
	    
	    racional.setNumerador(racional.getNumerador() / dividendo);
	    racional.setDenominador(racional.getDenominador() / dividendo);
	}
	
	public static void homogeneo(Racional racional1, Racional racional2)
	{
		racional1.setNumerador(racional1.getNumerador() * racional2.getDenominador());
		racional2.setNumerador(racional2.getNumerador() * racional1.getDenominador());
		
		racional1.setDenominador(racional1.getDenominador() * racional2.getDenominador());
		racional2.setDenominador(racional1.getDenominador());
	}
	
	public static Racional sumar(Racional racional1, Racional racional2)
	{
		Racional suma = new Racional();
		
		if (!esDenominadorIgual(racional1, racional2))
		{
			homogeneo(racional1, racional2);
		}

		suma.setNumerador(racional1.getNumerador() + racional2.getNumerador());
		suma.setDenominador(racional1.getDenominador());
		
		simplificar(suma);
		
		return suma;
	}
	
	public static Racional restar(Racional racional1, Racional racional2)
	{
		Racional resta = new Racional();
		
		if (!esDenominadorIgual(racional1, racional2))
		{
			homogeneo(racional1, racional2);
		}

		resta.setNumerador(racional1.getNumerador() - racional2.getNumerador());
		resta.setDenominador(racional1.getDenominador());
		
		simplificar(resta);
		
		return resta;
	}
	
	public static Racional multiplicar(Racional racional1, Racional racional2)
	{
		Racional producto = new Racional(racional1.getNumerador() * racional2.getNumerador(),
											   racional1.getDenominador() * racional2.getDenominador());
		
		simplificar(producto);
		
		return producto;
	}
	
	public static Racional dividir(Racional racional1, Racional racional2)
	{
		Racional cociente = new Racional(racional1.getNumerador() * racional2.getDenominador(),
								racional1.getDenominador() * racional2.getNumerador());
		
		simplificar(cociente);
		
		return cociente;
	}
	
	public static boolean esDenominadorIgual(Racional racional1, Racional racional2)
	{
		if (racional1.getDenominador() == racional2.getDenominador())
			return true;
		else
			return false;
	}
	
	public String decimal(int decimas)
	{
		if (getNumerador() != 0 && getDenominador() !=0)
		{
			BigDecimal numerador = BigDecimal.valueOf(getNumerador());
			BigDecimal denominador = BigDecimal.valueOf(getDenominador());
			
			BigDecimal resultado = numerador.divide(denominador, decimas, RoundingMode.HALF_UP);
			
			return String.format("%s", resultado);
		}
		else
			return String.format("LA DIVISIÓN NO ES POSIBLE");
	}
	
	public String toString() {
		return String.format("%d / %d", getNumerador(), getDenominador());
	}
}
