package figuras.tridimensional;

public class Tetraedro extends FiguraTridimensional{
	private double arista;
	
	public Tetraedro(double arista)
	{
		if (arista == 0.0)
			throw new IllegalArgumentException("\n••• Los lados deben ser != 0 •••\n");
		
		this.arista = arista;
	}
	
	public void setArista(double arista) {
		if (arista == 0.0)
			throw new IllegalArgumentException("\n••• Los lados deben ser != 0 •••\n");
		
		this.arista = arista;
	}
	
	public double getArista() {
		return arista;
	}
	
	@Override
	public double getArea() {
		return Raiz_Potencia(3, 2);
	}
	
	@Override
	public double getVolumen() {
		return Raiz_Potencia(2, 3) / 12;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %.2f",
				"Tetraedro", "Medida de sus lados", getArista());
	}
	
	private double Raiz_Potencia(int radicando, int exponente) {
		return Math.sqrt(radicando) * Math.pow(getArista(), exponente);
	}
}
