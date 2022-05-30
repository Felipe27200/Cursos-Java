package com.conjunto;

import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
	public static final SecureRandom numeroAleatorio = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
		ConjuntoEnteros conjunto2 = new ConjuntoEnteros();
		ConjuntoEnteros conjunto3 = new ConjuntoEnteros();
		
		inicializarConjunto(conjunto1);
		inicializarConjunto(conjunto2);
		inicializarConjunto(conjunto3);
		
		System.out.println("Conjunto 1: " + conjunto1);
		System.out.println("Conjunto 2: " + conjunto2);
		System.out.println("Conjunto 3: " + conjunto3);
		
		System.out.println();
		
		conjunto1.esIgualA(conjunto2);
		
		System.out.println("\nUnión Teórica conjunto 1 y conjunto 2: " +  ConjuntoEnteros.union(conjunto1, conjunto2));
		
		System.out.println("\nConjunto 1: " + conjunto1);
		System.out.println("Conjunto 2: " + conjunto2);

		System.out.println("\nIntersección teórica conjunto1 y conjunto2: " + ConjuntoEnteros.interseccion(conjunto1, conjunto2));
		
		System.out.print("\nQue elemento del conjunto 3 desea eliminar: ");
		conjunto3.eliminarElemento(entrada.nextInt());
		
		System.out.print("Que elemento desea insertar en ese conjunto: ");
		conjunto3.insertarElemento(entrada.nextInt());
		
		System.out.println("\nConjunto3: " + conjunto3);
		
		ConjuntoEnteros conjunto4 = conjunto3;
		
		conjunto3.esIgualA(conjunto4);
	}

	public static void inicializarConjunto(ConjuntoEnteros conjunto)
	{
		for (int indice = 0; indice < conjunto.length(); indice++)
		{
			if (numeroAleatorio.nextBoolean())
				conjunto.insertarElemento(indice);
		}
	}
}
