package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyNewFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyNewFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white); //Colour of text 'cursor'
        textField.setText("Username:");
        textField.setEditable(true);//Could be set to false

        this.add(textField);
        this.add(button);

        this.pack();  //Size of frame adjusts to fit components
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());
            textField.setEditable(false); //Can only enter text once
        }
    }
}
