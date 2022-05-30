package com.espiralcuadrada;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Espiral extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 105, y = 110;
    int a = 1;
    int y2 = 0;
    int x2 = 0;

    for (int contador = 1; contador <= 4; contador++)
    {
      // Abajo E Izquierda
      g.drawLine(x, y, x, y2 = y + 30 * a);
      g.drawLine(x, y2, x2 = x - 30 * a, y2);

      a += 1;

      // Arriba Y Derecha
      g.drawLine(x2, y2, x2, y2 - 30 * a);
      g.drawLine(x2, y2 - 30 * a, x = x2 + 30 * a, y = y2 - 30 * a);

      a += 1;
    }
  }
}