public class PolizaAuto
{
  private int numeroCuenta;
  private String marcaYModelo;
  private String estado;

  public PolizaAuto (int numeroCuenta, String marcaYModelo, String estado)
  {
    this.numeroCuenta = numeroCuenta;
    this.marcaYModelo = marcaYModelo;
    if (estado == "CT" || estado == "MA" || estado == "ME" ||
        estado == "NH" || estado == "NJ" || estado == "NY" ||
        estado == "PA" || estado == "VT")
        this.estado = estado;
    else 
    {
      estado = "\n*Código invalido*\n";
      this.estado = estado;
    }
  }

  public void establerNumeroCuenta(int numeroCuenta)
  {
    this.numeroCuenta = numeroCuenta;
  }

  public int obtenerNumeroCuenta()
  {
    return numeroCuenta;
  }

  public void establecerMarcaYModelo(String marcaYModelo)
  {
    this.marcaYModelo = marcaYModelo;
  }

  public String obtenerMarcaYModelo()
  {
    return marcaYModelo;
  }

  public void establecerEstado(String estado)
  {
    if (estado == "CT" || estado == "MA" || estado == "ME" ||
        estado == "NH" || estado == "NJ" || estado == "NY" ||
        estado == "PA" || estado == "VT")
        this.estado = estado;
    else 
    {
      estado = "\n*Código invalido*\n";
      this.estado = estado;
    }
  }

  public String obtenerEstado()
  {
    return estado;
  }

  public boolean esEstadoSinCulpa()
  {
    boolean estadoSinCulpa;

    switch (obtenerEstado())
    {
      case "MA": case "NJ": case "NY": case "PA":
        estadoSinCulpa = true;
        break;
      default:
        estadoSinCulpa = false;
        break;
    }
  
    return estadoSinCulpa;
  }
}