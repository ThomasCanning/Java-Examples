package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame {

    JButton button;

    Buttons() {

        ImageIcon icon = new ImageIcon("src/testingoutswing/GUI/Logo2.png");

        button = new JButton();
        button.setBounds(200, 100, 300, 150);
        button.addActionListener(e -> System.out.println("Click"));

        button.setText("Click Me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setFont(new Font("Comic Sans",Font.ITALIC, 25));
        button.setBackground((Color.gray));
        button.setBorder(BorderFactory.createCompoundBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    public static void main(String[] args) {
        new Buttons();
    }
}

