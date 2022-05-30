public class Main {
		public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Juan Felipe Zea", 1500.5506);
		System.out.println(cuenta1);
		
		System.out.println("\nSe va a depositar: $35050");
		cuenta1.depositar(35050);
		
		System.out.println("\n" + cuenta1);
	}
}
