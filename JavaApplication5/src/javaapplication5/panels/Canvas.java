package javaapplication5.panels;

import java.awt.*;
import javax.swing.*;

public class Canvas extends JPanel {
   public Canvas() {
      this.setBounds(50, 0, 350, 200);
      this.setBackground(Color.WHITE);
   }
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}