import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    g.drawLine(0, 0, (anchura * 0) / 2, altura);
    g.drawLine(0, 0, (anchura * 1) / 3, altura);
  }
}