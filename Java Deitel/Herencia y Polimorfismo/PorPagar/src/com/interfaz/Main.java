package com.interfaz;

import com.interfaz.empleado.*;
import com.interfaz.factura.*;

public class Main {
	
	public static void main(String[] args) {
		PorPagar[] objetosPorPagar = new PorPagar[6];
		
		objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
		objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
		objetosPorPagar[2] = new EmpleadoAsalariado(
				"Lisa", "Barnes", "888-88-888", 1200.00);
		objetosPorPagar[3] = new EmpleadoPorHoras("William", "Martínez",
				"333-33-333", 35.65, 20);
		objetosPorPagar[4] = new EmpleadoPorComision(
				"Nicolás", "Castro", "444-44-444", 10000.00, 0.6);
		objetosPorPagar[5] = new EmpleadoBaseMasComision(
				"Felipe", "Zea", "555-55-555", 15000, 0.8, 1500);
		
		System.out.println("Facturas y Empleados procesados en forma polimórfica:");
		
		for (PorPagar objetoPorPagarActual : objetosPorPagar)
		{
			System.out.printf("%n%s", objetoPorPagarActual);
			
			if (objetoPorPagarActual instanceof EmpleadoBaseMasComision)
			{
				EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) objetoPorPagarActual;
				
				empleado.setSalarioBase(empleado.getSalarioBase() * 1.10);
			}
			
			System.out.printf("%n%s: $%,.2f%n", "Pagare", objetoPorPagarActual.obtenerMontoPago());
		}
	}
}
