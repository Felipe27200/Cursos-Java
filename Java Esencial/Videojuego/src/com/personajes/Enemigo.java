// fig. 1.11
package com.personajes;

public class Enemigo extends Personaje{
	private static final int PUNTOS_DANO = 10;
	
	public Enemigo(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	public int obtenerPuntosDano()
	{
		return PUNTOS_DANO;
	}
	
	@Override
	public void emitirSonido()
	{
		System.out.println("grrrr");
	}
}
