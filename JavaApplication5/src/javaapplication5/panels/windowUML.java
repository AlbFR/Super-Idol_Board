package javaapplication5.panels;

import javax.swing.JButton;
import javax.swing.JFrame;

public class windowUML{
    JFrame frame = new JFrame("UML Options");
    JButton button = new JButton();
    
    windowUML(){
        button.setBounds(100,100,100,100);
        button.setFocusable(false);
        
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
    }
}
