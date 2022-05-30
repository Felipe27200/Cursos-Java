import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    for (int contador = 0; contador < 15; contador++)
    {
      g.drawLine(0, 0, aumentarCoordenada(anchura, contador), disminuirCoordenada(altura, contador));
      g.drawLine(anchura, 0, aumentarCoordenada(anchura, contador), aumentarCoordenada(altura, contador));
      g.drawLine(0, altura, aumentarCoordenada(anchura, contador), aumentarCoordenada(altura, contador));
      g.drawLine(anchura, altura, aumentarCoordenada(anchura, contador), disminuirCoordenada(altura, contador));
    }
  }
  
  public static int disminuirCoordenada(int coordenada, int contador)
  {
	return coordenada * (15 - contador) / 15;
  }
  
  public static int aumentarCoordenada(int coordenada, int contador)
  {
	return coordenada * (17 * contador) / 250;
  }
}