// fig. 1.1
import java.util.Scanner;
import java.math.BigDecimal;

public class Conversor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca una cantidad en euros y el programa hará la conversión a US dólares: ");
		double euros = entrada.nextDouble();
		
		do {
			String eurosString = Double.toString(euros);
			BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
			
			double tasaDeCambio = 1.09;
			String tasaDeCambioString = Double.toString(tasaDeCambio);
			BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);
			
			BigDecimal dolares = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
			
			System.out.println( + euros + " euros equivalen a " + dolares + " US dólares");
			
			System.out.print("\nPor favor, introduzca una cantidad en euros y el programa hará la conversión a US dólares "
					+ "o -1 para terminar: ");
			euros = entrada.nextDouble();
		} while (euros > -1);
	}
}
