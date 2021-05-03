package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerClass extends JFrame implements KeyListener {

    JLabel label;

    KeyListenerClass() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX()-5, label.getY());
            break;
            case 'w' : label.setLocation(label.getX(), label.getY()-5);
            break;
            case 's' : label.setLocation(label.getX(), label.getY()+5);
            break;
            case 'd' : label.setLocation(label.getX()+5, label.getY());
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a key is pressed down. Uses keycode, int output
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Invoked when a key is released
        System.out.println("You released a key character " + e.getKeyChar());
        System.out.println(e.getKeyChar() + " Has key code " + e.getKeyCode());
    }
}
