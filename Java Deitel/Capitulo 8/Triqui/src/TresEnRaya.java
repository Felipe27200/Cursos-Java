public class TresEnRaya {
	Estado estadoJuego = Estado.CONTINUA;
	private Casilla[][] tablero = new Casilla[3][3];
	
	public TresEnRaya() {
		for(int x = 0; x < tablero.length; x++)
		{
			for(int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = Casilla.VACIO;
		}
	}
	
	public boolean esMovimientoValido(int fila, int columna, int jugador)
	{
		if (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero[fila].length)
			throw new IllegalArgumentException("\n	MOVIMIENTO NO VÁLIDO\n");
		
		if (tablero[fila][columna] != Casilla.VACIO)
			return false;
		else
		{
			if (jugador == 1)
				tablero[fila][columna] = Casilla.X;
			else
				tablero[fila][columna] = Casilla.O;
			
			return true;
		}
	}
	
	public Estado verificarEstadoJuego() {		
		if (diagonalLeft_Right() || diagonalRight_Left() || victoriaColumna() || victoriaFila())
			estadoJuego = Estado.VICTORIA; 
		else if (empate())
			estadoJuego = Estado.EMPATE;
		
		return estadoJuego;
	}
	
	public boolean diagonalLeft_Right() {
		boolean victoria = false;
		
		Casilla valor = Casilla.VACIO;
		
		if (tablero[0][0] != Casilla.VACIO)
		{
			valor = tablero[0][0];
		
			for(int fila = 1, columna = 1; fila < tablero.length; fila++, columna++)
			{
				if (tablero[fila][columna] == Casilla.VACIO || tablero[fila][columna] != valor)
					break;
				
				if( fila == tablero.length - 1 && tablero[fila][columna] == valor)
					victoria = true;
			}		
		}
		
		if (victoria)
		mensajeVictoria(valor);
		
		return victoria;
	}
	
	public boolean diagonalRight_Left() {
		Casilla casilla = Casilla.VACIO;
		boolean victoria = false;
		
		if (tablero[0][2] != Casilla.VACIO)
		{
			casilla = tablero[0][2];
		
			for(int fila = 1, columna = 1; fila < tablero.length; fila++, columna--)
			{
				if (tablero[fila][columna] == Casilla.VACIO || tablero[fila][columna] != casilla)
					break;
				
				if( fila == 2 && tablero[fila][columna] == casilla)
					victoria = true;
			}
		}
		
		if (victoria)
		mensajeVictoria(casilla);
		
		return victoria;
	}
	
	public boolean victoriaFila() {
		boolean victoria = false;
		Casilla casilla = Casilla.VACIO;
		
		for (int fila = 0; fila < tablero.length; fila++)
		{
			for (int columna = 0; columna < tablero[fila].length; columna++)
			{
				if (columna == 0 && tablero[fila][columna] != Casilla.VACIO)
					casilla = tablero[fila][columna];
				else if (tablero[fila][columna] != casilla || tablero[fila][columna] == Casilla.VACIO)
					break;
				
				if (columna == tablero[fila].length - 1 && tablero[fila][columna] == casilla)
					victoria = true;	
			}
			
			if (victoria)
				break;
		}
		
		if (victoria)
			mensajeVictoria(casilla);
		
		return victoria;
	}
	
	public boolean victoriaColumna() {
		Casilla casilla = Casilla.VACIO;
		boolean victoria = false;
		
		for (int columna = 0; columna < tablero[0].length; columna++)
		{
			for (int fila = 0; fila < tablero.length; fila++)
			{
				if (fila == 0 && tablero[fila][columna] != Casilla.VACIO)
					casilla = tablero[fila][columna];
				else if (tablero[fila][columna] == Casilla.VACIO || tablero[fila][columna] != casilla)
					break;
				
				if (fila == tablero.length - 1 && tablero[fila][columna] == casilla)
					victoria = true;	
			}
			
			if (victoria)
				break;
		}
		
		if (victoria)
			mensajeVictoria(casilla);
		
		return victoria;
	}
	
	public boolean empate() {
		boolean empate = true;
		
		for(Casilla[] fila: tablero)
		{
			for (Casilla columna: fila)
			{
				if (columna == Casilla.VACIO)
				{
					empate = false;
					break;
				}
			}
			
			if (!empate)
				break;
		}
		
		if (empate)
			System.out.println("\nVaya, vaya... HAN EMPATADO\n");
		
		return empate;
	}
	
	public void mensajeVictoria(Casilla casilla) {
			System.out.printf("%nEl ganador es: %s%n", (casilla == Casilla.X ? "Jugador 1" : "Jugador 2"));
	}
	
	public String toString() {
		String encabezado = "";
		
		for (int fila = 0; fila < tablero.length; fila++)
			encabezado += String.format("%3s", fila); 
		
		encabezado += String.format("%n");
		
		for (int fila = 0; fila < tablero.length; fila++)
		{
			encabezado += String.format("%-2s", fila);
			
			for (int columna = 0; columna < tablero[fila].length; columna++)
			{
				if (tablero[fila][columna] != Casilla.VACIO)
					encabezado += String.format("%2s|", tablero[fila][columna]);
				else
					encabezado += String.format("%2s", "--|"); 
			}
			
			encabezado += String.format("%n");
		}
			
		return encabezado;
	}
}
