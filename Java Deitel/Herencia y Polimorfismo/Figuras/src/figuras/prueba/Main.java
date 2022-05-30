package figuras.prueba;

import figuras.*;
import figuras.bidimensional.*;
import figuras.tridimensional.*;

public class Main {
	public static void main(String[] args)
	{
		// Figuras 2D
		Circulo circulo = new Circulo(5);
		Cuadrado cuadrado = new Cuadrado(5);
		Triangulo triangulo = new Triangulo(5, 5);
		
		// Figuras 3D
		Cubo cubo = new Cubo(5);
		Esfera esfera = new Esfera(5);
		Tetraedro tetraedro = new Tetraedro(5);
		
		Figuras[] figuras = new Figuras[6];
		
		figuras[0] = circulo;
		figuras[1] = cuadrado;
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = esfera;
		figuras[5] = tetraedro;
		
		System.out.println(">>> Operaciones con Figuras <<<\n");
		
		for (Figuras figuraActual : figuras)
		{
			System.out.println(figuraActual);
			System.out.printf("Área: %.2f%n", figuraActual.getArea());
			
			if (figuraActual instanceof FiguraTridimensional)
			{
				FiguraTridimensional figura3D = (FiguraTridimensional) figuraActual;
				
				System.out.printf("Volumen: %.2f%n", figura3D.getVolumen());
			}
			
			System.out.println();
		}
	}
}
