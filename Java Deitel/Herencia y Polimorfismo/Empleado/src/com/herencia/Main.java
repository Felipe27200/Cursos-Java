package com.herencia;

public class Main {
	public static void main(String[] args)
	{
		EmpleadoPorComision empleadoComision = new EmpleadoPorComision("Juan", "Sánchez", "888-88-888", 5000, 0.6);
		EmpleadoBaseMasComision empleadoBase = new EmpleadoBaseMasComision("Felipe", "Zea", "111-11-111", 5000, 0.6, 1000);
		EmpleadoPorHoras empleadoHora = new EmpleadoPorHoras("Tulio", "Triviño", "333-33-333", 40, 12);

		System.out.println(empleadoComision + "\nIngresos: " + empleadoComision.ingresos() + "\n");
		System.out.printf("%s%n%s: %.2f%n", empleadoBase, "Ingresos", empleadoBase.ingresos());
		System.out.printf("%n%s%n%s: %.2f%n", empleadoHora, "Ingresos", empleadoHora.ingresos());
		
		empleadoHora.setHoras(62.5);
		
		System.out.printf("%n%s: %s %s%n", "Empleado por horas", empleadoHora.getPrimerNombre(), empleadoHora.getApellidoPaterno());

		System.out.printf("%n%s%n%s: %.2f", empleadoHora, "Ingresos", empleadoHora.ingresos());
		
	}
}
