package figuras.bidimensional;

public class Cuadrado extends FiguraBidimensional{
	public double lado1;
	
	public Cuadrado(double lado1)
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
	public double getArea()
	{
		return getLado1() * getLado1();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %.2f",
				"Cuadrado", "Medida de sus lados", getLado1());
	}
}
