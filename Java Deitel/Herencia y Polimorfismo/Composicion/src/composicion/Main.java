package composicion;

public class Main {
	public static void main(String[] args)
	{
		
		try {
			EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
					"Felipe", "Zea", "333-33-333", 5000, 0.4, 300);					
		
			System.out.println("Informaci�n del empleado obtenida por m�todos get de \"EmpleadoPorComision:\"");
			System.out.printf("El primer nombre es: %s%n", empleado.getEmpleadoPorComision().getPrimerNombre());
			System.out.printf("El apellido es: %s%n", empleado.getEmpleadoPorComision().getApellidoPaterno());
			System.out.printf("El n�mero de seguro social es: %s%n", empleado.getEmpleadoPorComision().getNumeroSeguroSocial());
			System.out.printf("Las ventas brutas son: %.2f%n", empleado.getEmpleadoPorComision().getVentasBrutas());
			System.out.printf("La tarifa de comisi�n es: %.2f%n", empleado.getEmpleadoPorComision().getTarifaComision());
			
			System.out.println("\nInformaci�n del empleado obtenida por sus m�todos get:");
			System.out.printf("El salario base es: %.2f%n", empleado.getSalarioBase());
			
			empleado.setSalarioBase(1000);
			
			System.out.println("\nInformaci�n actualizada del empleado, obtenida por toString\n" + empleado);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
}
