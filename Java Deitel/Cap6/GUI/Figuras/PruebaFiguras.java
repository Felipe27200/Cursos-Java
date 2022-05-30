import javax.swing.JFrame;

public class PruebaFiguras
{
  public static void main(String[] args)
  {
    FigurasAleatorias panel = new FigurasAleatorias();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(250, 250);
    aplicacion.setVisible(true);    
  }
}