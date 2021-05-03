package testingoutswing.GUI;

import javax.swing.*;

public class DragAndDropClass extends JFrame {

    DragPanel dragPanel1 = new DragPanel();

    DragAndDropClass() {
        this.add(dragPanel1);
        this.setTitle("Drag and Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
