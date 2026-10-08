import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample extends Frame {

    FlowLayoutExample() {
        // Set FlowLayout
        setLayout(new FlowLayout());

        // Create buttons
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");

        // Add buttons to the frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        // Set frame properties
        setTitle("Flow Layout Example");
        setSize(400, 200);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}