package figuras.tridimensional;

public class Esfera extends FiguraTridimensional{
	private double radio;
	
	public Esfera (double radio)
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
		return PiXRadio(2);
	}
	
	@Override
	public double getVolumen() {
		return PiXRadio(3) / 3;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f", "Esfera", "Radio", getRadio());
	}
	
	public double PiXRadio(int base)
	{
		return 4 * Math.PI * Math.pow(getRadio(), base);
	}
}
