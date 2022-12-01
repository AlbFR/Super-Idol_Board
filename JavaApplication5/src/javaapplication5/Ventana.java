package javaapplication5;

import java.awt.*;
import javax.swing.*;
// import javaapplication5.panels.*;

import org.w3c.dom.events.MouseEvent;

public class Ventana extends JFrame {
   // JPanel menu;
   JPanel canvas;

   public Ventana() {
      super();

      // menu = new MenuPanel();
      canvas = new javaapplication5.panels.Canvas();

      this.setSize(700, 500);
      this.setLayout(null);
      this.setTitle("Idol Board");


      this.setVisible(true);
      this.setBackground(Color.WHITE);
      this.getContentPane().add(canvas);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      // this.setSize(1150, 700);
   }
}