import javax.swing.JFrame;

public class PruebaFigura
{
  public static void main(String[] args)
  {
    Figura panel = new Figura();

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(300, 300);
    aplicacion.setVisible(true);
  }
}