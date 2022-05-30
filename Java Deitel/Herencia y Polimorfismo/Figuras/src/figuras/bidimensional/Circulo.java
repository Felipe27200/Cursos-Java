package figuras.bidimensional;

public class Circulo extends FiguraBidimensional{
	private double radio;
	
	public Circulo(double radio)
	{
		if (radio == 0.0)
			throw new IllegalArgumentException("\n••• El radio debe ser != 0 •••\n");
		
		this.radio = radio;
	}
	
	public void setRadio(double radio) {
		if (radio == 0.0)
			throw new IllegalArgumentException("\n••• El radio debe ser != 0 •••\n");

		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %.2f", "Círculo", "Radio", getRadio());
	}
}
