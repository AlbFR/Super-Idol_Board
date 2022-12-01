package javaaplication5;

import java.awt.*;
import javax.swing.*;

import javaapplication5.panels.MenuOptions;

public class Ventana extends JFrame {

   public Ventana() {
      super();

      this.setSize(1000, 700);
      this.setLayout(null);
      this.setTitle("Idol Board");

      this.setVisible(true);
      this.setBackground(Color.WHITE);
      try {
         this.add(new MenuOptions());
         this.add(new Canvas());
         // this.getContentPane().add(new javaapplication5.panels.MenuOptions());
         // this.getContentPane().add(new javaapplication5.panels.Canvas());
      }
      catch (Exception e) {
         System.out.println(e);
      }
      this.repaint();
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}