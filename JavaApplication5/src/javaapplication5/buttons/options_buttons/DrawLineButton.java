package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class DrawLineButton extends JButton {
   public DrawLineButton() {
      this.setBackground(Color.yellow);
      this.setText("Draw Line");
      // this.setSize(50, 50);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}