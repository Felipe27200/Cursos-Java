import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras
{
  public static void main(String[] args)
  {
    String entrada = JOptionPane.showInputDialog(
       "Escriba 1 para dibujar rectangulos\n" +
       "Escriba 2 para dibujar ovalos");

    int opcion  = Integer.parseInt(entrada);

    Figuras panel = new Figuras(opcion);

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(300, 300);
    aplicacion.setVisible(true);
  }
}