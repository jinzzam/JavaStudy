package com.jinzzam.swing.tabbed;

import javax.swing.*;
import java.awt.*;

public class Tabby extends JFrame {
    public static void main(String[] args){
        new Tabby();
    }

    Tabby(){
        super("핵심 자바 tabby panel");
        JLabel cafe = new JLabel("핵심 자바 카페", SwingConstants.CENTER);
        getContentPane().add(cafe, "North");
        JTabbedPane tpane = new JTabbedPane(JTabbedPane.TOP);

        ImageIcon icon0 = new ImageIcon("yes.png");
        tpane.addTab("yes", null, new JLabel(icon0));

        ImageIcon icon1 = new ImageIcon("no.png");
        tpane.addTab("yes", null, new JLabel(icon1));

        ImageIcon icon2 = new ImageIcon("yes.png");
        tpane.addTab("yes", null, new JLabel(icon2));

        JPanel pan = new JPanel(null);
        pan.setBackground(Color.white);
        DrawingArea drawpan = new DrawingArea();
        pan.add(drawpan);

        tpane.addTab("mySpace", null, pan, "마음을 채우라!");
        //tpane.setSelectedIndex(4);

        getContentPane().add(tpane, "Center");
        setSize(420, 350);
        setVisible(true);
    }
}