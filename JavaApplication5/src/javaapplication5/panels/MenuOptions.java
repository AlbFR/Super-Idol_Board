package javaapplication5.panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import javaapplication5.panels.menuOptions.EditionPanel;;

public class MenuOptions extends JPanel {
   public MenuOptions() {
      Border border = BorderFactory.createLineBorder(Color.red, 2);
      this.setBackground(Color.white);
      this.setBorder(border);
      this.setBounds(0, 0, 200, 500);

      try {
         this.add(new EditionPanel());
      }
      catch (Exception e) {
         System.out.println(e);
      }
   }   
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}