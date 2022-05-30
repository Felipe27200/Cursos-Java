// fig. 1.21
package com.interfaz;

public class Smarthphone implements Reproductor, Telefono{

	@Override
	public void llamar(int numeroTelefono) {
		System.out.println("Llamando a " + numeroTelefono);
	}

	@Override
	public void silenciarMicrofono() {
		System.out.println("Micrófono silenciado");
	}

	@Override
	public void colgar() {
		System.out.println("Llamada Terminada");
	}

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
