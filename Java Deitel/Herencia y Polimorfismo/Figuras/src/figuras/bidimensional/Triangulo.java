package figuras.bidimensional;

public class Triangulo extends FiguraBidimensional{
	public double altura;
	public double base;
	
	public Triangulo(double altura, double base)
	{
		validarDato(altura, "altura");
		validarDato(base, "base");
		
		this.altura = altura;
		this.base = base;
	}
	
	public void setAltura(double altura) {
		validarDato(altura, "altura");

		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double base) {
		validarDato(base, "base");

		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	@Override
	public double getArea() {
		return (getAltura() * getBase()) / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f; %s: %.2f", "Triángulo", "Altura", getAltura(), "Base", getBase());
	}
	
	private static void validarDato(double altura, String termino)
	{
		if (altura == 0.0)
			throw new IllegalArgumentException("\n••• La " + termino + " no puede ser == 0 •••\n");
	}

}
