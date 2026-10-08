import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ColorShapes extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(50, 50, 200, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(50, 50, 200, 100);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 24));
		g.drawString("Java Apllets are fun!", 100, 220);
	}
}