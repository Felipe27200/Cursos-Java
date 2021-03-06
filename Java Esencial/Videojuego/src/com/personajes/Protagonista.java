// fig. 1.10
package com.personajes;

public class Protagonista extends Personaje{
	private String nombre;
	
	private static final int UNIDADES_DE_SALTO = 10;
	
	public Protagonista(int posicionX, int posicionY, String nombre) {
		super(posicionX, posicionY);
		
		this.nombre = nombre;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public void recibirCura(int puntos)
	{
		puntosDeVida += puntos;
	}
	
	public void saltar() {
		posicionY += UNIDADES_DE_SALTO;
	}
	
	@Override
	public void emitirSonido()
	{
		System.out.println("?Au!");
	}
}
