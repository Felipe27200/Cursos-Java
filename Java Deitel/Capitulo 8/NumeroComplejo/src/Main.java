import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la parte real o <Ctrl> z para terminar: ");
		
		while(entrada.hasNext())
		{
			double real = entrada.nextDouble();
			
			System.out.print("Ingrese la parte imaginaria: ");
			double imaginaria = entrada.nextDouble();
			
			Complejo complejo1 = new Complejo(real, imaginaria);
			Complejo complejo2 = new Complejo();
			
			System.out.print("\nIngrese la parte real del segundo complejo: ");
			complejo2.establecerReal(entrada.nextDouble());
			
			System.out.print("Ingrese la parte imaginaria: ");
			complejo2.establecerImaginaria(entrada.nextDouble());
			
			System.out.println("\nEscoja la operación a realizar");
			System.out.println("[1] sumar [2] restar: ");
			int opcion = entrada.nextInt();
			
			while (opcion < 1 || opcion > 2)
			{
				System.out.println("\nEscoja la operación a realizar");
				System.out.println("[1] sumar [2] restar: ");
				opcion = entrada.nextInt();	
			}
			
			separador();
			
			switch(opcion)
			{
				case 1: 
					System.out.println("La suma es:");
					System.out.println(complejo1.sumar(complejo2));
					break;
					
				case 2: 
					System.out.println("La resta es:");
					System.out.println(complejo1.restar(complejo2));
			}
			
			separador();
			System.out.print("Para realizar otra operación ingrese la parte real o <Ctrl> z para terminar: ");
		}
	}
	
	public static void separador() {
		for(int contador = 0; contador < 50; contador++)
			System.out.print("-");
		
		System.out.println();
	}
}
