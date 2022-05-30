// fig. 1.19
package com.interfaz;

public class ReproductorDeAudio implements Reproductor{
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Audio");
	}

	@Override
	public void pausar() {
		System.out.println("Audio pausado");
	}

	@Override
	public void parar() {
		System.out.println("Audio parado");
	}

	@Override
	public void rebobinar(int segundos) {
		System.out.println("Rebobinando Audio " + segundos + " segundos");
	}

	@Override
	public void adelantar(int segundos) {
		System.out.println("Adelantado Audio " + segundos + " segundos");
	}
}
