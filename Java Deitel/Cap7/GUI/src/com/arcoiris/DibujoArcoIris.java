package com.arcoiris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujoArcoIris extends JPanel
{
  private final static Color VIOLETA = new Color(128, 0, 128);
  private final static Color INDIGO = new Color(75, 0, 130);

  private Color[] colores =
     {  Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, 
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

  public DibujoArcoIris()
  {
    setBackground(Color.WHITE);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int radio = 20;

    int centroX = getWidth() / 2;
    int centroY = getHeight() - 10;

    for (int contador = colores.length; contador > 0; contador--)
    {
      g.setColor(colores[contador - 1]);

      g.fillArc(centroX - contador * radio,
        centroY - contador * radio,
        contador * radio * 2, contador * radio * 2, 0, 180);
    }
  }
  
}