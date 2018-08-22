import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
public class circle extends Applet {

	 public void paint (Graphics g)
	  {	
	    g.drawOval(150,50,90,90);
	    g.setColor(Color.yellow);
	    g.fillOval(150,50,90,90);
	    g.drawArc(270, 50, 90, 90, 0, 180);
	    g.drawRoundRect(270,95,90,0,0,0);
	    g.setColor(Color.green);
	    g.fillArc(270, 50, 90,90,0,180);
	    g.drawArc(400, 50, 90,90, 0, -180);
	    g.drawRoundRect(400,95,90,0,0,0);
	    g.setColor(Color.blue);
	    g.fillArc(400, 50, 90,90,0, -180);
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
