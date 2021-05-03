package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutClass {

    public static void main(String[] args) {

        //Layout manager = defines the natural layout for components within a container

        //Flow layout = places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small.
        //              The flow layout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(5,2));

        for(int i=1; i<=10;i++) frame.add(new JButton(String.valueOf(i)));

        frame.setVisible(true);



    }
}
