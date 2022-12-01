package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class SelectSquareButton extends JButton {
   public SelectSquareButton() {
      // this.setSize(50, 50);
      this.setBackground(new Color(173, 216, 230));
      this.setText("Select Square");
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}