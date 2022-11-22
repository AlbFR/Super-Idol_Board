package javaapplication5;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
   public Ventana() {
      super();

      this.setLayout(new BorderLayout());
      this.setTitle("Idol Board");

      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(1000, 500);
      this.setVisible(true);
   }
}