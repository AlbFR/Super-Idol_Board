package javaapplication5.panels.menuOptions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import javaapplication5.buttons.options_buttons.*;;

public class EditionPanel extends JPanel {
   public EditionPanel() {
      super();
      Border border = BorderFactory.createLineBorder(Color.MAGENTA, 2);
      this.setSize(200, 600);
      this.setLayout(new GridLayout(3, 2));
      // this.add(new SetFigureButton());
      this.add(new CreateClassButton());
      this.add(new DrawLineButton());
      this.add(new DrawSquareButton());
      this.add(new SelectEraserButton());
      this.add(new SelectSquareButton());
      this.add(new SelectUMLButton());
      this.setBorder(border);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
