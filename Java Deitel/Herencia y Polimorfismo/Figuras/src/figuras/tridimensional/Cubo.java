package figuras.tridimensional;

public class Cubo extends FiguraTridimensional{
	private double lado1;
	
	public Cubo(double lado1)
	{
		if (lado1 == 0.0)
			throw new IllegalArgumentException("\n••• Los lados deben ser != 0 •••\n");
		
		this.lado1 = lado1;
	}
	
	public void setLado1(double lado1) {
		if (lado1 == 0.0)
			throw new IllegalArgumentException("\n••• Los lados deben ser != 0 •••\n");

		this.lado1 = lado1;
	}
	
	public double getLado1() {
		return lado1;
	}
	
	@Override
	public double getArea() {
		return potenciarLado(getLado1(), 2) * 6;
	}
	
	@Override
	public double getVolumen() {
		return potenciarLado(getLado1(), 3);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %.2f",
				"Cubo", "Medida de sus lados", getLado1());
	}

	
	private static double potenciarLado(double lado, double exponente)
	{
		return Math.pow(lado, exponente);
	}
}
