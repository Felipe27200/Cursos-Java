// fig 1.5

public class Main {
	public static void main(String[] args) {
		Caja<String> caja1 = new Caja<>("Hola");
		
		Integer numero = 5;
		Caja<Integer> caja2 = new Caja<>(numero);
		
		compararTipos(caja1);
		compararTipos(caja2);
	}
	
	public static void compararTipos(Caja<?> caja)
	{
		String miObjeto = "Perro";

		System.out.println("elemento == miObjeto: " +
				caja.perteneceALaMismaClase(miObjeto));		
	}
}
