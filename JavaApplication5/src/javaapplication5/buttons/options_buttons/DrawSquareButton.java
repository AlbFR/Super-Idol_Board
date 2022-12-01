package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class DrawSquareButton extends JButton {
   public DrawSquareButton() {
      this.setSize(50, 50);
      this.setBackground(Color.black);
      this.setText("Draw Square");
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}