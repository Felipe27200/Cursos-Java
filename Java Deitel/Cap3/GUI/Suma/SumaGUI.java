import javax.swing.JOptionPane;

public class SumaGUI
{
  public static void main(String[] args)
  {
    String numero1 = JOptionPane.showInputDialog("Escriba el primer entero");

    String numero2 = JOptionPane.showInputDialog("Escriba el segundo entero");

    int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);

    String mensaje =
      String.format("La suma es: %d", suma);

    JOptionPane.showMessageDialog(null, mensaje); 
  }
}