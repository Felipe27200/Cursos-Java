// fig. 1.8
package com.matematicas.calculadora;

import java.util.Scanner;

import com.matematicas.rutinas.Cadena;
import com.matematicas.rutinas.Matematicas;

public class PruebaPaquetes {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el número 1: ");
		int numero1 = entrada.nextInt();

		System.out.print("Ingrese el número 2: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("\n" + Cadena.mayuscula("aritmética"));
		
		System.out.println("\nLa suma es: " + 
				Matematicas.sumar(numero1, numero2));

		System.out.println("La resta es: " + 
				Matematicas.restar(numero1, numero2));
	}
}
