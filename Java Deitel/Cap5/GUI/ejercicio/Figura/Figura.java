import java.awt.Graphics;
import javax.swing.JPanel;

public class Figura extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);


    for (int c = 0; c < 12; c++)
    {
      g.drawOval(130 - c * 10, 120 - c * 10, 20 + c * 20, 20 + c * 20);
    }
  }
}