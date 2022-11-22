package javaapplication5.panels;

import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
   public MenuPanel() {
      this.setBounds(0, 0, 50, 50);
      this.setLayout(new GridLayout());
      this.setBackground(Color.BLACK);
   }
   @Override
   public void paintComponent(Graphics g) {
      try {
         super.paintComponent(g);
         // g.setColor(Color.BLACK);
         // g.fillRect(0,0,50,50);
      }
      catch (Exception e) {
         System.out.println(e);
      }
   }
}