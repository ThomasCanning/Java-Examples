package testingoutswing.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("Logo2.png");
    ImageIcon image2 = image;
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();
    Point imageCorner1;
    Point imageCorner2;
    Point previousPoint;

    public DragPanel() {

        imageCorner1 = new Point(0,0);
        imageCorner2 = new Point(0, 300);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) { //Repaints image after position is updated
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner1.getX(), (int)imageCorner1.getY());
        image2.paintIcon(this, g, (int)imageCorner2.getX(), (int)imageCorner2.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            previousPoint = e.getPoint(); //updates point to click position
        }

    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();

            imageCorner1.translate(
                    (int)(currentPoint.getX() - previousPoint.getX()),
                    (int)(currentPoint.getY() - previousPoint.getY())
            );
            imageCorner2.translate(
                    (int)(currentPoint.getX() - previousPoint.getX()),
                    (int)(currentPoint.getY() - previousPoint.getY())
            );
            previousPoint = currentPoint;
            repaint();
        }

    }

}
