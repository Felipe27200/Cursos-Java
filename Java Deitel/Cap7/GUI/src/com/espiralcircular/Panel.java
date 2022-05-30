package com.espiralcircular;

import javax.swing.JFrame;

public class Panel
{
  public static void main(String[] args)
  {
    Espiral_Circular panel = new Espiral_Circular();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(270, 300);
    aplicacion.setVisible(true);
  }
}