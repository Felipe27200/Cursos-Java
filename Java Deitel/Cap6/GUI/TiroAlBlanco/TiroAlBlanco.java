import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class TiroAlBlanco extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    SecureRandom colorAleatorio = new SecureRandom();

    int r = colorAleatorio.nextInt(225);
    int v = colorAleatorio.nextInt(225);
    int b = colorAleatorio.nextInt(225);

    int r2 = colorAleatorio.nextInt(225);
    int v2 = colorAleatorio.nextInt(225);
    int b2 = colorAleatorio.nextInt(225);

    Color circunferencia1 = new Color(r, v, b);
    Color circunferencia2 = new Color(r2, v2, b2);

    for (int i = 0; i < 5; i++)
    {
      if (i % 2 == 0)
      {
        g.setColor(circunferencia1);
      }
      else
        g.setColor(circunferencia2);
 
      g.fillOval(8 + i * 20, 8 + i * 21,
        200 - i * 40, 200 - i * 40);
    }
  }
}