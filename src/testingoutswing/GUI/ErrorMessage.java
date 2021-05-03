package testingoutswing.GUI;

import javax.swing.*;

public class ErrorMessage {

    public static void main(String[] args) {
        while (true)
            JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!", "WARNING!", JOptionPane.WARNING_MESSAGE);
    }
}