import java.math.BigDecimal;

public class Cuenta {
	private String nombre;
	private BigDecimal saldo = new BigDecimal(0.0);
	
	public Cuenta(String nombre , double saldo)
	{
		this.nombre = nombre;
		
		if (saldo > 0.0)
			this.saldo = BigDecimal.valueOf(saldo);
	}
	
	public void depositar(double montoDeposito)
	{
		if (montoDeposito > 0.0)
			saldo = saldo.add(BigDecimal.valueOf(montoDeposito));
	}
	
	public BigDecimal obtenerSaldo() {
		return saldo;
	}
	
	public void establecerNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	
	public String toString() {
		return String.format("La cuenta a nombre de: %s%nTiene un saldo de: $%s", nombre,
				saldo);
	}
}
