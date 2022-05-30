// fig. 1.12
package com.personajes;

public class Orco extends Enemigo{
	public Orco(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Noooo");
	}
}
