// fig 1.4

public class Caja <T> {
	T elemento;
	
	public Caja(T elemento)
	{
		this.elemento = elemento;
	}
	
	public <V> boolean perteneceALaMismaClase(V otroElemento)
	{
		return elemento.getClass() == otroElemento.getClass();
	}
}
