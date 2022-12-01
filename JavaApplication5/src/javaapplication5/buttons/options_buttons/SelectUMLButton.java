package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
public class SelectUMLButton extends JButton {
   public SelectUMLButton() {
      this.setBackground(Color.lightGray);
      this.setText("Select UML");
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}