import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class FigurasAleatorias extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    SecureRandom aleatorio = new SecureRandom(); 

    for (int contador = 1; contador <= 10; contador++)
    {
      // Rangos y números para los colores.
      int r = aleatorio.nextInt(225);
      int v = aleatorio.nextInt(225);
      int b = aleatorio.nextInt(225);

    Color colores = new Color(r, v, b);

      g.setColor(colores);

      switch (aleatorio.nextInt(2))
      {
        case 0:
          g.fillOval(aleatorio.nextInt(250), aleatorio.nextInt(250),
            aleatorio.nextInt(125), aleatorio.nextInt(125));
          break;

        case 1:
          g.fillRect(aleatorio.nextInt(250), aleatorio.nextInt(250),
            aleatorio.nextInt(125), aleatorio.nextInt(125));
          break;
      }
    }
  }
}