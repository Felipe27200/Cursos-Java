public class Cuenta
{
  private String nombre;// variable de instancia

  // m�todo para establecer el nombre en el objeto
  public void establecerNombre(String nombre)
  {
    this.nombre = nombre;
  }

  //m�todo para obtener el nombre del objeto
  public String obtenerNombre()
  {
    return nombre; // devuelve el valor de nombre a quien lo invoc�
  }
}