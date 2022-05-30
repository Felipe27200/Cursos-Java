package com.pruebajerarquía;

import com.Empleados.*;
import com.fechanacimiento.*;
import java.util.Scanner;

public class Main {
	public static final Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Fecha fechaActual = new Fecha(12, 8, 2021);
		
		EmpleadoAsalariado empleadoAsalariado = 
				new EmpleadoAsalariado("John", "Smith", "111-11-111", 1, 1, 1990, 800.00);
		EmpleadoPorHoras empleadoPorHoras =
				new EmpleadoPorHoras("Karen", "Price", "222-22-222", 12, 31, 1995, 16.75, 40);
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
				"Sue", "Jones", "333-33-333", 07, 27, 2000, 10000, .06);
		EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
				"Bob", "Lewis", "444-44-444", 10, 8, 1998, 5000, .04, 300);
		TrabajadorPorPiezas trabajadorPorPiezas = new TrabajadorPorPiezas("Diego",
				"Castro", "555-55-555", 12, 28, 2010, 30, 35.5);
		
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = empleadoAsalariado;
		empleados[1] = empleadoPorHoras;
		empleados[2] = empleadoPorComision;
		empleados[3] = empleadoBaseMasComision;
		empleados[4] = trabajadorPorPiezas;
		
		int continuar = 0;
		
		do {
			System.out.println("\tInformación Empleados\n");
						
			System.out.println("Aumento Empleados para la fecha: " + fechaActual + "\n");
			
			for (Empleado empleadoActual: empleados)
			{
				System.out.println(empleadoActual);
				System.out.printf("%s: $%.2f%n", "Ingresos", empleadoActual.obtenerMontoPago());
				
				if (empleadoActual.getFechaNacimiento().getMes() == fechaActual.getMes())
				{
					System.out.printf("%s: $%.2f%n", "Ingresos con bonificación por mes de nacimientos", empleadoActual.ingresos() + 100.0);					
				}
				
				System.out.println();
			}
			
			System.out.println("Desea continuar: [1] No [2] Sí");
			continuar = entrada.nextInt();
			
		} while (continuar != 1);
		
	}
}
