package com.jinzzam.swing.tabbed;

import javax.swing.*;

public class Button1 extends JFrame {

    public static void main(String[] args) {
        new Button1();
    }

    Button1() {
        super("java button ex");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("버튼 여러개 만들기 실습!!", SwingConstants.CENTER);
        jPanel.add(jLabel);
        add(jPanel);

        JButton btn = new JButton("버튼입니당.");
        jPanel.add(btn);


        setSize(300, 300);
        setVisible(true);
    }

}
