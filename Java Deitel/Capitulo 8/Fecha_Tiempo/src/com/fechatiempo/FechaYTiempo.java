package com.fechatiempo;

public class FechaYTiempo {
	private int hora;
	private int minuto;
	private int segundo;
	private int mes;
	private int dia;
	private int anio;
	
	private static final int[] diasPorMes =
		{0, 31, 28, 31, 30, 31 , 30, 31, 31, 30 ,31, 30, 31};
	
	public FechaYTiempo() {
		this(0, 0, 0, 1, 1, 1582);
	}
	
	public FechaYTiempo(int hora, int minuto, int segundo, int mes, int dia, int anio) {
		if (hora < 0 || hora >= 24)
			throw new IllegalArgumentException("Hora debe estar entre 0 y 23");
		
		if (minuto < 0 || minuto >= 60)
			throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");

		if (segundo < 0 || segundo >= 60)
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
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
		
		if (anio < 1582)
			throw new IllegalArgumentException("Año (" + anio + ") deber ser mayor a cero.");
		
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
	}
	  
	  public void incrementarHora()
	  {
		switch (hora)
		{
		  case 23:
			  hora = 0;
			  siguienteDia();
		      break;
		      
		  default:
			  hora++;
		}
	  }
	  
	  public void incrementarMinuto()
	  {
		switch(minuto)
		{
		  case 59:
			  minuto = 0;
			  incrementarHora();
		      break;
		      
		  default:
			  minuto++;
		}
	  }
	  
	  public void incrementarSegundo()
	  {
		switch(segundo)
		{
		  case 59:
			  segundo = 0;
			  incrementarMinuto();
			  break;
			  
		  default:
			  segundo++;
		}
	  }
	  
	  public void siguienteAnio()
	  {
		anio++;
	  }
	  
	  public void siguienteMes()
	  {
		switch(mes)
		{
		  case 12:
			  mes = 1;
			  siguienteAnio();
			  break;
		
		  default:
			  mes++;
		}
	  }
	  
	  public void siguienteDia()
	  {
	    if (mes == 2 && dia == 28 && (anio % 400 == 0 ||
			  (anio % 4 == 0 && anio % 100 != 0)))   	
	    {
	      dia++;
	 	}
	    else if (dia >= diasPorMes[mes])
	    {
	      dia = 1;
	      siguienteMes();
	    }
	    else
	    	dia++;
	  }
	  
	  public String fecha()
	  {
		return String.format("%02d/%02d/%-5d", mes, dia, anio);
	  }
	  
	  public String aStringUniversal()
	  {
		return String.format("%s%n%02d:%02d:%02d", fecha(), 
				hora, minuto, segundo);
	  }
	  
	  public String toString()
	  {
			return String.format("%s%n%02d:%02d:%02d %s", fecha(),
					((hora == 12) ? 12 : hora % 12),
					minuto, segundo, (hora < 12 ? "AM" : "PM"));
	  }
}
