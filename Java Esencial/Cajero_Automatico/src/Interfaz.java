import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcionSeleccionada = 0;
		
		do {
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("	Escriba 1 para consultar su saldo");
			System.out.println("	Escriba 2 para ingresar dinero");
			System.out.println("	Escriba 3 para sacar dinero");
			System.out.println("	Escriba 4 para consultar su últimos movimientos");
			System.out.println("\tPara salir escriba cualquier otro número");
			opcionSeleccionada = entrada.nextInt();
			
			System.out.println();
			
			switch (opcionSeleccionada)
			{
				case 1:
					System.out.println("La opción que usted ha elegido es consultar su saldo");
					break;
				case 2:
					System.out.println("La opción que usted ha elegido es ingresar dinero");
					break;
				case 3:
					System.out.println("La opción que usted ha elegido es sacar dinero");
					break;
				case 4:
					System.out.println("La opción que usted ha elegido es consultar su últimos movimientos");
					break;
				default:
					System.out.println("Muchas gracias por usar nuestros servicios");
					break;

			}
			
			System.out.println();
			
		} while (opcionSeleccionada >= 1 && opcionSeleccionada <= 4);
	}
}
