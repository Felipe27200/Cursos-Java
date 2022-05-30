package com.interfaz.factura;

import com.interfaz.PorPagar;

public class Factura implements PorPagar{
	private final String numeroPieza;
	private final String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidad,
			double precioPorArticulo)
	{
		validarCantidad(cantidad);
		validarPrecioPorArticulo(precioPorArticulo);
		
		this.cantidad = cantidad;
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		this.precioPorArticulo = precioPorArticulo;
	}
	
	private static void validarCantidad(int cantidad)
	{
		if (cantidad < 0) // valida la cantidad
			throw new IllegalArgumentException ("••• Cantidad debe ser >= 0 •••");
	}
	
	private static void validarPrecioPorArticulo(double precioPorArticulo)
	{
		if (precioPorArticulo < 0.0) // valida el precioPorArticulo
			throw new IllegalArgumentException(
			"••• El precio por articulo debe ser >= 0 •••");
	}
	
	public String getNumeroPieza()
	{
		return numeroPieza;
	}
	
	public String getDescripcionPieza() {
		return descripcionPieza;
	}
	
	public void setCantidad(int cantidad) {
		validarCantidad(cantidad);
		
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setPrecioPorArticulo(double precioPorArticulo) {
		validarPrecioPorArticulo(precioPorArticulo);
		
		this.precioPorArticulo = precioPorArticulo;
	}
	
	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}
	
	@Override
	public double obtenerMontoPago()
	{
		return getCantidad() * getPrecioPorArticulo();
	}
	
	@Override
	public String toString()
	{
	 return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
	"factura", "numero de pieza", getNumeroPieza(),
	getDescripcionPieza(), "cantidad", getCantidad(),
	"precio por articulo", getPrecioPorArticulo());
	}
}
