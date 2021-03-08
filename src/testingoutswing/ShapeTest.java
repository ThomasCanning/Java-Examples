package testingoutswing;

import javax.swing.*;
import java.awt.*;

public class ShapeTest extends JFrame{
    public ShapeTest(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new ShapeTest();
    }

    public void paint(Graphics g){
        g.drawOval(1000, 500, 60, 60); //Draw head
        g.drawRect(1025, 560, 10, 200); // Body
        g.drawRect(950, 600, 150, 8); // Arms
    }
}