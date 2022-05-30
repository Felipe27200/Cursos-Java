package com.espiralcuadrada;

import javax.swing.JFrame;

public class Panel
{
  public static void main(String[] args)
  {
    Espiral panel = new Espiral();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(225, 255);
    aplicacion.setVisible(true);
  }
}