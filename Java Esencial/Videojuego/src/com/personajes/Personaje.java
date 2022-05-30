// fig. 1.9
package com.personajes;

public class Personaje {
	protected int puntosDeVida = 100;
	protected int posicionX = 0;
	protected int posicionY = 0;
	
	public Personaje(int posicionX, int posicionY)
	{
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	public void recibirDanos(int puntos)
	{
		puntosDeVida -= puntos;
	}
	
	public void moverALaDerecha(int unidades)
	{
		posicionX += unidades;
	}

	public void moverALaIzquierda(int unidades)
	{
		posicionY += unidades;
	}
	
	public void emitirSonido()
	{
		System.out.println("¡Ay!");
	}
}
