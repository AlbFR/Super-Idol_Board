package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class setFigureButton extends JButton implements ActionListener {
   public setFigureButton() {
      System.out.println("xd");
      this.setBounds(50, 50, 100, 100);   
      this.setBackground(Color.red);
      this.setText("Set Figure");
      // this.addActionListener();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
   }
}