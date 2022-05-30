// fig. 1.13
package com.personajes;

public class Dragon extends Enemigo{
	private static final int PUNTOS_DANO = 80;
	
	public Dragon(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	@Override
	public int obtenerPuntosDano()
	{
		return PUNTOS_DANO;
	}
}