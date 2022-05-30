package com.fechaformato;

public class Fecha {
	private int dia, mes, anio;
	
	private static final int[] diasPorMes =
		{0, 31, 28, 31, 30, 31 , 30, 31, 31, 30 ,31, 30, 31};
	
	public Fecha(int dia,int mes, int anio)
	{
		if (mes <= 0 || mes > 12)
			throw new IllegalArgumentException("mes (" + mes + ") debe se 1-12");

		if (dia <= 0 ||
			(dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
			throw new IllegalArgumentException("dia (" + dia + 
					") fuera de rango para el mes específicado");
		
		if (mes == 2 && dia == 29 && !(anio % 400 == 0 ||
			  (anio % 4 == 0 && anio % 100 != 0)))
			throw new IllegalArgumentException("dia (" + dia +
				") fuera de rango para el mes específicado");
		
		if (anio <= 1582)
			throw new IllegalArgumentException("Año fuera del calendario Gregoriano");
		
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
	}	
	
	public Fecha(String mes, int dia, int anio)
	{
		switch (mes.toLowerCase())
		{
			case "enero":
				this.mes = 1;
				break;

			case "febrero":
				this.mes = 2;
				break;

			case "marzo":
				this.mes = 3;
				break;
			
			case "abril":
				this.mes = 4;
				break;
			
			case "mayo":
				this.mes = 5;
				break;
			
			case "junio":
				this.mes = 6;
				break;
			
			case "julio":
				this.mes = 7;
				break;
			
			case "agosto":
				this.mes = 8;
				break;
			
			case "septiembre":
				this.mes = 9;
				break;
			
			case "octubre":
				this.mes = 10;
				break;
			
			case "noviembre":
				this.mes = 11;
				break;
			
			case "diciembre":
				this.mes = 12;
				break;
			
			default:
				throw new IllegalArgumentException("Mes Inválido");
		}

		if (anio < 1582)
			throw new IllegalArgumentException("Año fuera del calendario Gregoriano");	

		if (dia <= 0 || (dia > diasPorMes[this.mes] && !(this.mes == 2 && dia == 29)))
				throw new IllegalArgumentException("dia (" + dia + 
					") fuera de rango para el mes específicado");
			
		if (this.mes == 2 && dia == 29 && !(anio % 400 == 0 ||
			  (anio % 4 == 0 && anio % 100 != 0)))
			throw new IllegalArgumentException("dia (" + dia +
					") fuera de rango para el mes específicado");		

		this.dia = dia;
		this.anio = anio;
	}
	
	public Fecha(int diaAnio, int anio)
	{
		if (anio < 1582)
			throw new IllegalArgumentException("Año fuera del calendario Gregoriano");

		if (diaAnio < 1)
			throw new IllegalArgumentException("Día menor no puede ser menor a 1");
		
		if (!(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) && dia > 365)
				throw new IllegalArgumentException("Día no puede ser mayor a 365");
		
		if ((anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) && dia > 366))
			throw new IllegalArgumentException("Día no puede ser mayor a 366");

		int sumaDia = 0;
		int mes = 1;			

		if (((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) && dia <= 366)
		{
			while (sumaDia + diasPorMes[mes] < diaAnio)
			{				
				sumaDia += diasPorMes[mes];

				if(mes == 2)
				{
					sumaDia++;
				}

				mes++;			
			}
			
			if (diaAnio == 60)
			{
				sumaDia = 31;
				mes--;
			}
		}
		else if(dia <= 365)
		{
			while (sumaDia + diasPorMes[mes] < diaAnio)
			{	
				sumaDia += diasPorMes[mes];
				
				mes++;
			}
		}
				
		this.dia = diaAnio - sumaDia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public String mesString() {
		String mes = "";
		
		switch (this.mes)
		{
			case 1:
				mes = "Enero";
				break;

			case 2:
				mes = "Febrero";
				break;

			case 3:
				mes = "Marzo";
				break;
			
			case 4:
				mes = "Abril";
				break;
			
			case 5:
				mes = "Mayo";
				break;
			
			case 6:
				mes = "Junio";
				break;
			
			case 7:
				mes = "Julio";
				break;
			
			case 8:
				mes = "Agosto";
				break;
			
			case 9:
				mes = "Septiembre";
				break;
			
			case 10:
				mes = "Octubre";
				break;
			
			case 11:
				mes = "Noviembre";
				break;
			
			case 12:
				mes = "Diciembre";
		}
		
		return String.format("%s %d, %d", mes, dia, anio);
	}
	
	public String diaDelAnio() {
		int sumaDias = 0;
		
		for (int contador = 1; contador < mes; contador++)
		{
			sumaDias += diasPorMes[contador];
		}
		
		sumaDias += dia;
		
		if ((anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
		{
			if (mes > 2 && sumaDias >= 60)
				sumaDias++;
		}
		
		return String.format("%03d %d", sumaDias, anio);
	}
	
	public String toString()
	{
		return String.format("%02d/%02d/%02d", dia, mes, anio);
	}
}
