package com.chessence.gui.pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreenPanel extends JPanel implements ActionListener {
    private JFrame frame;
    public JButton button = new JButton();
    private CardLayout cardLayout;


    public GameScreenPanel(JFrame frame, CardLayout cardLayout){
        this.frame = frame;
        this.cardLayout = cardLayout;

        this.setLayout(null);

        //Design this panel here:
        this.setBackground(new Color(0x734046));
        button.setBounds(500, 500, 100,50);
        button.addActionListener(this);
        button.setText("EXIT");
        this.add(button);

        JLabel label = new JLabel();
        label.setText("Game Screen Panel");
        label.setBounds(500, 0, 500, 100);
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label.setForeground(Color.black);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Button clicked!");
            frame.dispose();
        }
    }
}
