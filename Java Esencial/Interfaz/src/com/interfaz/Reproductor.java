// fig. 1.17
package com.interfaz;

public interface Reproductor {
	public void reproducir();

	public void pausar(); 
	
	public void parar();
	
	public void rebobinar(int segundos);
	
	public void adelantar(int segundos);
}
