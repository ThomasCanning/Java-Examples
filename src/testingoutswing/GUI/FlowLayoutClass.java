package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutClass {

    public static void main(String[] args) {

        //Layout manager = defines the natural layout for components within a container

        //Flow layout = places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small.
        //              The flow layout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,0,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        for(int i=1; i<=9;i++) panel.add(new JButton(String.valueOf(i)));

        frame.add(panel);
        frame.setVisible(true);



    }
}
