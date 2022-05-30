// fig. 1.2
import java.util.Scanner;

public class Color_Texto {
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	// Define el color por defecto
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print(ANSI_BLUE + "Escriba la altura: ");
			int altura = entrada.nextInt();
			
			System.out.print(ANSI_PURPLE + "\nEscriba la base: ");
			int base = entrada.nextInt();
			
			double area = base * altura;
			
			System.out.println(ANSI_RED + "\nEl área es: " + ANSI_CYAN + area);
		}		
	}	
}
