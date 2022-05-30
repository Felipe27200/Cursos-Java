import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Cuenta_Bancaria cuentaJuan = new Cuenta_Bancaria();
		
		cuentaJuan.titular = "Juan Felipe";
		cuentaJuan.saldo = 23000;
		
		System.out.println("El titular de la cuenta es: " + cuentaJuan.titular +
				" con un saldo de: " + cuentaJuan.saldo);

		cuentaJuan.saldo += 1000;
		
		System.out.println("\nEl titular de la cuenta es: " + cuentaJuan.titular +
				" con un saldo de: " + cuentaJuan.saldo);
	}
}
