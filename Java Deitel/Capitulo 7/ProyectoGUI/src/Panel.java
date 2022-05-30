import javax.swing.JFrame;

public class Panel
{
  public static void main(String[] args)
  {
    ProyectoGUI panel = new ProyectoGUI();

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    aplicacion.add(panel);
    aplicacion.setSize(250, 250);
    aplicacion.setVisible(true);
  }
}