package com.fechatiempo;

public class Main {
	public static void main(String[] args) {
		FechaYTiempo tiempo1 = new FechaYTiempo();
		FechaYTiempo tiempo2 = new FechaYTiempo(23, 59, 59, 1, 30, 2020);
		
		System.out.println("Tiempo1: \n" + tiempo1);
		System.out.println("\nTiempo2: \n" + tiempo2);
		System.out.println("\naStringUniversal: \n" + tiempo2.aStringUniversal());
		
		tiempo2.incrementarHora();

		System.out.println("\nTiempo2: \n" + tiempo2);
		
		tiempo2.siguienteDia();
		
		System.out.println("\nTiempo2: \n" + tiempo2);
		System.out.println("\naStringUniversal: \n" + tiempo2.aStringUniversal());
	}
}
