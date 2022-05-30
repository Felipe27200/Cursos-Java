import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    for (int contador = 0; contador <= 2; contador++)
    {
      g.drawLine(0, 0, anchura * contador, altura / 2);
    }
  }
}