package com.jinzzam.swing.tabbed-panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DrawingArea extends JPanel implements MouseMotionListener {
    static int N = 50;
    int n = 0;
    private Point p1, p2;
    int xpoints[] = new int[N], ypoints[] = new int[N];

    DrawingArea() {
        setBackground(Color.GREEN);
        setSize(420 - 40 - 20, 250 - 90 - 20);
        setLocation(20, 10);
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        p2 = new Point(e.getX(), e.getY());
        if (n == 0) {
            p1 = p2;
            n = 1;
            xpoints[0] = e.getX();
            ypoints[0] = e.getY();
        }
        if (n >= N)
            for (int i = 1; i < n; i++) {
                xpoints[i - 1] = xpoints[i];
                ypoints[i - 1] = ypoints[i];
            }
        else n++;
        xpoints[n - 1] = e.getX();
        ypoints[n - 1] = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (n > 1) {
            int r = (int) Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + Math.pow(p2.y - p1.y, 2)) * 2;
            g.setColor(Color.RED);
            g.drawOval(p2.x - r, p2.y - r, r * 2, r * 2);
            p1 = p2;
            g.setColor(Color.BLUE);
            g.drawPolyline(xpoints, ypoints, n);
        }
    }
}