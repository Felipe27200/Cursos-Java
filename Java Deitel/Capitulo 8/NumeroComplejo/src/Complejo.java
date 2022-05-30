
public class Complejo {
	private double real;
	private double imaginaria;
	
	public Complejo()
	{
		this(1, 1);
	}
	
	public Complejo(double real, double imaginaria)
	{
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public Complejo sumar(Complejo sumando)
	{
		double real = this.obtenerReal() + sumando.obtenerReal();
		double imaginaria = this.imaginaria + sumando.obtenerImaginaria();
		
		Complejo suma = new Complejo(real, imaginaria);
		
		return suma;
	}
	
	public Complejo restar(Complejo sustraendo)
	{
		double real = this.obtenerReal() - sustraendo.obtenerReal();
		double imaginaria = this.imaginaria + sustraendo.obtenerImaginaria();
		
		Complejo resta = new Complejo(real, imaginaria);
		
		return resta;
	}
	
	public void establecerReal(double real)
	{
		this.real = real;
	}
	
	public double obtenerReal()
	{
		return real;
	}
	
	public void establecerImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	public double obtenerImaginaria() {
		return imaginaria;
	}
	
	public String toString()
	{
		return String.format("(%.2f, %.2fi)", real, imaginaria);
	}
}
