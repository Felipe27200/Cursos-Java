import java.util.Scanner;

public class Main {
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int continuar = 0;
				
		do {
			TresEnRaya triqui = new TresEnRaya();
			System.out.println(triqui);
			
			System.out.print("Jugador 1 ingrese columna y fila separado por espacios para elegir casilla o -1 para terminar: ");
			int fila = entrada.nextInt();
			
			while(fila != -1)
			{
				int columna = entrada.nextInt();

				movimientoJugador(triqui, fila, columna, 1);
			
				if (triqui.verificarEstadoJuego() != Estado.CONTINUA)
				{
					System.out.println("\n< - - - JUEGO - - TERMINADO - - - >");
					break;
				}
				
				System.out.print("Jugador 2 ingrese columna y fila separado por espacios para elegir casilla: ");
			
				fila = entrada.nextInt();
				columna = entrada.nextInt();
			
				movimientoJugador(triqui, fila, columna, 2);
			
				if (triqui.verificarEstadoJuego() != Estado.CONTINUA)
				{
					System.out.println("\n< - - - JUEGO - - TERMINADO - - - >");
					break;
				}
			
				System.out.print("Jugador 1 ingrese columna y fila separado por espacios para elegir casilla o <Ctrl> z para terminar: ");
				fila = entrada.nextInt();
			}
			
			System.out.print("\nPara terminar pulse -1 para jugar nueva partida cualquier tecla: ");
			continuar = entrada.nextInt();
		} while (continuar != -1);
		
		System.out.printf("%n%s%n%s%n%s%n",
						"********************",
						"* FIN DEL PROGRAMA *", "********************");
	}
	
	public static void movimientoJugador(TresEnRaya triqui, int fila, int columna, int jugador)
	{
		boolean validar = true;

		try {
			
			if (triqui.esMovimientoValido(fila, columna, jugador))
				validar = false;
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
		
		System.out.println();
		
		while (validar)
		{
			System.out.print("Jugador " + jugador + " vuelva a ingresar la fila y columna separado por espacio: ");
			
			fila = entrada.nextInt();
			columna = entrada.nextInt();
			
			try {
				if (triqui.esMovimientoValido(fila, columna, jugador))
					validar = false;
			}
			catch(IllegalArgumentException e){
				System.out.println(e);
			}
		}

		System.out.println(triqui);
	}
}
