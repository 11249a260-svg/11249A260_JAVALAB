import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends Frame {

    BorderLayoutExample() {

        // Set BorderLayout
        setLayout(new BorderLayout());

        // Create components
        Label header = new Label("APPLICATION DASHBOARD", Label.CENTER);
        Label footer = new Label("Copyright 2026", Label.CENTER);

        Button menu = new Button("MENU");
        Button east = new Button("EAST");

        TextArea content = new TextArea(
            "Welcome to the Application Dashboard!\n\n" +
            "This is the main content area."
        );

        // Add components to BorderLayout regions
        add(header, BorderLayout.NORTH);
        add(footer, BorderLayout.SOUTH);
        add(menu, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(content, BorderLayout.CENTER);

        // Set frame properties
        setTitle("BorderLayout Dashboard");
        setSize(600, 400);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
