import java.awt.Graphics;
import javax.swing.JPanel;

public class Barras extends JPanel
{
  private int barra1;
  private int barra2;
  private int barra3;
  private int barra4;
  private int barra5;

  public Barras (int barra1, int barra2, int barra3, int barra4, 
  int barra5)
  {
    if (barra1 >= 1 && barra1 <= 30)
      this.barra1 = barra1;

    if (barra2 >= 1 && barra2 <= 30)
      this.barra2 = barra2;

    if (barra3 >= 3 && barra3 <= 30)
      this.barra3 = barra3;

    if (barra4 >= 1 && barra4 <= 30)
      this.barra4 = barra4;

    if (barra5 >= 1 && barra5 <= 30)
      this.barra5 = barra5;
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);


    for (int contador = 1; contador <= 5; contador++)
    {
      switch (contador)
      {
        case 1: 
          g.drawRect(10, 10, barra1 * 10, 50);
          break;

        case 2: 
          g.drawRect(10, 60, barra2 * 10, 50);
          break;
 
        case 3: 
          g.drawRect(10, 110, barra3 * 10, 50);
          break;
 
        case 4: 
          g.drawRect(10, 160, barra4 * 10, 50);
          break;

        case 5: 
          g.drawRect(10, 210, barra5 * 10, 50);
          break;
      }
    }
  }
}