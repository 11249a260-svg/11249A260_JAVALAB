import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HumanFace extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(100, 50, 300, 300);

		g.setColor(Color.WHITE);
		g.fillOval(160, 120, 50, 40);
		g.fillOval(290, 120, 50, 40);

		g.setColor(Color.BLACK);
		g.fillOval(178, 132, 15, 20);
		g.fillOval(308, 132, 15, 20);

		g.drawLine(250, 160, 230, 220);
		g.drawLine(230, 220, 260, 220);

		g.drawArc(180, 220, 140, 70, 180, 180);
		
		g.drawString("Simple Human Face", 190, 380);
	}
}