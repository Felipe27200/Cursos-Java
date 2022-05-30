package com.espiralcircular;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Espiral_Circular extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 110, a = 1;

    for (int i = 1; i <= 4; i++)
    {
      g.drawArc(x, 110 - 15 * a, 35 * a, 35 * a, 0, 180);
      a++;

      g.drawArc(x = x - 35, 110 - 15 * a, 35 * a, 35 * a, 180, 180);
      a++;
    }
  }
}
