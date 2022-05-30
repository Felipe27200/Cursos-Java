import java.awt.Graphics;
import javax.swing.JPanel;

public class ProyectoGUI
extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    for (int contador = 0; contador < 15; contador++)
    {
      g.drawLine(anchura, disminuirCoordenada(altura, contador), disminuirCoordenada(anchura, contador), 0);
      g.drawLine(anchura, aumentarCoordenada(altura, contador), disminuirCoordenada(anchura, contador), altura);
      g.drawLine(0, disminuirCoordenada(altura, contador), aumentarCoordenada(anchura, contador), 0);
      g.drawLine(0, disminuirCoordenada(altura, contador), disminuirCoordenada(anchura, contador), altura);
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