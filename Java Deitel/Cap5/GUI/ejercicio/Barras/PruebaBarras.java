import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaBarras
{
  public static void main(String[] args)
  {
    String entrada1 = JOptionPane.showInputDialog("Escriba la longitud de la barra\n" +
        "En enteros del 1 al 30");
        int opcion1 = Integer.parseInt(entrada1);

    String entrada2 = JOptionPane.showInputDialog("Escriba la longitud de la barra\n" +
        "En enteros del 1 al 30");
        int opcion2 = Integer.parseInt(entrada2);

    String entrada3 = JOptionPane.showInputDialog("Escriba la longitud de la barra\n" +
        "En enteros del 1 al 30");
        int opcion3 = Integer.parseInt(entrada3);

    String entrada4 = JOptionPane.showInputDialog("Escriba la longitud de la barra\n" +
        "En enteros del 1 al 30");
        int opcion4 = Integer.parseInt(entrada4);

    String entrada5 = JOptionPane.showInputDialog("Escriba la longitud de la barra\n" +
        "En enteros del 1 al 30");
        int opcion5 = Integer.parseInt(entrada5);

    Barras panel = new Barras(opcion1, opcion2, opcion3, opcion4, opcion5);

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(337, 315);
    aplicacion.setVisible(true);
  }
}