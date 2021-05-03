package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonsClass extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;

    RadioButtonsClass() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        burgerButton = new JRadioButton("burger");
        hotdogButton = new JRadioButton("hotdog");
        pizzaButton.setFocusable(false);
        burgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        //pizzaButton.setIcon(...); Use this to set an icon for the button

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add((hotdogButton));

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton)System.out.println("Pizza");
        else if(e.getSource()==burgerButton)System.out.println("Burger");
        else if(e.getSource()==hotdogButton)System.out.println("Hot dog");
        }

    }
