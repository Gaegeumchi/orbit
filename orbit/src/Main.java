import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Orbit Beta 0.1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel
        JLabel label = new JLabel("Orbit Beta 0.1.0");

        // Set the label's horizontal alignment to CENTER
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Set the label's text color
        label.setForeground(new Color(23, 24, 24));

        // Set the label's background color
        label.setBackground(Color.decode("#171818"));

        // Add the label to the JFrame
        frame.add(label);

        // Set the JFrame's size
        frame.setSize(300, 200);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
