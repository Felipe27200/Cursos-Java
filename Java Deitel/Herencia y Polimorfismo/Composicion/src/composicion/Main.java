package composicion;

public class Main {
	public static void main(String[] args)
	{
		
		try {
			EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
					"Felipe", "Zea", "333-33-333", 5000, 0.4, 300);					
		
			System.out.println("Información del empleado obtenida por métodos get de \"EmpleadoPorComision:\"");
			System.out.printf("El primer nombre es: %s%n", empleado.getEmpleadoPorComision().getPrimerNombre());
			System.out.printf("El apellido es: %s%n", empleado.getEmpleadoPorComision().getApellidoPaterno());
			System.out.printf("El número de seguro social es: %s%n", empleado.getEmpleadoPorComision().getNumeroSeguroSocial());
			System.out.printf("Las ventas brutas son: %.2f%n", empleado.getEmpleadoPorComision().getVentasBrutas());
			System.out.printf("La tarifa de comisión es: %.2f%n", empleado.getEmpleadoPorComision().getTarifaComision());
			
			System.out.println("\nInformación del empleado obtenida por sus métodos get:");
			System.out.printf("El salario base es: %.2f%n", empleado.getSalarioBase());
			
			empleado.setSalarioBase(1000);
			
			System.out.println("\nInformación actualizada del empleado, obtenida por toString\n" + empleado);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
}
