package javaapplication5;

import java.awt.*;
import javax.swing.*;
import javaapplication5.panels.*;

public class Ventana extends JFrame {
   JPanel menu;
   JPanel canvas;

   public Ventana() {
      super();

      menu = new MenuPanel();
      canvas = new javaapplication5.panels.Canvas();

      this.setLayout(new BorderLayout());
      this.setTitle("Idol Board");


      this.setSize(350, 200);
      this.setVisible(true);
      this.setBackground(Color.WHITE);
      this.getContentPane().add(menu);
      this.repaint();
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      // this.setSize(1150, 700);
   }
}