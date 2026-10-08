import java.awt.*;
import java.awt.event.*;

public class GridLayoutCalculator extends Frame {

    GridLayoutCalculator() {

        // Set GridLayout: 4 rows and 4 columns
        setLayout(new GridLayout(4, 4, 5, 5));

        // Calculator buttons
        Button b1 = new Button("7");
        Button b2 = new Button("8");
        Button b3 = new Button("9");
        Button b4 = new Button("/");

        Button b5 = new Button("4");
        Button b6 = new Button("5");
        Button b7 = new Button("6");
        Button b8 = new Button("*");

        Button b9 = new Button("1");
        Button b10 = new Button("2");
        Button b11 = new Button("3");
        Button b12 = new Button("-");

        Button b13 = new Button("0");
        Button b14 = new Button(".");
        Button b15 = new Button("=");
        Button b16 = new Button("+");

        // Add buttons
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        add(b5);
        add(b6);
        add(b7);
        add(b8);

        add(b9);
        add(b10);
        add(b11);
        add(b12);

        add(b13);
        add(b14);
        add(b15);
        add(b16);

        // Frame properties
        setTitle("Calculator - GridLayout");
        setSize(400, 400);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new GridLayoutCalculator();
    }
}
