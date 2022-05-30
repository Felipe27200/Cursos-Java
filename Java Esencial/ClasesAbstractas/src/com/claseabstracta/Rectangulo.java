// fig. 1.16
package com.claseabstracta;

public class Rectangulo extends Figura2D{
	private double anchura;
	private double altura;
	
	public Rectangulo(double anchura, double altura)
	{
		this.anchura = anchura;
		this.altura = altura;
	}
	
	@Override
	public double obtenerArea() {
		return altura * anchura;
	}

	@Override
	public double obtenerPerimetro() {
		return 2 * anchura * 2 * altura;
	}
}
