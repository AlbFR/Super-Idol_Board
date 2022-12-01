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
        this.setBackground(Color.white);
        this.setBorder(border);
        this.addMouseListener(this);
        puntos = new ArrayList<Point>();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i=0;i<puntos.size();++i) {
            g.drawRect(puntos.get(i).x, puntos.get(i).y, 3, 3);
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
        puntos.add(new Point(me.getX(), me.getY()));
        this.repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {

    }
}