public class Prueba_String {
	public static void main(String[] args) {
		String saludo = "Hola mundo";
		String otro_saludo = saludo;
		
		otro_saludo += " y mueransen gonorreas!!!";
		
		System.out.println("saludo: " + saludo);
		
		System.out.println("otro_saludo: " + otro_saludo);
		
		char caracter = "Hola perros".charAt(3);
		
		System.out.println("El car�cter en la posici�n 3 es: " + caracter);
	}
}
