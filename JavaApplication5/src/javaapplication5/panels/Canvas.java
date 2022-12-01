package javaapplication5.panels;

import java.awt.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;


public class Canvas extends JPanel implements MouseListener {
    private ArrayList<Point> puntos;

   public Canvas() {
      Border border = BorderFactory.createLineBorder(Color.green, 3);
      this.setBounds(0, 0, 700, 500);
      this.setBackground(Color.black);
      this.setBorder(border);
      puntos = new ArrayList<Point>();
   }
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
        System.out.println("Hola xd");
        System.out.println(me);
        // this.repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
        System.out.println("Hola xd");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
        System.out.println("Hola xd");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
        System.out.println("Hola xd");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
        System.out.println("Hola xd");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}