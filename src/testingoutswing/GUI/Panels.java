package testingoutswing.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Panels {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("Logo2.png");

        JLabel label = new JLabel();
        label.setText("Hangman");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBounds(100,100,75,75);

        //setting up panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250); //panel position and dimensions
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());


        MyFrame frame = new MyFrame();
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);




    }
}
