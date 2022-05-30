public class Cuenta_Bancaria {
	String titular;
	String tipoCuenta;
	double saldo;
	
	void establecerTitular(String titular)
	{
		this.titular = titular;
	}
	
	void establecerTipoCuenta(String tipoCuenta)
	{
		this.tipoCuenta = tipoCuenta;
	}
	
	void depositar(double deposito)
	{
		saldo += deposito;
	}
}
