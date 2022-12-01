package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class CreateClassButton extends JButton {
   public CreateClassButton() {
      this.setText("Create Class");
      this.setBackground(new Color(173, 216, 230));
   } 
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
