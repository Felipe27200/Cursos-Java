import javax.swing.JFrame;

public class PruebaTiro
{
  public static void main(String[] args)
  {
    TiroAlBlanco panel = new TiroAlBlanco();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(230, 250);
    aplicacion.setVisible(true);
  }
}