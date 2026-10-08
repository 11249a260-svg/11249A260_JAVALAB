import java.applet.Applet;
import java.awt.Graphics;

public class GeometricShapes extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50, 50, 150, 100);
		g.drawString("Rectangle", 90, 170);
		
		g.drawOval(280,50,150,100);
		g.drawString("Circle", 315, 190);

		g.drawLine(50, 250, 200, 250);
		g.drawString("Line", 110, 275);
		
		int x[] = {350,300,400};
		int y[] = {230, 330, 330};

		g.drawPolygon(x, y, 3);
		g.drawString("Traingle", 335, 350);
	}
}
		