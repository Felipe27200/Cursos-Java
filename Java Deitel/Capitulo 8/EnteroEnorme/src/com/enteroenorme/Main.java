package com.enteroenorme;

public class Main {
	public static void main(String[] args) {
		EnteroEnorme numero1 = new EnteroEnorme();
		EnteroEnorme numero2 = new EnteroEnorme();
	
		numero1.parse("1111111111");
		numero2.parse("1111111111");
		
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		
		System.out.printf("%n%30s%n%n", "RELACIONES DE IGUALDAD");

		System.out.printf("%s > %s: %b%n", numero1, numero2, 
							numero1.esMayorQue(numero2));

		System.out.printf("%s < %s: %b%n", numero1, numero2, 
				numero1.esMenorQue(numero2));

		System.out.printf("%n%s = %s: %b%n", numero1, numero2, 
				numero1.esIgualA(numero2));

		System.out.printf("%s != %s: %b%n", numero1, numero2, 
				numero1.noEsIgualA(numero2));

		System.out.printf("%n%s >= %s: %b%n", numero1, numero2, 
				numero1.esMayorOIgualA(numero2));
		System.out.printf("%s <= %s: %b%n", numero1, numero2, 
				numero1.esMenorOIgualA(numero2));
		
		System.out.printf("%n%s == 0: %b%n", numero1, numero1.esCero());
		
		System.out.printf("%n%s + %s = %s%n", numero1, numero2, numero1.sumar(numero2));
		System.out.printf("%n%s - %s = %s%n", numero1, numero2, numero1.restar(numero2));
	}
}

