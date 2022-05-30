package com.fechanacimiento;

public class Fecha 
{
	private int mes;
	private int dia;
	private int anio;

	private static final int[] diasPorMes =
		{0, 31, 28, 31, 30, 31 , 30, 31, 31, 30 ,31, 30, 31};

	public Fecha(int mes, int dia, int anio)
	{
		validarAnio(anio);
		validarMes(mes);
		validarDia(mes, dia, anio);
		
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
	}
  
	//  public void siguienteAnio()
	//  {
	//	anio++;
	//  }
	//  
	//  public void siguienteMes()
	//  {
	//	switch(mes)
	//	{
	//	  case 12:
	//		  mes = 1;
	//		  siguienteAnio();
	//		  break;
	//	
	//	  default:
	//		  mes++;
	//	}
	//  }
	//  
	//  public void siguienteDia()
	//  {
	//    if (mes == 2 && dia == 28 && (anio % 400 == 0 ||
	//		  (anio % 4 == 0 && anio % 100 != 0)))   	
	//    {
	//      dia++;
	// 	}
	//    else if (dia >= diasPorMes[mes])
	//    {
	//      dia = 1;
	//      siguienteMes();
	//    }
	//    else
	//    	dia++;
	//  }
	
	public void setAnio(int anio)
	{
		validarAnio(anio);
		
		this.anio = anio;
	}
	
	public void setMes(int mes) {
		validarMes(mes);
		
		this.mes = mes;
	}
	
	public void setDia(int dia) {
		validarDia(mes, dia, anio);
		
		this.dia = dia;
	}
	public int getAnio() {
		return anio;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}
	
	public String toString()
	{
		return String.format("%02d/%02d/%-5d", dia, mes, anio);
	}
	
	private static void validarAnio(int anio)
	{
		if (anio <= 1582)
			throw new IllegalArgumentException("Año (" + anio + ") deber ser mayor a cero.");
	}

	private static void validarMes(int mes)
	{
		if (mes <= 0 || mes > 12)
			throw new IllegalArgumentException("mes (" + mes + ") debe se 1-12");;
		
	}	
	
	private static void validarDia(int mes, int dia, int anio)
	{
		if (dia <= 0 ||
				(dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
			throw new IllegalArgumentException("dia (" + dia + 
					") fuera de rango para el mes específicado");

		if (mes == 2 && dia == 29 && !(anio % 400 == 0 ||
				(anio % 4 == 0 && anio % 100 != 0)))
			throw new IllegalArgumentException("dia (" + dia +
					") fuera de rango para el mes específicado");		
	}
}
