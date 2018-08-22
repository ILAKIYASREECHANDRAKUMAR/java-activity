import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class circle extends JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
	      f.setSize(100,200);
	      f.add(new circle());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	   }
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

	}
