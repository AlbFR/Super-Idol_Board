package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class SetFigureButton extends JButton implements ActionListener {
   public SetFigureButton() {
      // this.setSize(50, 50);
      this.setBackground(Color.red);
      this.setText("Set Figure");
      // this.addActionListener();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
   }
}