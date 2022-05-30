import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth() * 2;
    int altura = getHeight() / 2;

    for (int contador = 1; contador <= 15; contador++)
    {
      g.drawLine(0, 0, anchura + 16, altura + 16 * 10);
    }
  }
}