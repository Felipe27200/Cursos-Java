package com.calculadora;

import com.numero.Racional;
import java.util.Scanner;

public class Main {
	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Racional racional1 = null;
		boolean nuevoRacional = true;
		
		System.out.println("<--- Operaciones con Racionales --->");
		
		System.out.println("\nPara empezar escoja una opción: ");
		System.out.print("[0] Terminar [1] Sumar [2] Restar [3] Multiplicar " +
				"[4] Dividir: ");
		
		int operacion = entrada.nextInt();
		
		while (operacion != 0)
		{
			while (operacion < 1 || operacion > 6)
			{
				System.out.println("\nEscoja una opción");
				System.out.print("[1] Sumar [2] Restar [3] Multiplicar " +
									"[4] Dividir: ");
				operacion = entrada.nextInt();
			}
			
			if (nuevoRacional)
			{
				System.out.println("\nPrimer Racional: ");
				racional1 = crearObjeto();				
			}
			
			System.out.println("\nSegundo Racional: ");
			Racional racional2 = crearObjeto();

			System.out.printf("%n %s%n %s%n", racional1, racional2);
			
			Racional resultado = null;
			
			switch(operacion)
			{
				case 1:
					resultado = Racional.sumar(racional1, racional2);
					break;
				case 2:
					resultado = Racional.restar(racional1, racional2);
					break;
				case 3:
					resultado = Racional.multiplicar(racional1, racional2);
					break;
				case 4:
					resultado = Racional.dividir(racional1, racional2);
					break;
			}
			
			
			String tamanio = "| " + resultado + " |";
			
			separador(tamanio.length());
			System.out.println("| " + resultado + " |");
			separador(tamanio.length());
			
			System.out.print("\nPara ver como decimal pulse 1 sino pulse 0: ");
			int decima = entrada.nextInt();
			
			if (decima == 1)
			{
				System.out.print("\nEscriba las decimas a las que estará redondeado: ");
				decima = entrada.nextInt();
				
				if (decima >= 0)
					System.out.println("\n" + resultado.decimal(decima));
			}
			
			System.out.println("\nPara continuar escoja una opción: ");
			System.out.print("[0] Terminar [1] Sumar [2] Restar [3] Multiplicar" +
								" [4] Dividir: ");
			operacion = entrada.nextInt();
			
			if (operacion != 0)
			{
				System.out.print("\nDesea seguir trabajando con el resultado? [1] Sí [2] No: ");
				
				if (entrada.nextInt() == 1)
				{
					nuevoRacional = false;
					
					racional1 = resultado;
				}
				else
					nuevoRacional = true;				
			}
		}
		
		System.out.println(	"\n********************\n" +
							"* FIN DEL PROGRAMA *\n" + 
						   	"********************");
	}
	
	public static Racional crearObjeto()
	{
		System.out.print("Ingrese el numerador: ");
		int numerador = entrada.nextInt();
		
		System.out.print("Ingrese el denominador: ");
		int denominador = entrada.nextInt();
		
		return new Racional(numerador, denominador);
	}
	
	public static void separador(int tamanio)
	{
		System.out.print("+");
		for (int contador = 1; contador <= tamanio - 2; contador++)
			System.out.print("-");
		
		System.out.println("+");
	}
}
